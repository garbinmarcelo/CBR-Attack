package cbr;

import java.util.Collection;

import config.SolutionDescription;
import jcolibri.method.retrieve.RetrievalResult;
import models.Passos;

public class SolPassos {
	
	public String getSolucao(RetrievalResult cd) {
		// Transforma em solucao do caso recuperado 
		SolutionDescription solucao = (SolutionDescription) cd.get_case().getSolution();
		
		String solucaoFinal = "";
		
		if(solucao.getPasso1() != 0) solucaoFinal += "\n 1 - " + new Passos().getPasso(solucao.getPasso1());
		if(solucao.getPasso2() != 0) solucaoFinal += "\n 2 - " + new Passos().getPasso(solucao.getPasso2());
		if(solucao.getPasso3() != 0) solucaoFinal += "\n 3 - " + new Passos().getPasso(solucao.getPasso3());
		if(solucao.getPasso4() != 0) solucaoFinal += "\n 4 - " + new Passos().getPasso(solucao.getPasso4());
		if(solucao.getPasso5() != 0) solucaoFinal += "\n 5 - " + new Passos().getPasso(solucao.getPasso5());
		if(solucao.getPasso6() != 0) solucaoFinal += "\n 6 - " + new Passos().getPasso(solucao.getPasso6());
		if(solucao.getPasso7() != 0) solucaoFinal += "\n 7 - " + new Passos().getPasso(solucao.getPasso7());
		if(solucao.getPasso8() != 0) solucaoFinal += "\n 8 - " + new Passos().getPasso(solucao.getPasso8());
		if(solucao.getPasso9() != 0) solucaoFinal += "\n 9 - " + new Passos().getPasso(solucao.getPasso9());
		if(solucao.getPasso10() != 0) solucaoFinal += "\n 10 - " + new Passos().getPasso(solucao.getPasso10());
		if(solucao.getPasso11() != 0) solucaoFinal += "\n 11 - " + new Passos().getPasso(solucao.getPasso11());
		if(solucao.getPasso12() != 0) solucaoFinal += "\n 12 - " + new Passos().getPasso(solucao.getPasso12());
		if(solucao.getPasso13() != 0) solucaoFinal += "\n 13 - " + new Passos().getPasso(solucao.getPasso13());
		if(solucao.getPasso14() != 0) solucaoFinal += "\n 14 - " + new Passos().getPasso(solucao.getPasso14());
	
		return solucaoFinal;
	}
	
	public String getSolucao(Collection<RetrievalResult> collection) {

		String solucaoFinal = "";
		
		for(RetrievalResult nse: collection) {
			SolutionDescription solucao = (SolutionDescription) nse.get_case().getSolution();
			if(solucao.getPasso1() != 0) solucaoFinal += "\n 1 - " + new Passos().getPasso(solucao.getPasso1());
			if(solucao.getPasso2() != 0) solucaoFinal += "\n 2 - " + new Passos().getPasso(solucao.getPasso2());
			if(solucao.getPasso3() != 0) solucaoFinal += "\n 3 - " + new Passos().getPasso(solucao.getPasso3());
			if(solucao.getPasso4() != 0) solucaoFinal += "\n 4 - " + new Passos().getPasso(solucao.getPasso4());
			if(solucao.getPasso5() != 0) solucaoFinal += "\n 5 - " + new Passos().getPasso(solucao.getPasso5());
			if(solucao.getPasso6() != 0) solucaoFinal += "\n 6 - " + new Passos().getPasso(solucao.getPasso6());
			if(solucao.getPasso7() != 0) solucaoFinal += "\n 7 - " + new Passos().getPasso(solucao.getPasso7());
			if(solucao.getPasso8() != 0) solucaoFinal += "\n 8 - " + new Passos().getPasso(solucao.getPasso8());
			if(solucao.getPasso9() != 0) solucaoFinal += "\n 9 - " + new Passos().getPasso(solucao.getPasso9());
			if(solucao.getPasso10() != 0) solucaoFinal += "\n 10 - " + new Passos().getPasso(solucao.getPasso10());
			if(solucao.getPasso11() != 0) solucaoFinal += "\n 11 - " + new Passos().getPasso(solucao.getPasso11());
			if(solucao.getPasso12() != 0) solucaoFinal += "\n 12 - " + new Passos().getPasso(solucao.getPasso12());
			if(solucao.getPasso13() != 0) solucaoFinal += "\n 13 - " + new Passos().getPasso(solucao.getPasso13());
			if(solucao.getPasso14() != 0) solucaoFinal += "\n 14 - " + new Passos().getPasso(solucao.getPasso14());
		}
		
		return solucaoFinal;
	}
}