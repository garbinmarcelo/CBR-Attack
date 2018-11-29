package gui.controller;

import java.io.IOException;

import helper.IpToDecimal;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.HostnameOrigem;
import models.Malware;
import models.Protocolo;
import models.SistemaOperacional;
import models.TipoIncidente;

public class TelaRevisaoController {

	// Holds this controller's Stage
	private Stage thisStage;

	// Will hold a reference to the first controller, allowing us to access the methods found there.
	private final TelaReusoController controller2;

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
	private Button btnReter;

	@FXML
	private TextArea solucao;

	public TelaRevisaoController(TelaReusoController controller2) {
		// We received the first controller, now let's make it usable throughout this controller.
		this.controller2 = controller2;

		// Create the new stage
		thisStage = new Stage();

		// Load the FXML file
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/TelaRevisao.fxml"));

			// Set this class as the controller
			loader.setController(this);

			// Load the scene
			thisStage.setScene(new Scene(loader.load()));

			// Setup the window/stage
			thisStage.setTitle("Revisão - Caso Recuperado");
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

	@FXML
	private void initialize() {
		atualizarComboBox();
		definirValores();
	}

	public void definirValores() {
		System.out.println("Definindo valores do caso...");
		tipoIncidente.getSelectionModel().select(Integer.parseInt(controller2.getCaso().getTipoIncidente()));
		hostnameOrigem.getSelectionModel().select(Integer.parseInt(controller2.getCaso().getHostnameOrigem()));
		malware.getSelectionModel().select(Integer.parseInt(controller2.getCaso().getMalware()));
		sistemaOperacional.getSelectionModel().select(Integer.parseInt(controller2.getCaso().getSistemaOperacional()));
		protocolo.getSelectionModel().select(Integer.parseInt(controller2.getCaso().getProtocolo()));		
		ipOrigem.setText(controller2.getCaso().getIpOrigem());
		portaDestino.setText(controller2.getCaso().getPortaDestino());
		ipDestino.setText(controller2.getCaso().getIpDestino());
		portaOrigem.setText(controller2.getCaso().getPortaOrigem());
		solucao.setText(controller2.getCaso().getPassos());
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