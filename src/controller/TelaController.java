package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class TelaController{
    
	Main main;
	
	public void setMainApp(Main main) {
		this.main = main;
		
	}
	
    @FXML
    private TextArea inputTextExemplo;

    @FXML
    private Button btnSalvar;

    @FXML
    private Label labelConsole;

    @FXML
    void salvarTexto(ActionEvent event) {
    	String texto = inputTextExemplo.getText();
    	try {
			putContentOnTxt(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	labelConsole.setText("Arquivo salvo na pasta raiz!");
    }
    
    private void putContentOnTxt(String text) throws IOException {
		File saida = new File("Exemplo.txt");
		
		FileOutputStream fos = new FileOutputStream(saida);    
	    fos.write(text.toString().getBytes());  
	    fos.close();        
	    System.out.println("Arquivo " + saida + " salvo!");
	}
	
	
}

