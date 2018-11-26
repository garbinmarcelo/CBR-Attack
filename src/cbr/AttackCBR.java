package cbr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import config.CaseDescription;
import jcolibri.casebase.LinealCaseBase;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.connector.PlainTextConnector;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.selection.SelectCases;

public class AttackCBR {

	Connector _connector;
	CBRCaseBase _caseBase;
	CaseDescription best_case = null;
	CaseDescription estadoConsulta = null;
	CBRCaseBase casebase;

	int passos = 0;

	public void initialize() throws ExecutionException {
		try{
			_connector = new PlainTextConnector();
			_connector.initFromXMLfile(jcolibri.util.FileIO.findFile("config/plaintextconfig.xml"));
			_caseBase  = new LinealCaseBase();
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	public CBRCaseBase openConnection() throws ExecutionException {
		_caseBase.init(_connector);
		//		        java.util.Collection<CBRCase> cases = _caseBase.getCases();
		//		        CaseDescription bc = null;
		//		        for(CBRCase c: cases) {
		//		            bc = (CaseDescription) c.getDescription();
		//		            System.out.println(bc.getTipo());
		//		        }
		return _caseBase;
	}

	public void closeConnection() throws ExecutionException {
		_connector.close();
	}

	public Collection<RetrievalResult> executeQueryConsultaOqueFazer(CBRQuery query) throws ExecutionException {
		NNConfig simConfig = new NNConfig();
		simConfig.setDescriptionSimFunction(new Average());

		/*
			Attribute tipo = new Attribute("tipo", CaseDescription.class); 
			simConfig.addMapping(tipo, new Equal());
	
			Attribute ipOrigem = new Attribute("ipOrigem", CaseDescription.class); 
			simConfig.addMapping(ipOrigem, new Equal());
	
			Attribute portaOrigem = new Attribute("portaOrigem", CaseDescription.class); 
			simConfig.addMapping(portaOrigem, new Equal());
	
			Attribute urlAfetada = new Attribute("urlAfetada", CaseDescription.class); 
			simConfig.addMapping(urlAfetada, new Equal());
	
			Attribute hostnameOrigem = new Attribute("hostnameOrigem", CaseDescription.class); 
			simConfig.addMapping(hostnameOrigem, new Equal());
	
			Attribute ipDestino = new Attribute("ipDestino", CaseDescription.class); 
			simConfig.addMapping(ipDestino, new Equal());
	
			Attribute portaDestino = new Attribute("portaDestino", CaseDescription.class); 
			simConfig.addMapping(portaDestino, new Equal());
	
			Attribute hostnameDestino = new Attribute("hostnameDestino", CaseDescription.class); 
			simConfig.addMapping(hostnameDestino, new Equal());
	
			Attribute malware = new Attribute("malware", CaseDescription.class); 
			simConfig.addMapping(malware, new Equal());
	
			Attribute protocolo = new Attribute("protocolo", CaseDescription.class); 
			simConfig.addMapping(protocolo, new Equal());
	
			Attribute sistemaOperacional = new Attribute("sistemaOperacional", CaseDescription.class); 
			simConfig.addMapping(sistemaOperacional, new Equal());
		 */

		Attribute tipo = new Attribute("tipo", CaseDescription.class); 
		simConfig.addMapping(tipo, new Equal());

		Attribute ipOrigem = new Attribute("ipOrigem", CaseDescription.class); 
		simConfig.addMapping(ipOrigem, new Interval(90));

		Attribute portaOrigem = new Attribute("portaOrigem", CaseDescription.class); 
		simConfig.addMapping(portaOrigem, new Equal());

		Attribute urlAfetada = new Attribute("urlAfetada", CaseDescription.class); 
		simConfig.addMapping(urlAfetada, new Interval(90));

		Attribute hostnameOrigem = new Attribute("hostnameOrigem", CaseDescription.class); 
		simConfig.addMapping(hostnameOrigem, new Interval(34));

		Attribute ipDestino = new Attribute("ipDestino", CaseDescription.class); 
		simConfig.addMapping(ipDestino, new Equal());

		Attribute portaDestino = new Attribute("portaDestino", CaseDescription.class); 
		simConfig.addMapping(portaDestino, new Equal());

		Attribute hostnameDestino = new Attribute("hostnameDestino", CaseDescription.class); 
		simConfig.addMapping(hostnameDestino, new Interval(25));

		Attribute malware = new Attribute("malware", CaseDescription.class); 
		simConfig.addMapping(malware, new Equal());

		Attribute protocolo = new Attribute("protocolo", CaseDescription.class); 
		simConfig.addMapping(protocolo, new Equal());

		Attribute sistemaOperacional = new Attribute("sistemaOperacional", CaseDescription.class); 
		simConfig.addMapping(sistemaOperacional, new Equal());

		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);

		// Select k cases
		eval = SelectCases.selectTopKRR(eval, 5);

		// Print the retrieval
		//		 System.out.println("Retrieved cases:");
		//		        for(RetrievalResult nse: eval) {
		//		            CaseDescription result = (CaseDescription) nse.get_case().getDescription();
		//		            // System.out.println(result.getCASEID()+" -> "+nse.getEval());
		//		        }

		// save best case
		// best_case = eval.get(0);
		return eval;
	}

	public AttackCBR() {
		try {
			initialize();
			openConnection();
		} catch (ExecutionException e) {
			org.apache.commons.logging.LogFactory.getLog(AttackCBR.class).error(e);
		}
	}

	//
	//
	//
	public CaseDescription getBestResult(CaseDescription game_state) {
		System.out.println("Fazendo uma nova consulta...");
		try {
			CaseDescription queryDesc = game_state;
			CBRQuery query = new CBRQuery();
			query.setDescription(queryDesc);
			Collection<RetrievalResult> results = executeQueryConsultaOqueFazer(query);

			best_case = (CaseDescription) results.iterator().next().get_case().getDescription();
			//System.out.print("Melhor caso encontrado: " + best_case.CASEID);
			System.out.print("Melhor caso encontrado: " + best_case.getCASEID());
			System.out.println(" com similaridade: " + results.iterator().next().getEval());
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
			org.apache.commons.logging.LogFactory.getLog(AttackCBR.class).error(e);
		}

		return best_case;
	}

	public List<CaseDescription> getResults(CaseDescription game_state) {
		System.out.println("Fazendo uma nova consulta...");
		List<CaseDescription> casos = new ArrayList<CaseDescription>();
		try {
			CaseDescription queryDesc = game_state;
			CBRQuery query = new CBRQuery();
			query.setDescription(queryDesc);
			
			Collection<RetrievalResult> results = executeQueryConsultaOqueFazer(query);

			System.out.println(results.size() + " casos retornados:");
			for(RetrievalResult nse: results) {
				CaseDescription result = (CaseDescription) nse.get_case().getDescription();
				System.out.println("ID: " + result.getCASEID()+" com similaridade de " + nse.getEval());
				casos.add(result);
			}
			//System.out.println(casos);
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
			org.apache.commons.logging.LogFactory.getLog(AttackCBR.class).error(e);
		}
		return casos;
	}

	public String qualPassoParaResolverOproblema(CaseDescription cd) {
		String oQueFazer=null;

		//oQueFazer = getBestResult(cd);

		return oQueFazer;

	}

	public static void main(String[] args) {
		System.out.println("Rodando Class AttackCBR");
	}
}
