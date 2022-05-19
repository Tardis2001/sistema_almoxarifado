package com.almoxarifado.view;

import com.almoxarifado.model.Product;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DialogStageRemove extends Stage {


    // TODO fazer um design diferente dos outros dialogs aqui
    // ? Na real preciso de um dialog ???? em haver

    // Inicializa classes
    Product product;

    //Rotulos
    Label codeLabel;
    Label nameLabel;
    Label descriptionLabel;
    Label price_unitLabel;
    Label validityLabel;
    Label quantityLabel;
    Label overall_priceLabel;

    //Fields
    TextField codeField;
    TextField nameField;
    TextField descriptionField;
    TextField price_unitField;
    TextField validityField;
    TextField quantityField;
    TextField overall_priceField;

    //Layout
    GridPane grid;

    Scene scene;

    Button insert;
    public DialogStageRemove(String title, int width, int height) {

        product = new Product();

        grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);


        insert = new Button("Inserir");

        codeLabel = new Label("Codigo:");

        nameLabel = new Label("Nome:");

        descriptionLabel = new Label("Descrição:");

        price_unitLabel = new Label("Preço Unitario:");

        validityLabel = new Label("Validade:");

        quantityLabel = new Label("Quantidade:");

        overall_priceLabel = new Label("Preço Total:");

        codeField = new TextField();

        nameField = new TextField();

        descriptionField = new TextField();

        price_unitField = new TextField();

        validityField = new TextField();

        quantityField = new TextField();

        overall_priceField = new TextField();

        grid.add(codeLabel, 1, 0);
        grid.add(codeField, 2, 0);

        grid.add(nameLabel, 1, 1);
        grid.add(nameField, 2, 1);

        grid.add(descriptionLabel, 1, 2);
        grid.add(descriptionField, 2, 2);

        grid.add(price_unitLabel, 1, 3);
        grid.add(price_unitField, 2, 3);

        grid.add(validityLabel, 1, 4);
        grid.add(validityField, 2, 4);

        grid.add(quantityLabel, 1, 5);
        grid.add(quantityField, 2, 5);

        grid.add(overall_priceLabel, 1, 6);
        grid.add(overall_priceField, 2, 6);

        grid.add(insert, 1, 7);
        scene = new Scene(grid, width, height);
        initUI(title, width, height, scene);

        ButtonEventHandler(insert);
    }

    public void initUI(String title, int width, int height, Scene scene) {
        setTitle(title);
        setResizable(false);
        setScene(scene);
        showAndWait();
    }

    public Product getProduct() {
        return product;
    }

    public void setfromFieldsProduct(Product product) {

        this.product.code = Integer.parseInt(this.codeField.getText());
        
        this.product.name = this.nameField.getText();

        this.product.description = this.descriptionField.getText();
        
        this.product.overall_price = this.overall_priceField.getText();
        
        this.product.price_unit = this.price_unitField.getText();
        
        this.product.quantity = this.quantityField.getText();
        
        this.product.validity = this.validityField.getText();
        
    }

    public void ButtonEventHandler(Button button){
        button.setOnAction(e -> {
            setfromFieldsProduct(product);
        });
    }
}
