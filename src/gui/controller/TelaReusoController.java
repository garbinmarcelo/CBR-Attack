package gui.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cbr.RealizaConsulta;
import cbr.SolPassos;
import config.CaseDescription;
import gui.negocio.DadosCaso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import jcolibri.method.retrieve.RetrievalResult;
import models.HostnameOrigem;
import models.Malware;
import models.Protocolo;
import models.SistemaOperacional;
import models.TipoIncidente;

public class TelaReusoController {

	// Holds this controller's Stage
	private Stage thisStage;

	// Will hold a reference to the first controller, allowing us to access the methods found there.
	private final TelaRecuperacaoController controller1;

	private Collection<RetrievalResult> casos = null;
	private DadosCaso caso = null;

	@FXML
	private TableView<DadosCaso> tabelaReuso;

	@FXML
	private TableColumn<DadosCaso, String> idCol;

	@FXML
	private TableColumn<DadosCaso, String> tipoIncidenteCol;

	@FXML
	private TableColumn<DadosCaso, String> ipOrigemCol;

	@FXML
	private TableColumn<DadosCaso, String> portaOrigemCol;

	@FXML
	private TableColumn<DadosCaso, String> hostnameOrigemCol;

	@FXML
	private TableColumn<DadosCaso, String> ipDestinoCol;

	@FXML
	private TableColumn<DadosCaso, String> portaDestinoCol;

	@FXML
	private TableColumn<DadosCaso, String> malwareCol;

	@FXML
	private TableColumn<DadosCaso, String> protocoloCol;

	@FXML
	private TableColumn<DadosCaso, String> sistemaOperacionalCol;

	@FXML
	private TableColumn<DadosCaso, String> precisaoCol;

	public Collection<RetrievalResult> getCasos() {
		return casos;
	}

	public void setCasos(Collection<RetrievalResult> casos) {
		this.casos = casos;
	}

	public TelaReusoController(TelaRecuperacaoController controller1) {
		// We received the first controller, now let's make it usable throughout this controller.
		this.controller1 = controller1;

		// Create the new stage
		thisStage = new Stage();

		// Load the FXML file
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/TelaReuso.fxml"));

			// Set this class as the controller
			loader.setController(this);

			// Load the scene
			thisStage.setScene(new Scene(loader.load()));

			// Setup the window/stage
			thisStage.setTitle("Reuso - Casos Recuperados");
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
		gerarTabela();
		tabelaReuso.getSelectionModel().selectedItemProperty().addListener((Observable, oldValue, newValue) -> selecionarItemTabela(newValue));
	}
	
	public void selecionarItemTabela(DadosCaso caso) {
		this.setCaso(caso);
		
		TelaRevisaoController controller2 = new TelaRevisaoController(this);
		// Show the new stage/window
		controller2.showStage();
		
		return;
	}
	
	public DadosCaso getCaso() {
		return caso;
	}

	public void setCaso(DadosCaso caso) {
		this.caso = caso;
	}

	public void gerarTabela() {
		RealizaConsulta consulta = new RealizaConsulta();
		this.casos = consulta.realizaConsulta(
				controller1.getTipoIncidente(),
				controller1.getIpOrigem(), 
				controller1.getPortaOrigem(),
				controller1.getHostnameOrigem(),
				controller1.getIpDestino(),
				controller1.getPortaDestino(),
				controller1.getMalware(),
				controller1.getProtocolo(),
				controller1.getSistemaOperacional());

		final ObservableList<DadosCaso> data = FXCollections.observableArrayList();

		for(RetrievalResult nse:  this.casos) {
			CaseDescription result = (CaseDescription) nse.get_case().getDescription();
			data.add(new DadosCaso(
					result.getId(), 
					String.valueOf(result.getTipo()),
					String.valueOf(result.getHostnameOrigem()),
					String.valueOf(result.getMalware()),
					String.valueOf(result.getProtocolo()),
					String.valueOf(result.getSistemaOperacional()),
					String.valueOf(result.getIpOrigem()),
					String.valueOf(result.getPortaOrigem()),
					String.valueOf(result.getIpDestino()),
					String.valueOf(result.getPortaDestino()),
					String.valueOf(nse.getEval()),
					String.valueOf(new SolPassos().getSolucao(nse))
					));
			/*
			data.add(new DadosCaso(
					result.getId(), 
					String.valueOf(new TipoIncidente().getTipoIncidente(result.getTipo())),
					String.valueOf(new HostnameOrigem().getHostname(result.getHostnameOrigem())),
					String.valueOf(new Malware().getMalware(result.getMalware())),
					String.valueOf(new Protocolo().getProtocolo(result.getProtocolo())),
					String.valueOf(new SistemaOperacional().getSistemaOperacional(result.getSistemaOperacional())),
					String.valueOf(result.getIpOrigem()),
					String.valueOf(result.getPortaOrigem()),
					String.valueOf(result.getIpDestino()),
					String.valueOf(result.getPortaDestino()),
					String.valueOf(nse.getEval()),
					String.valueOf(new SolPassos().getSolucao(nse))
					));
					*/
		}

		/**
		 * Popular tabela
		 */
    	idCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("id"));
    	tipoIncidenteCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("tipoIncidenteText"));
    	ipOrigemCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("ipOrigem"));
    	portaOrigemCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("portaOrigem"));
    	hostnameOrigemCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("hostnameOrigemText"));
    	ipDestinoCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("ipDestino"));
    	portaDestinoCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("portaDestino"));
    	malwareCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("malwareText"));
    	protocoloCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("protocoloText"));
    	sistemaOperacionalCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("sistemaOperacionalText"));    
    	precisaoCol.setCellValueFactory(new PropertyValueFactory<DadosCaso, String>("precisao"));
    	tabelaReuso.setItems(data);
	}
}