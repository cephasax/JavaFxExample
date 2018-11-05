package controller;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class RootLayoutController {

	Main main;
	
	@FXML
    private MenuItem menuOpen;
	
	public void setMainApp(Main main) {
		this.main = main;
		
	}
	
    @FXML
    void actionMenuOpen(ActionEvent event) {
    	try {
			main.iniciarTela();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
