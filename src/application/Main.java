package application;
	
import java.io.IOException;

import controller.RootLayoutController;
import controller.TelaController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Stage primaryStage;
	public BorderPane rootLayout;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Exemplo Java FX");
		
		// Carrega a tela principal
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../visao/RootLayout.fxml"));
		rootLayout = (BorderPane) loader.load();

		// Mostra a cena
		Scene scene = new Scene(rootLayout);
		primaryStage.setScene(scene);
		primaryStage.show();

		RootLayoutController controller = loader.getController();
		controller.setMainApp(this);
	}	
	
	public void iniciarTela() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../visao/Tela.fxml"));
		AnchorPane newScreen = (AnchorPane) loader.load();

		rootLayout.setCenter(newScreen);
		TelaController controller = loader.getController();
		controller.setMainApp(this);
	}
}
