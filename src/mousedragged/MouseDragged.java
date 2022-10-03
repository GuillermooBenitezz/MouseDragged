/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package mousedragged;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class MouseDragged extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        Text text = new Text(100, 60, "Programing is fun");
        pane.getChildren().addAll(text);
        
        text.setOnMouseDragged(e -> 
        {
            text.setX(e.getX());
            text.setY(e.getY());
        });
        
        Scene scene = new Scene(pane, 300, 130);
        
        primaryStage.setTitle("HMouseDragged");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
