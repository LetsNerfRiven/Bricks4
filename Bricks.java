package Bricks4;

import javafx.beans.property.SimpleStringProperty;
//Variable Declarations, these are used on the receipt page mostly//
public class Bricks  {
	private SimpleStringProperty menuBricks;
	private double price;
	private int quantity;

	public  Bricks(String menuBricks,int quantity){
		this.menuBricks=new SimpleStringProperty(menuBricks);
		this.quantity=quantity;
	
	}
	
	public Bricks( double price){
		this.price=price;
	}
	
	public String getBricks(){
		return menuBricks.get();
	}
	
	public void setMenuBricks(String menuBricks ){
		this.menuBricks=new SimpleStringProperty(menuBricks);
	}
	
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity=quantity;
	}
	
	public String toString(){
		return String.format("%s", menuBricks);
	}
	
}
