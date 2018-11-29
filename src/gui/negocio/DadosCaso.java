package gui.negocio;

import java.util.Collection;

import helper.IpToDecimal;
import javafx.beans.property.SimpleStringProperty;
import jcolibri.method.retrieve.RetrievalResult;
import models.HostnameOrigem;
import models.Malware;
import models.Protocolo;
import models.SistemaOperacional;
import models.TipoIncidente;

public class DadosCaso {

	private SimpleStringProperty id;
	private SimpleStringProperty tipoIncidente;
	private SimpleStringProperty hostnameOrigem;
	private SimpleStringProperty malware;
	private SimpleStringProperty protocolo;
	private SimpleStringProperty sistemaOperacional;
	private SimpleStringProperty ipOrigem;
	private SimpleStringProperty portaOrigem;
	private SimpleStringProperty ipDestino;
	private SimpleStringProperty portaDestino;
	private SimpleStringProperty precisao;
	private SimpleStringProperty passos;
	private Boolean format = false;

	private Collection<RetrievalResult> casos = null;
	private RetrievalResult caso = null;
	
	//public DadosCaso() {}

	public DadosCaso(String id, String tipoIncidente, String hostnameOrigem, String malware, String protocolo, String sistemaOperacional, String ipOrigem, String portaOrigem, String ipDestino, String portaDestino, String precisao, String passos) {
		this.id = new SimpleStringProperty(id);
		this.tipoIncidente = new SimpleStringProperty(tipoIncidente);
		this.hostnameOrigem = new SimpleStringProperty(hostnameOrigem);
		this.malware = new SimpleStringProperty(malware);
		this.protocolo = new SimpleStringProperty(protocolo);
		this.sistemaOperacional = new SimpleStringProperty(sistemaOperacional);
		this.ipOrigem = new SimpleStringProperty(ipOrigem);
		this.portaOrigem = new SimpleStringProperty(portaOrigem);
		this.ipDestino = new SimpleStringProperty(ipDestino);
		this.portaDestino = new SimpleStringProperty(portaDestino);
		this.precisao  = new SimpleStringProperty(precisao);
		this.passos = new SimpleStringProperty(passos);
	}

	public String getId() {
		return id.get();
	}

	public void setId(String id) {
		this.id.set(id);
	}

	public void setTipoIncidente(String tipoIncidente) {
		this.tipoIncidente.set(tipoIncidente);
	}

	public String getTipoIncidenteText() {
		return String.valueOf(new TipoIncidente().getTipoIncidente(Integer.parseInt(tipoIncidente.get())));
	}
	
	public String getTipoIncidente() {
		return tipoIncidente.get();
	}

	public String getHostnameOrigem() {
		return hostnameOrigem.get();
	}
	
	public String getHostnameOrigemText() {
		return String.valueOf(new HostnameOrigem().getHostname(Integer.parseInt(hostnameOrigem.get())));
	}
	
	public void setHostnameOrigem(String hostnameOrigem) {
		this.hostnameOrigem.set(hostnameOrigem);
	}

	public String getMalware() {
		return malware.get();
	}
	
	public String getMalwareText() {
		return String.valueOf(new Malware().getMalware(Integer.parseInt(malware.get())));
	}

	public void setMalware(String malware) {
		this.malware.set(malware);
	}

	public String getProtocolo() {
		return protocolo.get();
	}
	
	public String getProtocoloText() {
		return String.valueOf(new Protocolo().getProtocolo(Integer.parseInt(protocolo.get())));
	}

	public void setProtocolo(String protocolo) {
		this.protocolo.set(protocolo);
	}

	public String getSistemaOperacional() {
		return sistemaOperacional.get();
	}
	
	public String getSistemaOperacionalText() {
		return String.valueOf(new SistemaOperacional().getSistemaOperacional(Integer.parseInt(sistemaOperacional.get())));
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional.set(sistemaOperacional);
	}

	public String getIpOrigem() {
		return new IpToDecimal().longToIp(Long.parseLong(ipOrigem.get()));
	}

	public void setIpOrigem(String ipOrigem) {
		this.ipOrigem.set(ipOrigem);
	}

	public String getPortaOrigem() {
		return portaOrigem.get();
	}

	public void setPortaOrigem(String portaOrigem) {
		this.portaOrigem.set(portaOrigem);
	}

	public String getIpDestino() {
		return new IpToDecimal().longToIp(Long.parseLong(ipDestino.get()));
	}

	public void setIpDestino(String ipDestino) {
		this.ipDestino.set(ipDestino);
	}

	public String getPortaDestino() {
		return portaDestino.get();
	}

	public void setPortaDestino(String portaDestino) {
		this.portaDestino.set(portaDestino);
	}

	public String getPrecisao() {
		Double precisao = Double.parseDouble(this.precisao.get());
		return String.format("%2.2f", precisao*100) + "%";
		//return precisao.get();
	}

	public void setPrecisao(String precisao) {
		this.precisao.set(precisao);
	}

	public String getPassos() {
		return passos.get();
	}

	public void setPassos(String passos) {
		this.passos.set(passos);
	}

	public Collection<RetrievalResult> getCasos() {
		return casos;
	}

	public void setCasos(Collection<RetrievalResult> casos) {
		this.casos = casos;
	}

	public RetrievalResult getCaso() {
		return caso;
	}

	public void setCaso(RetrievalResult caso) {
		this.caso = caso;
	}
}
