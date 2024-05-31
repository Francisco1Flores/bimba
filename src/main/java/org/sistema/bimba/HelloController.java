package org.sistema.bimba;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.sistema.bimba.model.Product;

public class HelloController {

    private Service service = new Service();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        Product pr = new Product(4, "Agility");

        service.saveEntity(pr, Main.em);
    }
}