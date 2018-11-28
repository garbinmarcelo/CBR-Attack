package cbr;

public class PesosAtributos {
	private Double tipo;
	private Double ipOrigem;
	private Double portaOrigem;
	private Double hostnameOrigem;
	private Double ipDestino;
	private Double portaDestino;
	private Double malware;
	private Double protocolo;
	private Double sistemaOperacional;
	
	public PesosAtributos() {}
	
	public PesosAtributos(Double tipo, Double ipOrigem, Double portaOrigem, Double hostnameOrigem, Double ipDestino, Double portaDestino, Double malware, Double protocolo, Double sistemaOperacional) {
		this.tipo = tipo;
		this.ipOrigem = ipOrigem;
		this.portaOrigem = portaOrigem;
		this.hostnameOrigem = hostnameOrigem;
		this.ipDestino = ipDestino;
		this.portaDestino = portaDestino;
		this.malware = malware;
		this.protocolo = protocolo;
		this.sistemaOperacional = sistemaOperacional;
	}
	
	public Double getTipo() {
		return tipo;
	}
	
	public void setTipo(Double tipo) {
		this.tipo = tipo;
	}
	
	public Double getIpOrigem() {
		return ipOrigem;
	}
	
	public void setIpOrigem(Double ipOrigem) {
		this.ipOrigem = ipOrigem;
	}
	
	public Double getPortaOrigem() {
		return portaOrigem;
	}
	
	public void setPortaOrigem(Double portaOrigem) {
		this.portaOrigem = portaOrigem;
	}
	
	public Double getHostnameOrigem() {
		return hostnameOrigem;
	}
	
	public void setHostnameOrigem(Double hostnameOrigem) {
		this.hostnameOrigem = hostnameOrigem;
	}
	
	public Double getIpDestino() {
		return ipDestino;
	}
	
	public void setIpDestino(Double ipDestino) {
		this.ipDestino = ipDestino;
	}
	
	public Double getPortaDestino() {
		return portaDestino;
	}
	
	public void setPortaDestino(Double portaDestino) {
		this.portaDestino = portaDestino;
	}
	
	public Double getMalware() {
		return malware;
	}
	
	public void setMalware(Double malware) {
		this.malware = malware;
	}
	
	public Double getProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo(Double protocolo) {
		this.protocolo = protocolo;
	}
	
	public Double getSistemaOperacional() {
		return sistemaOperacional;
	}
	
	public void setSistemaOperacional(Double sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
}