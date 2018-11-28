package gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

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
		System.out.println("INITIALIZED!");
		// Popula combox da tela
		atualizarComboBox();
	}

	@FXML
	void consultarCasos(ActionEvent event) {
		Integer tipoIncidente_id = tipoIncidente.getSelectionModel().getSelectedItem().getId();
		Integer hostnameOrigem_id = hostnameOrigem.getSelectionModel().getSelectedItem().getId();
		Integer malware_id = malware.getSelectionModel().getSelectedItem().getId();
		Integer protocolo_id = protocolo.getSelectionModel().getSelectedItem().getId();
		Integer sistemaOperacional_id = sistemaOperacional.getSelectionModel().getSelectedItem().getId();
		
		
		
		System.out.println(tipoIncidente_id);
		System.out.println("Clicado ConsultarCasos");
	}

	private void atualizarComboBox() {
		System.out.println("Combobox inicializado!");
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
