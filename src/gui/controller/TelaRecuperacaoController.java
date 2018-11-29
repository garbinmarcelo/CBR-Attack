package gui.controller;

import java.io.IOException;

import helper.IpToDecimal;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.HostnameOrigem;
import models.Malware;
import models.Protocolo;
import models.SistemaOperacional;
import models.TipoIncidente;

public class TelaRecuperacaoController {

	// Holds this controller's Stage
	private final Stage thisStage;
	
	IpToDecimal ipConverter = new IpToDecimal();

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

	@FXML
	private Button btnConsultarCasos;
	
	public Integer getTipoIncidente() {
		return (this.tipoIncidente.getSelectionModel().getSelectedItem() != null)? this.tipoIncidente.getSelectionModel().getSelectedItem().getId() : 0;
	}

	public Integer getMalware() {
		return (this.malware.getSelectionModel().getSelectedItem() != null)? this.malware.getSelectionModel().getSelectedItem().getId() : 0;
	}

	public Integer getSistemaOperacional() {
		return (this.sistemaOperacional.getSelectionModel().getSelectedItem() != null)? this.sistemaOperacional.getSelectionModel().getSelectedItem().getId() : 0;
	}

	public Integer getHostnameOrigem() {
		return (this.hostnameOrigem.getSelectionModel().getSelectedItem() != null)? this.hostnameOrigem.getSelectionModel().getSelectedItem().getId() : 0;
	}

	public Long getIpOrigem() {
		return (!this.ipOrigem.getText().isEmpty())? this.ipConverter.ipToLong(this.ipOrigem.getText()) : 0L;
	}

	public Integer getPortaOrigem() {
		return (!this.portaOrigem.getText().isEmpty())? Integer.parseInt(this.portaOrigem.getText()) : 0;
	}

	public Long getIpDestino() {
		return (!this.ipDestino.getText().isEmpty())? ipConverter.ipToLong(this.ipDestino.getText()) : 0L;
	}

	public Integer getPortaDestino() {
		return (!this.portaDestino.getText().isEmpty())? Integer.parseInt(this.portaDestino.getText()) : 0;
	}

	public Integer getProtocolo() {
		return (this.protocolo.getSelectionModel().getSelectedItem() != null)? this.protocolo.getSelectionModel().getSelectedItem().getId() : 0;
	}

	public TelaRecuperacaoController() {
		// Create the new stage
		thisStage = new Stage();

		// Load the FXML file
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/TelaRecuperacao.fxml"));

			// Set this class as the controller
			loader.setController(this);

			// Load the scene
			thisStage.setScene(new Scene(loader.load()));

			// Setup the window/stage
			thisStage.setTitle("Recuperação - Consultar Casos");
			thisStage.setResizable(false);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Show the stage that was loaded in the constructor
	 */
	public void showStage() {
		thisStage.showAndWait();
	}

	/**
	 * The initialize() method allows you set setup your scene, adding actions, configuring nodes, etc.
	 */
	@FXML
	private void initialize() {
		// Popula combox da tela
		atualizarComboBox();
		// Add an action for the "Open Layout2" button
		btnConsultarCasos.setOnAction(event -> abrirTelaReuso());
	}

	/**
	 * Performs the action of loading and showing Layout2
	 */
	private void abrirTelaReuso() {
		// Create the second controller, which loads its own FXML file. We pass a reference to this controller
		// using the keyword [this]; that allows the second controller to access the methods contained in here.
		TelaReusoController controller2 = new TelaReusoController(this);
		
		// Show the new stage/window
		controller2.showStage();
	}

	private void atualizarComboBox() {
		System.out.println("Seta valores ComboBox...");
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