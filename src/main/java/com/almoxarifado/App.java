package com.almoxarifado;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

import com.almoxarifado.controller.MainController;
/**
                                            ...                            
                                        ;::::;                           
                                    ;::::; :;                          
                                    ;:::::'   :;                         
                                    ;:::::;     ;.                        
                                ,:::::'       ;           OOO\         
                                ::::::;       ;          OOOOO\        
                                ;:::::;       ;         OOOOOOOO       
                                ,;::::::;     ;'         / OOOOOOO      
                                ;:::::::::`. ,,,;.        /  / DOOOOOO    
                            .';:::::::::::::::::;,     /  /     DOOOO   
                            ,::::::;::::::;;;;::::;,   /  /        DOOO  
                            ;`::::::`'::::::;;;::::: ,#/  /          DOOO 
                            :`:::::::`;::::::;;::: ;::#  /            DOOO
                            ::`:::::::`;:::::::: ;::::# /              DOO
                            `:`:::::::`;:::::: ;::::::#/               DOO
                            :::`:::::::`;; ;:::::::::##                OO
                            ::::`:::::::`;::::::::;:::#                OO
                            `:::::`::::::::::::;'`:;::#                O 
                            `:::::`::::::::;' /  / `:#                  
                            ::::::`:::::;'  /  /   `#              

 */
public class App extends Application {
/********************************************************************************************
 *                           @AUTHOR : MATHEUS SANTOS EVANGELISTA                           *
 *                                       @YEAR : 2022                                       *
 * @DESCRIPTION : DON'T RLLY KNOW WHAT TO WRITE RN HERE BUT SOON I'LL WRITE SOMETHING COOL; *
 ********************************************************************************************/
    
    MainController MainControl;

    @Override
    public void start(Stage stage) throws IOException {
        // ? Esse é o melhor jeito de inicializar????
        MainControl = new MainController("Sistema almoxarifado", 600, 400);
    
    }

    public static void main(String[] args) {
        launch(args);
    }

}