package gui.controller;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {

		// Create the first controller, which loads Layout1.fxml within its own constructor
		TelaRecuperacaoController controller1 = new TelaRecuperacaoController();

		// Show the new stage
		controller1.showStage();
	}
}