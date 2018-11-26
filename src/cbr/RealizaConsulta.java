package cbr;

import config.CaseDescription;

public class RealizaConsulta {

	public String realizaConsulta(Integer tipo,
			Integer ipOrigem,
			Integer portaOrigem,
			Integer urlAfetada,
			Integer hostnameOrigem,
			Integer ipDestino,
			Integer portaDestino,
			Integer hostnameDestino,
			String malware,
			String protocolo,
			Integer sistemaOperacional) {
		
		// seta os atributos da consulta
		CaseDescription consulta = new CaseDescription();
		consulta.setTipo(tipo);
		consulta.setIpOrigem(ipOrigem);
		consulta.setPortaOrigem(portaOrigem);
		consulta.setUrlAfetada(urlAfetada);
		consulta.setHostnameOrigem(hostnameOrigem);
		consulta.setIpDestino(ipDestino);
		consulta.setPortaDestino(portaDestino);
		consulta.setHostnameDestino(hostnameDestino);
		consulta.setMalware(malware);
		consulta.setProtocolo(protocolo);
		consulta.setSistemaOperacional(sistemaOperacional);
	
		
		// faz a consulta e retorna para o caseDescription de 1 resultado
		CaseDescription descriptionSolucao = new CaseDescription();
		descriptionSolucao = new AttackCBR().getBestResult(consulta);
		return new SolPassos().getSolucao(descriptionSolucao);
		
		/*
		// faz a consulta e retorna para o caseDescription de varios resultados
		List<CaseDescription> descriptionSolucoes = new ArrayList<CaseDescription>();
		descriptionSolucoes = new AttackCBR().getResults(consulta);
		return new SolPassos().getSolucao(descriptionSolucoes);
		*/
		}

	public static void main(String[] args) {
		System.out.println("-- Realiza Consulta --");
		//System.out.println(new RealizaConsulta().realizaConsulta("Tentativa de Login", 48, null, 70, null, null, null, null, null, null, null));
		System.out.println(new RealizaConsulta().realizaConsulta(1, 44, 50663, 36, 24, 65, 80, null, "Bedep", null, 1));
		System.out.println("-- Fim Consulta --");
	}
}
