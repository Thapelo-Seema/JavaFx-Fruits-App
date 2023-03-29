package com.geeks4learning.javafxmavenfruitsapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application{

    Label titleLbl, selectedFruitLbl;
    CheckBox bananaCB, mangoCB, appleCB;
    
    @Override
    public void init(){
        
    }
    
    @Override
    public void stop(){
        
    }
   
    @Override
    public void start(Stage stage) {
      stage.setTitle("My Fruit Selector");
      
      //Create my layout element
      FlowPane layoutArea = new FlowPane(Orientation.VERTICAL, 0,10);
      layoutArea.setAlignment(Pos.CENTER);
      
      //Create my controls
      this.titleLbl = new Label("Welcome to our fruit selector app");
      
      this.bananaCB = new CheckBox("Banana");
      this.mangoCB = new CheckBox("Mango");
      this.appleCB = new CheckBox("Mango");
      this.selectedFruitLbl = new Label("");
      
      //Register an ActionEvent Handler with each node
      this.bananaCB.setOnAction(this.checkboxEventHandler);
      this.mangoCB.setOnAction(this.checkboxEventHandler);
      this.appleCB.setOnAction(this.checkboxEventHandler);
    
      
      //load our controls onto the layout area
      layoutArea.getChildren().addAll(this.titleLbl, this.bananaCB, 
              this.mangoCB, this.appleCB, this.selectedFruitLbl);
      
      //Create a scene and load the layout area on the scene
      Scene scene = new Scene(layoutArea, 400, 250);
      
      //Load the scene onto the stage
      stage.setScene(scene);
      
      stage.show(); // show the stage
      
        
    }

    public static void main(String[] args) {
        launch();
    }
    
    EventHandler<ActionEvent> checkboxEventHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent t) {
           Object source = t.getSource();
           if(bananaCB.equals(source)){
               if(bananaCB.isSelected()){
                   selectedFruitLbl.setText("Banana selected");
               }else selectedFruitLbl.setText("Banana cleared");
           }
           else if(mangoCB.equals(source)){
               if(mangoCB.isSelected()){
                   selectedFruitLbl.setText("Mango selected");
               }else selectedFruitLbl.setText("Mango cleared");
           }
           else if(appleCB.equals(source)){
               if(appleCB.isSelected()){
                   selectedFruitLbl.setText("Apple selected");
               }else selectedFruitLbl.setText("Apple cleared");
           }
        }
    };
    

   

}