package cbr;

import java.util.Collection;

import config.CaseDescription;
import helper.IpToDecimal;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.exception.ExecutionException;
import jcolibri.method.retrieve.RetrievalResult;

public class RealizaConsulta {

	public Collection<RetrievalResult> realizaConsulta(Integer tipo,
			Long ipOrigem,
			Integer portaOrigem,
			Integer hostnameOrigem,
			Long ipDestino,
			Integer portaDestino,
			Integer malware,
			Integer protocolo,
			Integer sistemaOperacional) {

		System.out.println("Setando consulta...");
		AttackCBR cbr = new AttackCBR();
		try {
			cbr.configure();
			cbr.preCycle();
	
			CaseDescription consulta = new CaseDescription();
			consulta.setTipo(tipo);
			consulta.setIpOrigem(ipOrigem);
			consulta.setPortaOrigem(portaOrigem);
			consulta.setHostnameOrigem(hostnameOrigem);
			consulta.setIpDestino(ipDestino);
			consulta.setPortaDestino(portaDestino);
			consulta.setMalware(malware);
			consulta.setProtocolo(protocolo);
			consulta.setSistemaOperacional(sistemaOperacional);

			CBRQuery query = new CBRQuery();
			query.setDescription(consulta);
			
			System.out.println("Query: " + query);
			cbr.cycle(query);
			
			/**
			 * solucao do melhor caso
			 */
			//System.out.println(new SolPassos().getSolucao(cbr.getBestCase()));
			
			/**
			 * solucao de varios casos
			 */		
			for(RetrievalResult nse: cbr.getSelectedCases()) {
				CaseDescription result = (CaseDescription) nse.get_case().getDescription();
				System.out.println("ID: " + result.getId() +" com similaridade de " + nse.getEval());
				System.out.println("Solução: " + new SolPassos().getSolucao(nse));
				System.out.println("---------------------------------");
			}
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		return cbr.getSelectedCases();
	}

	public static void main(String[] args) {
		System.out.println("-- Realiza Consulta --");
		RealizaConsulta consulta = new RealizaConsulta();
		//System.out.println(new IpToDecimal().longToIp(3356634396L));
		//consulta.realizaConsulta(8,3356634396L,0,0,0L,0,0,0,0); // 100% ID 85 - ip 200.18.45.28
		//consulta.realizaConsulta(1, Long.valueOf("3356633862"), 55605, 28, Long.valueOf("3356633862"), 80, 4, 0, 1);
	}
}
