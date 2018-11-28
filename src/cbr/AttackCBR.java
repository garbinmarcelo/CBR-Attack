package cbr;

import java.util.Collection;

import config.CaseDescription;
import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.RetrievalResult;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import jcolibri.method.retrieve.selection.SelectCases;

public class AttackCBR implements StandardCBRApplication {

	private Connector connector;
	private CBRCaseBase casebase;
	private RetrievalResult bestCase = null;
	private Integer kCases = 3;
	private Collection<RetrievalResult> eval;
	private Collection<RetrievalResult> selectedCases;

	//private CaseDescription description;
	/*
	private Collection<RetrievalResult> eval;
	private Collection<CBRCase> selectedCases;
	private Collection<CBRCase> combinedCases;
	 */

	/**
	 * Configuration
	 */
	@Override
	public void configure() throws ExecutionException {
		try {
			configureConnector();
			configureCaseBase();
		} catch (Exception e) {
			throw new ExecutionException(e);
		}
	}

	/**
	 * Configures the connector
	 */
	private void configureConnector() throws InitializingException {
		connector = new jcolibri.connector.PlainTextConnector();
		connector.initFromXMLfile(jcolibri.util.FileIO
				.findFile("config/plaintextconfig.xml"));
	}

	/**
	 * Configures the case base
	 */
	private void configureCaseBase() throws InitializingException {
		casebase = new jcolibri.casebase.LinearCaseBase();
	}

	/**
	 * Similarity
	 * Configures the similarity
	 */
	private NNConfig getSimilarityConfig() {
		NNConfig simConfig = new NNConfig();
		return simConfig;
	}

