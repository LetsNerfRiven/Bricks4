package Bricks4;

import javafx.beans.property.SimpleStringProperty;
//more variable declaring//
public class Mortar  {
	private SimpleStringProperty menuMortar;
	private double price;
	private int quantity;

	public  Mortar(String menuMortar,int quantity){
		this.menuMortar=new SimpleStringProperty(menuMortar);
		this.quantity=quantity;
		
	}
	
	public Mortar(double price){
		this.price=price;
	}
	
	public String getMortar(){
		return menuMortar.get();
	}
	
	public void setMortar(String menuMortar){
		this.menuMortar=new SimpleStringProperty(menuMortar);
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
	
	public String toString()
	{
		return String.format("%s", menuMortar);
	}
}
