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
		fieldLogin.setLayoutX((panel.getWidth() - fieldLogin.getWidth()) / 2 );
		fieldLogin.setLayoutY(50);
		
		PasswordField fieldPassword = new PasswordField();
		fieldPassword.setPromptText("Digite aqui sua senha");
		fieldPassword.setLayoutX((panel.getWidth() - fieldPassword.getWidth()) / 2 );
		fieldPassword.setLayoutY(50);
		
		Button btEntrar = new Button("Entrar");
		
		
		Button btSair = new Button();
		
		panel.getChildren().addAll(fieldLogin, fieldPassword, btEntrar, btSair);
		
		Scene scene = new Scene(panel);
		stage.setScene(scene);
		stage.show();
		
		fieldLogin.setLayoutX((panel.getWidth() - fieldLogin.getWidth()) / 2);
		fieldLogin.setLayoutY(50);
		fieldPassword.setLayoutX((panel.getWidth() - fieldPassword.getWidth()) / 2);
		fieldPassword.setLayoutY(100);
		btEntrar.setLayoutX((panel.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((panel.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);
		panel.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