	/**
	 * preCycle
	 */
	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		casebase.init(connector);
		return casebase;
	}

	/**
	 * cycle
	 */
	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
		// Obtain configuration for KNN
		NNConfig simConfig = this.getSimilarityConfig();
		simConfig.setDescriptionSimFunction(new Average());

		/**
		 *  Set config Weight
		 *  tipo,ipOrigem,portaOrigem,urlAfetada,hostnameOrigem,ipDestino,portaDestino,hostnameDestino,malware,protocolo,sistemaOperacional
		 */
		PesosAtributos pesos = new PesosAtributos(
				1.0, // tipo
				1.0, // ipOrigem
				1.0, // portaOrigem
				1.0, // hostnameOrigem
				1.0, // ipDestino
				1.0, // portaDestino
				1.0, // malware
				1.0, // protocolo
				1.0 // sistemaOperacional
		);

		/**
		 *  Set config similarity
		 */
		Attribute tipo = new Attribute("tipo", CaseDescription.class);
		simConfig.addMapping(tipo, new Equal());
		simConfig.setWeight(tipo, pesos.getTipo());

		Attribute ipOrigem = new Attribute("ipOrigem", CaseDescription.class);
		simConfig.addMapping(ipOrigem, new Equal());
		simConfig.setWeight(ipOrigem, pesos.getIpOrigem());

		Attribute portaOrigem = new Attribute("portaOrigem", CaseDescription.class);
		simConfig.addMapping(portaOrigem, new Interval(64406));
		simConfig.setWeight(portaOrigem, pesos.getPortaOrigem());

		Attribute hostnameOrigem = new Attribute("hostnameOrigem", CaseDescription.class);
		simConfig.addMapping(hostnameOrigem, new Equal());
		simConfig.setWeight(hostnameOrigem, pesos.getHostnameOrigem());

		Attribute ipDestino = new Attribute("ipDestino", CaseDescription.class);
		simConfig.addMapping(ipDestino, new Equal());
		simConfig.setWeight(ipDestino, pesos.getIpDestino());

		Attribute portaDestino = new Attribute("portaDestino", CaseDescription.class);
		simConfig.addMapping(portaDestino, new Interval(9674));
		simConfig.setWeight(portaDestino, pesos.getPortaDestino());

		Attribute malware = new Attribute("malware", CaseDescription.class);
		simConfig.addMapping(malware, new Equal());
		simConfig.setWeight(malware, pesos.getMalware());

		Attribute protocolo = new Attribute("protocolo", CaseDescription.class);
		simConfig.addMapping(protocolo, new Equal());
		simConfig.setWeight(protocolo, pesos.getProtocolo());

		Attribute sistemaOperacional = new Attribute("sistemaOperacional", CaseDescription.class);
		simConfig.addMapping(sistemaOperacional, new Equal());
		simConfig.setWeight(sistemaOperacional, pesos.getSistemaOperacional());

		// Execute NN
		Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(casebase.getCases(), query, simConfig);
		
		// Select k cases
		Collection<RetrievalResult> selectedCases = SelectCases.selectTopKRR(eval, this.kCases);

		/**
		 * Set Eval
		 */
		this.setEval(eval);

		/**
		 * Set SelectedCases
		 */
		this.setSelectedCases(selectedCases);
		
		/**
		 * Set BestCase
		 */
		this.setBestCase(selectedCases.iterator().next());
		
		/**
		 *  Show Weight attributes
		 */
		/*
		System.out.println("Peso tipo: " + simConfig.getWeight(tipo));
		System.out.println("Peso ipOrigem: " + simConfig.getWeight(ipOrigem));
		System.out.println("Peso portaOrigem: " + simConfig.getWeight(portaOrigem));
		System.out.println("Peso urlAfetada: " + simConfig.getWeight(urlAfetada));
		System.out.println("Peso hostnameOrigem: " + simConfig.getWeight(hostnameOrigem));
		System.out.println("Peso ipDestino: " + simConfig.getWeight(ipDestino));
		System.out.println("Peso portaDestino: " + simConfig.getWeight(portaDestino));
		System.out.println("Peso hostnameDestino: " + simConfig.getWeight(hostnameDestino));
		System.out.println("Peso malware: " + simConfig.getWeight(malware));
		System.out.println("Peso protocolo: " + simConfig.getWeight(protocolo));
		System.out.println("Peso sistemaOperacional: " + simConfig.getWeight(sistemaOperacional));
		*/

		/*
		// Show retrieved cases 
		System.out.println("Show retrieved cases(" + eval.size() + "): ");
		for (final RetrievalResult rrc: eval) {
			System.out.println(rrc);
		}
		*/
		
		// Show selected Case
		/*
		System.out.println("Show retrieved cases(" + selectedCases.size() + "): ");
		for (final RetrievalResult rrc: selectedCases) {
			System.out.println(rrc);
		}
		*/
		
		 
		return;
	}

	@Override
	public void postCycle() throws ExecutionException {
		this.connector.close();
	}

	public RetrievalResult getBestCase() {
		return bestCase;
	}

	public void setBestCase(RetrievalResult bestCase) {
		this.bestCase = bestCase;
	}

	public Collection<CBRCase> getCasebase() {
		return this.casebase.getCases();
	}

	public void setCasebase(CBRCaseBase casebase) {
		this.casebase = casebase;
	}

	public Collection<RetrievalResult> getEval() {
		return eval;
	}

	public void setEval(Collection<RetrievalResult> eval) {
		this.eval = eval;
	}
	
	public Collection<RetrievalResult> getSelectedCases() {
		return selectedCases;
	}

	public void setSelectedCases(Collection<RetrievalResult> selectedCases) {
		this.selectedCases = selectedCases;
	}
	
	public static void main(String[] args){
		/*
		AttackCBR cbr = new AttackCBR();
		//IpToDecimal ip = new IpToDecimal();
		//System.out.println(ip.longToIp(Long.parseLong("3356633862")));

	
		try {
			cbr.configure();
			cbr.preCycle();
	
			CaseDescription consulta = new CaseDescription();
			consulta.setTipo(1);
			consulta.setIpOrigem(Long.valueOf("3356633862"));
			consulta.setPortaOrigem(55605);
			consulta.setHostnameOrigem(28);
			consulta.setIpDestino(Long.valueOf("3356633862"));
			consulta.setPortaDestino(80);
			consulta.setMalware(4);
			consulta.setProtocolo(0);
			consulta.setSistemaOperacional(1);

			System.out.println("Consulta: " + consulta);

			CBRQuery query = new CBRQuery();
			query.setDescription(consulta);
			
			cbr.cycle(query);
			
			//System.out.println("MAIN CBR");
			//System.out.println(cbr.getBestCase().getEval());
			//System.out.println(cbr.getSelectedCases().size());
			//System.out.println(cbr.getEval());
			//System.out.println(cbr.getCasebase().size());
			//System.out.println(cbr.casebase);
			
			// list case base
			// System.out.println(caseBase.getCases().size());
			// for (CBRCase c : caseBase.getCases()) {
			//	System.out.println(c);
			// }
		
			

		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		*/
	}
}