package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class TelaInicialController {

    @FXML
    private ComboBox<?> malware;

    @FXML
    private ComboBox<?> sistemaOperacional;

    @FXML
    private ComboBox<?> hostnameOrigem;

    @FXML
    private TextField ipOrigem;

    @FXML
    private TextField portaOrigem;

    @FXML
    private TextField ipDestino;

    @FXML
    private TextField portaDestino;

    @FXML
    private TextField hostnameDestino;

    @FXML
    private TextField protocolo;

    @FXML
    private TextField urlAfetada;
   
   @FXML
   void consultarCasos(ActionEvent event) {
	   System.out.println("Clicado ConsultarCasos");
   }
}
