package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import cbr.RealizaConsulta;
import helper.IpToDecimal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import models.HostnameOrigem;
import models.Malware;
import models.Protocolo;
import models.SistemaOperacional;
import models.TipoIncidente;

public class TelaInicialController implements Initializable {

	@FXML
	private ComboBox<TipoIncidente> tipoIncidente;

	@FXML
	private ComboBox<Malware> malware;

	@FXML
	private ComboBox<SistemaOperacional> sistemaOperacional;

	@FXML
	private ComboBox<HostnameOrigem> hostnameOrigem;

	@FXML
	private TextField ipOrigem;

	@FXML
	private TextField portaOrigem;

	@FXML
	private TextField ipDestino;

	@FXML
	private TextField portaDestino;

	@FXML
	private ComboBox<Protocolo> protocolo;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Popula combox da tela
		atualizarComboBox();
	}

	@FXML
	void consultarCasos(ActionEvent event) {
		Integer tipoIncidente_id = (tipoIncidente.getSelectionModel().getSelectedItem() != null)? tipoIncidente.getSelectionModel().getSelectedItem().getId() : 0;
		Integer hostnameOrigem_id = (hostnameOrigem.getSelectionModel().getSelectedItem() != null)? hostnameOrigem.getSelectionModel().getSelectedItem().getId() : 0;
		Integer malware_id = (malware.getSelectionModel().getSelectedItem() != null)? malware.getSelectionModel().getSelectedItem().getId() : 0;
		Integer protocolo_id = (protocolo.getSelectionModel().getSelectedItem() != null)? protocolo.getSelectionModel().getSelectedItem().getId() : 0;
		Integer sistemaOperacional_id = (sistemaOperacional.getSelectionModel().getSelectedItem() != null)? sistemaOperacional.getSelectionModel().getSelectedItem().getId() : 0;
		Long ipOrigem = 0L;
		Integer portaOrigem = 0;
		Long ipDestino = 0L;
		Integer portaDestino = 0;
		
		IpToDecimal ipConverter = new IpToDecimal();
		if(!this.ipOrigem.getText().isEmpty())
			ipOrigem = ipConverter.ipToLong(this.ipOrigem.getText());
		if(!this.ipDestino.getText().isEmpty())
			ipDestino = ipConverter.ipToLong(this.ipDestino.getText());
		
		RealizaConsulta consulta = new RealizaConsulta();
		consulta.realizaConsulta(tipoIncidente_id, ipOrigem, portaOrigem, hostnameOrigem_id, ipDestino, portaDestino, malware_id, protocolo_id, sistemaOperacional_id);
		/*
		System.out.println("Tipo: " + tipoIncidente_id);
		System.out.println("HostnameOrigem: " + hostnameOrigem_id);
		System.out.println("Malware: " + malware_id);
		System.out.println("Protocolo: " + protocolo_id);
		System.out.println("SO: " + sistemaOperacional_id);
		System.out.println("ipOrigem: " + ipOrigem);
		System.out.println("portaOrigem: " + portaOrigem);
		System.out.println("ipDestino: " + ipDestino);
		System.out.println("portaDestino: " + portaDestino);
		*/
	}

	private void atualizarComboBox() {
		// Tipo de Incidente
		TipoIncidente tipoIncidente = new TipoIncidente();
		this.tipoIncidente.setItems(tipoIncidente.getTipoIncidenteList());
		// Hostname de Origem
		HostnameOrigem hostnameOrigem = new HostnameOrigem();
		this.hostnameOrigem.setItems(hostnameOrigem.getHostnameOrigemList());
		// Malware
		Malware malware = new Malware();
		this.malware.setItems(malware.getMalwareList());
		// Protocolo
		Protocolo protocolo = new Protocolo();
		this.protocolo.setItems(protocolo.getProtocoloList());
		// Sistema Operacional
		SistemaOperacional sistemaOperacional = new SistemaOperacional();
		this.sistemaOperacional.setItems(sistemaOperacional.getSistemaOperacionalList());
	}
}