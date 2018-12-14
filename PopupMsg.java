package Bricks4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PopupMsg extends Application {

	public static void main(String[] args) { 
  launch(args); 
  }
  //setting the scene//
  @Override 
  public void start(final Stage primaryStage) { 
	  
  MainPage Popup = new MainPage();	  
  HBox pane = new HBox(20); 
  pane.setAlignment(Pos.CENTER);
	  
  Button pickup = new Button("Pick-up");
  Button delivery = new Button("Delivery (extra)");
  pickup.setPrefHeight(75);
  pickup.setPrefWidth(125);
  delivery.setPrefHeight(75);
  delivery.setPrefWidth(125);
  pane.getChildren().addAll(pickup, delivery);
  
  Scene scene = new Scene(pane, 300, 150);
  primaryStage.setX(800);
  primaryStage.setY(450);
  primaryStage.setTitle("Order Your Bricks "); 
  primaryStage.setScene(scene); 
  primaryStage.show();
  
//nothing special if you select pickup but for delivery....//
  
  pickup.setOnAction(new EventHandler<ActionEvent>() {
  @Override 
  public void handle(ActionEvent event) {
	  try {
		Popup.start(primaryStage);
	} catch (Exception e) {

		e.printStackTrace();
	}
  }
  });
  //delivering bricks adds 50 dollars to the order, this is where it happens//
  delivery.setOnAction(new EventHandler<ActionEvent>() {
  @Override 
  public void handle(ActionEvent event) {
	  
	  Menu.calculateOrder(50.00);
	  try {
		Popup.start(primaryStage);
	} catch (Exception e) {

		e.printStackTrace();
	}
  }
  });

  }
}