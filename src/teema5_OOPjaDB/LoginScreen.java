package teema5_OOPjaDB;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by peep on 22.11.15.
 */
public class LoginScreen {
    public LoginScreen() {
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        Label kasutajaLabel = new Label("Kasutajanimi");
        TextField kasutajanimeInput = new TextField();

        Label kasutajaParool = new Label("Parool");
        TextField kasutajaParooliInput = new TextField();

        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");

        registerButton.setOnAction(event -> {
            String kasutajaNimi = kasutajanimeInput.getText();
            String parool = kasutajaParooliInput.getText();
            Andmebaas baas = new Andmebaas();
            baas.reegisteeriKasutaja(kasutajaNimi, parool);
            baas.kuvaRead(kasutajaNimi);
            baas.sulgeAndmebaas();
        });

        vbox.getChildren().addAll(kasutajaLabel, kasutajanimeInput, kasutajaParool, kasutajaParooliInput, loginButton, registerButton);

        stage.setScene(scene);
        stage.setTitle("LoginScreen");
        stage.show();

    }
}