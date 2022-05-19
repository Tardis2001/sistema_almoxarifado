package com.almoxarifado.view;

import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class mainStageWindow extends Stage {

    // TODO Table e design do stage

    public Button insert;
    public Button selectall;
    public Button select;
    public Button update;
    public Button delete;

    public mainStageWindow(String title, int width, int height) {
        initUI(title, width, height);
        insert = new Button("INSERT");

        selectall = new Button("SELECT ALL");

        select = new Button("SEARCH");

        update = new Button("UPDATE");

        delete = new Button("REMOVE");

        VBox box = new VBox();
        box.getChildren().add(insert);
        box.getChildren().add(select);
        box.getChildren().add(selectall);
        box.getChildren().add(update);
        box.getChildren().add(delete);

        box.setSpacing(20.0);
        box.setAlignment(Pos.CENTER_RIGHT);

        Scene scene = new Scene(box, 200, 100);
        setScene(scene);
    }

    public void returnDataProduct(DialogStageInsert dialog) {
        dialog.initUI("Insert", 500, 600, dialog.scene);
    }

    public void initUI(String title, int width, int height) {
        setTitle(title);
        setWidth(width);
        setHeight(height);
        initModality(Modality.WINDOW_MODAL);
    }

}
