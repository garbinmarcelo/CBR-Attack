package config;

import jcolibri.cbrcore.Attribute;
import jcolibri.cbrcore.CaseComponent;

public class CaseDescription implements CaseComponent {
	private String id;
	private Integer tipo;
	private Long ipOrigem;
	private Integer portaOrigem;
	private Integer hostnameOrigem;
	private Long ipDestino;
	private Integer portaDestino;
	private Integer malware;
	private Integer protocolo;
	private Integer sistemaOperacional;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public Long getIpOrigem() {
		return ipOrigem;
	}

	public void setIpOrigem(Long ipOrigem) {
		this.ipOrigem = ipOrigem;
	}

	public Long getIpDestino() {
		return ipDestino;
	}

	public void setIpDestino(Long ipDestino) {
		this.ipDestino = ipDestino;
	}

	public Integer getPortaOrigem() {
		return portaOrigem;
	}

	public void setPortaOrigem(Integer portaOrigem) {
		this.portaOrigem = portaOrigem;
	}

	public Integer getHostnameOrigem() {
		return hostnameOrigem;
	}

	public void setHostnameOrigem(Integer hostnameOrigem) {
		this.hostnameOrigem = hostnameOrigem;
	}

	public Integer getPortaDestino() {
		return portaDestino;
	}

	public void setPortaDestino(Integer portaDestino) {
		this.portaDestino = portaDestino;
	}

	public Integer getMalware() {
		return malware;
	}

	public void setMalware(Integer malware) {
		this.malware = malware;
	}

	public Integer getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}

	public Integer getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(Integer sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public Attribute getIdAttribute() {
		return new Attribute("id", this.getClass());
	}
	
	@Override
    public String toString() {
		return "(" +
				this.id +
				"," +
				this.tipo +
				"," +
				this.ipOrigem +
				"," +
				this.portaOrigem +
				"," +
				this.hostnameOrigem +
				"," +
				this.ipDestino +
				"," +
				this.portaDestino +
				"," +
				this.malware +
				"," +
				this.protocolo +
				"," +
				this.sistemaOperacional +
				")";
    }
}