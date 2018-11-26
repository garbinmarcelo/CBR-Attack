package gui.loader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoaderTelaConsulta extends Application {

    @Override
     public void start(Stage stage) throws Exception {
    	System.out.println("Rodando metodo loader Tela");
        Parent root = FXMLLoader.load(getClass().getResource("/gui/view/TelaConsulta.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}