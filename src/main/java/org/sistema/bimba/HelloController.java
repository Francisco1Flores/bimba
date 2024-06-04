package org.sistema.bimba;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.sistema.bimba.model.Category;
import org.sistema.bimba.model.Product;

public class HelloController {

    private Service service = new Service();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

        Category cat = new Category(1,"comida perro");

        Product pr = new Product(1, "Agility", 45000f, 2600f, 2, 25f, 45f, cat);



        service.saveEntity(pr, cat, Main.em);
    }
}