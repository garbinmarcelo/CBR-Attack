package cbr;

import java.util.List;

import config.CaseDescription;

public class SolPassos {

	public String getSolucao(CaseDescription cd) {

		String solucaoFinal = "";
		if(cd.getPasso1() != null) solucaoFinal += "\n 1 - " + new PassosModelo().consultarPasso(1);
		if(cd.getPasso2() != null) solucaoFinal += "\n 2 - " + new PassosModelo().consultarPasso(2);
		if(cd.getPasso3() != null) solucaoFinal += "\n 3 - " + new PassosModelo().consultarPasso(3);
		if(cd.getPasso4() != null) solucaoFinal += "\n 4 - " + new PassosModelo().consultarPasso(4);
		if(cd.getPasso5() != null) solucaoFinal += "\n 5 - " + new PassosModelo().consultarPasso(5);
		if(cd.getPasso6() != null) solucaoFinal += "\n 6 - " + new PassosModelo().consultarPasso(6);
		if(cd.getPasso7() != null) solucaoFinal += "\n 7 - " + new PassosModelo().consultarPasso(7);
		if(cd.getPasso8() != null) solucaoFinal += "\n 8 - " + new PassosModelo().consultarPasso(8);
		if(cd.getPasso9() != null) solucaoFinal += "\n 9 - " + new PassosModelo().consultarPasso(9);
		if(cd.getPasso10() != null) solucaoFinal += "\n 10 - " + new PassosModelo().consultarPasso(10);
		if(cd.getPasso11() != null) solucaoFinal += "\n 11 - " + new PassosModelo().consultarPasso(11);
		if(cd.getPasso12() != null) solucaoFinal += "\n 12 - " + new PassosModelo().consultarPasso(12);
		if(cd.getPasso13() != null) solucaoFinal += "\n 13 - " + new PassosModelo().consultarPasso(13);
		if(cd.getPasso14() != null) solucaoFinal += "\n 14 - " + new PassosModelo().consultarPasso(14);

		return solucaoFinal;
	}



	public String getSolucao(List<CaseDescription> listaCasos) {
		String solucaoFinal = "";	
		for(CaseDescription cd : listaCasos) {
			if(cd.getPasso1() != null) solucaoFinal += "\n 1 - " + new PassosModelo().consultarPasso(1);
			if(cd.getPasso2() != null) solucaoFinal += "\n 2 - " + new PassosModelo().consultarPasso(2);
			if(cd.getPasso3() != null) solucaoFinal += "\n 3 - " + new PassosModelo().consultarPasso(3);
			if(cd.getPasso4() != null) solucaoFinal += "\n 4 - " + new PassosModelo().consultarPasso(4);
			if(cd.getPasso5() != null) solucaoFinal += "\n 5 - " + new PassosModelo().consultarPasso(5);
			if(cd.getPasso6() != null) solucaoFinal += "\n 6 - " + new PassosModelo().consultarPasso(6);
			if(cd.getPasso7() != null) solucaoFinal += "\n 7 - " + new PassosModelo().consultarPasso(7);
			if(cd.getPasso8() != null) solucaoFinal += "\n 8 - " + new PassosModelo().consultarPasso(8);
			if(cd.getPasso9() != null) solucaoFinal += "\n 9 - " + new PassosModelo().consultarPasso(9);
			if(cd.getPasso10() != null) solucaoFinal += "\n 10 - " + new PassosModelo().consultarPasso(10);
			if(cd.getPasso11() != null) solucaoFinal += "\n 11 - " + new PassosModelo().consultarPasso(11);
			if(cd.getPasso12() != null) solucaoFinal += "\n 12 - " + new PassosModelo().consultarPasso(12);
			if(cd.getPasso13() != null) solucaoFinal += "\n 13 - " + new PassosModelo().consultarPasso(13);
			if(cd.getPasso14() != null) solucaoFinal += "\n 14 - " + new PassosModelo().consultarPasso(14);
		}

		return solucaoFinal;
	}
}
