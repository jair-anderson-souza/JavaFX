package io.github.jass2125.core;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		AnchorPane panel = new AnchorPane();
		panel.setPrefSize(400, 300);
		
		TextField fieldLogin = new TextField();
		fieldLogin.setPromptText("Digite aqui seu login");
		
		PasswordField fieldPassword = new PasswordField();
		fieldPassword.setPromptText("Digite aqui sua senha");
		
		Button btEntrar = new Button("Entrar");
		
		Button btSair = new Button();
		
		panel.getChildren().addAll(fieldLogin, fieldPassword, btEntrar, btSair);
		Scene scene = new Scene(panel);
		
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
