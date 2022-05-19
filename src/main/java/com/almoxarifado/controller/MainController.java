package com.almoxarifado.controller;

import java.sql.SQLException;

import com.almoxarifado.controller.DAOProduct.DAOProduct;
import com.almoxarifado.view.DialogStageInsert;
import com.almoxarifado.view.mainStageWindow;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class MainController {
    private mainStageWindow primaryStage;
    private DAOProduct daoProduct;

    public MainController(String title, int width, int height) {

        // Inicializa as classes etc...
        primaryStage = new mainStageWindow(title, height, height);
        daoProduct = new DAOProduct();

        // TODO KeyHandler pra mainstage creio eu que o codigo ficaria melhor e mais organizado dessa maneira?
        //// kHandler = new KeyBindingsHandler(primaryStage.getScene());
        runUI(primaryStage);
        closeAppAndConnection(daoProduct, primaryStage);
        maineventHandler(primaryStage, daoProduct);
    }

    public void runUI(Stage stage) {
        stage.show();
    }

    public void closeAppAndConnection(DAOProduct daoProduct, Stage stage) {
        stage.setOnCloseRequest((e) -> {
            try {
                daoProduct.closeConnection();
            } catch (SQLException e1) {

                e1.printStackTrace();
            }
        });
    }

    public void maineventHandler(mainStageWindow stage, DAOProduct daoProduct) {
        Scene scene = new Scene(new Parent() {

        });

        scene = stage.getScene();
        stage.insert.setOnAction(e -> {
            daoProduct.Insert(new DialogStageInsert("Inserir", 600, 500).getProduct());
        });
        stage.select.setOnAction(e -> {

        });
        stage.selectall.setOnAction(e -> {

        });
        stage.update.setOnAction(e -> {

        });
        stage.delete.setOnAction(e -> {

        });
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.INSERT && e.getCode() == KeyCode.F1) {
                daoProduct.Insert(new DialogStageInsert("Inserir", 600, 500).getProduct());
            }
        });

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.DELETE && e.getCode() == KeyCode.F2) {

            }
        });

        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.INSERT && e.getCode() == KeyCode.F3) {

            }
        });
    }
}
