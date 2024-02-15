package Sistema_Gerencia_Estudantil;
	
import java.io.IOException;

import Sistema_Gerencia_Estudantil.gui.FachadaTela;
import Sistema_Gerencia_Estudantil.negocio.Fachada;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;



public class MainApp extends Application {

	@Override
	public void start (Stage primaryStage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("gui/telaInicial.fxml"));
		Scene scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());	// para conseguir usar o css
		// String cssFile = this.getClass().getResource("application.css").toExternalForm();		// linha adequada múltiplas cenas
		//scene.getStylesheets().add(cssFile);
		
		primaryStage.setResizable(true);
		primaryStage.getIcons().add(new Image("sge-icon.png"));
		primaryStage.setTitle("Sistema Gerencia Estudantil");
		primaryStage.setScene(scene);//()FachadaTela.getInstance().getMainScene()
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	@Override
    public void start(Stage primaryStage) throws Exception {
    	primaryStage.setScene(FachadaTela.getInstance().getMainScene());
		primaryStage.setTitle("Sistema Gerencia Estudantil");
		
		primaryStage.getIcons().add(new Image("sge-icon.png"));
		FachadaTela.getInstance().setPrimaryStage(primaryStage);
		primaryStage.show();
    }*/
    /*
    public static void main(String[] args) {
        MainApp.launch(args);
    }*/

}
