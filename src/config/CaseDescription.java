package config;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class CaseDescription implements CaseComponent {
    String CASEID;
    Integer tipo;
    Integer ipOrigem;
    Integer portaOrigem;
    Integer urlAfetada;
    Integer hostnameOrigem;
    Integer ipDestino;
    Integer portaDestino;
    Integer hostnameDestino;
    String malware;
    String protocolo;
    Integer sistemaOperacional;
    Integer passo1;
    Integer passo2;
    Integer passo3;
    Integer passo4;
    Integer passo5;
    Integer passo6;
    Integer passo7;
    Integer passo8;
    Integer passo9;
    Integer passo10;
    Integer passo11;
    Integer passo12;
    Integer passo13;
    Integer passo14;

    public String toString()
    {
        return "("+CASEID+"):" + tipo + "," + ipOrigem + "," + portaOrigem + "," + urlAfetada + "," + hostnameOrigem + "," + ipDestino + "," + portaDestino + "," + hostnameDestino + "," + malware + "," + protocolo + "," + sistemaOperacional + "," + passo1 + "," + passo2 + "," + passo3 + "," + passo4 + "," + passo5 + "," + passo6 + "," + passo7 + "," + passo8 + "," + passo9 + "," + passo10 + "," + passo11 + "," + passo12 + "," + passo13 + "," + passo14;
    }

    @Override
    public Attribute getIdAttribute() {
        return new Attribute("CASEID", this.getClass());
    }

	public String getCASEID() {
		return CASEID;
	}

	public void setCASEID(String cASEID) {
		CASEID = cASEID;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getIpOrigem() {
		return ipOrigem;
	}

	public void setIpOrigem(Integer ipOrigem) {
		this.ipOrigem = ipOrigem;
	}

	public Integer getPortaOrigem() {
		return portaOrigem;
	}

	public void setPortaOrigem(Integer portaOrigem) {
		this.portaOrigem = portaOrigem;
	}

	public Integer getUrlAfetada() {
		return urlAfetada;
	}

	public void setUrlAfetada(Integer urlAfetada) {
		this.urlAfetada = urlAfetada;
	}

	public Integer getHostnameOrigem() {
		return hostnameOrigem;
	}

	public void setHostnameOrigem(Integer hostnameOrigem) {
		this.hostnameOrigem = hostnameOrigem;
	}

	public Integer getIpDestino() {
		return ipDestino;
	}

	public void setIpDestino(Integer ipDestino) {
		this.ipDestino = ipDestino;
	}

	public Integer getPortaDestino() {
		return portaDestino;
	}

	public void setPortaDestino(Integer portaDestino) {
		this.portaDestino = portaDestino;
	}

	public Integer getHostnameDestino() {
		return hostnameDestino;
	}

	public void setHostnameDestino(Integer hostnameDestino) {
		this.hostnameDestino = hostnameDestino;
	}

	public String getMalware() {
		return malware;
	}

	public void setMalware(String malware) {
		this.malware = malware;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public Integer getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(Integer sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public Integer getPasso1() {
		return passo1;
	}

	public void setPasso1(Integer passo1) {
		this.passo1 = passo1;
	}

	public Integer getPasso2() {
		return passo2;
	}

	public void setPasso2(Integer passo2) {
		this.passo2 = passo2;
	}

	public Integer getPasso3() {
		return passo3;
	}

	public void setPasso3(Integer passo3) {
		this.passo3 = passo3;
	}

	public Integer getPasso4() {
		return passo4;
	}

	public void setPasso4(Integer passo4) {
		this.passo4 = passo4;
	}

	public Integer getPasso5() {
		return passo5;
	}

	public void setPasso5(Integer passo5) {
		this.passo5 = passo5;
	}

	public Integer getPasso6() {
		return passo6;
	}

	public void setPasso6(Integer passo6) {
		this.passo6 = passo6;
	}

	public Integer getPasso7() {
		return passo7;
	}

	public void setPasso7(Integer passo7) {
		this.passo7 = passo7;
	}

	public Integer getPasso8() {
		return passo8;
	}

	public void setPasso8(Integer passo8) {
		this.passo8 = passo8;
	}

	public Integer getPasso9() {
		return passo9;
	}

	public void setPasso9(Integer passo9) {
		this.passo9 = passo9;
	}

	public Integer getPasso10() {
		return passo10;
	}

	public void setPasso10(Integer passo10) {
		this.passo10 = passo10;
	}

	public Integer getPasso11() {
		return passo11;
	}

	public void setPasso11(Integer passo11) {
		this.passo11 = passo11;
	}

	public Integer getPasso12() {
		return passo12;
	}

	public void setPasso12(Integer passo12) {
		this.passo12 = passo12;
	}

	public Integer getPasso13() {
		return passo13;
	}

	public void setPasso13(Integer passo13) {
		this.passo13 = passo13;
	}

	public Integer getPasso14() {
		return passo14;
	}

	public void setPasso14(Integer passo14) {
		this.passo14 = passo14;
	}  
}