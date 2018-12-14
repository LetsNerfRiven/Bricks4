package Bricks4;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;
//declaring all the variables we will be using//
public class MainPageController implements Initializable {
	
	static ArrayList<String> menu = new ArrayList<>();
	static ArrayList<Integer> quant = new ArrayList<>();
	static ArrayList<Double> price = new ArrayList<>();
 	
    @FXML private TableView<Bricks> tableView1;
    @FXML private TableColumn<Bricks, String> OrderItemColumn1;
    @FXML private TableColumn<Bricks, Integer> QuantityColumn1;
    
    @FXML private TableView<Mortar> tableView2;
    @FXML private TableColumn<Mortar, String> OrderItemColumn2;
    @FXML private TableColumn<Mortar, Integer> QuantityColumn2;
    
    @FXML private RadioButton TraditionalRed;
    @FXML private RadioButton DarkGray;
    @FXML private RadioButton PaleIvory;
    @FXML private RadioButton Slate;
    @FXML private RadioButton White;
    
    @FXML private RadioButton GrayMortar;
    @FXML private RadioButton WhiteMortar;
    @FXML private RadioButton DarkGrayMortar;
    @FXML private RadioButton LightGrayMortar;
    @FXML private RadioButton BlackMortar;
    
    @FXML private Button AddBrick;
    @FXML private Button AddMortar;
    @FXML private Button DeleteBtn;
    @FXML private Button ProceedBtn;
    
    @FXML private TextField quantityBricks;
    @FXML private TextField quantityMortar;
    
    @FXML private Label quantityLabel1;
    @FXML private Label quantityLabel2;
	//manages items for the order pane
    @Override
    public void initialize(URL url, ResourceBundle rb) {
		
		OrderItemColumn1.setCellValueFactory(new PropertyValueFactory<Bricks, String>("Bricks"));
		QuantityColumn1.setCellValueFactory(new PropertyValueFactory<Bricks, Integer>("quantity"));
		
		OrderItemColumn1.setCellFactory(TextFieldTableCell.forTableColumn());
		
		tableView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		OrderItemColumn2.setCellValueFactory(new PropertyValueFactory<Mortar, String>("Mortar"));
		QuantityColumn2.setCellValueFactory(new PropertyValueFactory<Mortar, Integer>("quantity"));
		
		OrderItemColumn2.setCellFactory(TextFieldTableCell.forTableColumn());
		
		tableView2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
    //manages brick types
    @FXML
    public void newBricksButtonPushed()
    {
    	
    	
    	if(TraditionalRed.isSelected()){
    		 Integer value = Integer.valueOf(quantityBricks.getText());
    		 
    	     Bricks newBricks = new Bricks("Traditional Red" ,value);
    	     tableView1.getItems().add(newBricks);
    	     
    	     menu.add("Traditional Red");
    	     quant.add(value);
    	     price.add(value*8.00);
    	     
    	     Menu.calculateOrder(8.00*value);
    	}
    	
    	else if(DarkGray.isSelected()){
   		 Integer value = Integer.valueOf(quantityBricks.getText());
   		 
   	     Bricks newBricks = new Bricks("Dark Gray" ,value);
   	     tableView1.getItems().add(newBricks);
   	     
	     menu.add("Dark Gray");
	     quant.add(value);
	     price.add(value*1.25);
	     
	     Menu.calculateOrder(1.25*value);
   	}
    	
    	else if(PaleIvory.isSelected()){
   		 Integer value = Integer.valueOf(quantityBricks.getText());
   		 
   	     Bricks newBricks = new Bricks("Pale Ivory" ,value);
   	     tableView1.getItems().add(newBricks);
   	     
	     menu.add("Pale Ivory");
	     quant.add(value);
	     price.add(value*2.00);
	     
	     Menu.calculateOrder(2.00*value);
   	}
    	
    	else if(Slate.isSelected()){
   		 Integer value = Integer.valueOf(quantityBricks.getText());
   		 
   	     Bricks newBricks = new Bricks("Slate" ,value);
   	     tableView1.getItems().add(newBricks);
   	     
	     menu.add("Slate");
	     quant.add(value);
	     price.add(value*1.50);
	     
	     Menu.calculateOrder(1.50*value);
   	}
    	
    	else if(White.isSelected()){
   		 Integer value = Integer.valueOf(quantityBricks.getText());
   		 
   	     Bricks newBricks = new Bricks("White" ,value);
   	     tableView1.getItems().add(newBricks);
   	     
	     menu.add("White");
	     quant.add(value);
	     price.add(value*2.50);
	     
	     Menu.calculateOrder(2.50*value);
   	}
}//manages mortar types
    @FXML
    public void newMortarButtonPushed()
    {
    	if(GrayMortar.isSelected()){
    		 Integer value = Integer.valueOf(quantityMortar.getText());
    		 
    	     Mortar newMortar = new Mortar("Gray Mortar" ,value);
    	     tableView2.getItems().add(newMortar);
    	     
    	     menu.add("Gray Mortar");
    	     quant.add(value);
    	     price.add(value*7.00);
    	     
    	     Menu.calculateOrder(7.00*value);
    	}
    	
    	else if(WhiteMortar.isSelected()){
   		 Integer value = Integer.valueOf(quantityMortar.getText());
   		 
   	     Mortar newMortar = new Mortar("White" ,value);
   	     tableView2.getItems().add(newMortar);
   	     
	     menu.add("White");
	     quant.add(value);
	     price.add(value*5.00);
	     
	     Menu.calculateOrder(5.00*value);
   	}
    	else if(DarkGrayMortar.isSelected()){
   		 Integer value = Integer.valueOf(quantityMortar.getText());
   		 
   	     Mortar newMortar = new Mortar("Dark Gray" ,value);
   	     tableView2.getItems().add(newMortar);
   	     
	     menu.add("Dark Gray");
	     quant.add(value);
	     price.add(value*6.00);
	     
	     Menu.calculateOrder(6.00*value);
   	}
    	else if(LightGrayMortar.isSelected()){
   		 Integer value = Integer.valueOf(quantityMortar.getText());
   		 
   	     Mortar newMortar = new Mortar("Light Gray" ,value);
   	     tableView2.getItems().add(newMortar);
   	     
	     menu.add("Light Gray");
	     quant.add(value);
	     price.add(value*6.50);
	     
	     Menu.calculateOrder(6.50*value);
   	}
    	else if(BlackMortar.isSelected()){
   		 Integer value= Integer.valueOf(quantityMortar.getText());
   		 
   	     Mortar newMortar = new Mortar("Black" ,value);
   	     tableView2.getItems().add(newMortar);
   	     
	     menu.add("Black");
	     quant.add(value);
	     price.add(value*8.00);
	     
	     Menu.calculateOrder(8.00*value);
   	}
}
    @FXML//proceed button on the order selection screen
	public void proceedBtn(ActionEvent event) throws IOException{
		Parent receiptPage = FXMLLoader.load(getClass().getResource("/bricks4/Receipt.fxml"));
		Scene receiptPageScene = new Scene(receiptPage);
		
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(receiptPageScene);
		window.show();
	}
    @FXML//deleting items you made a mistake on
    public void deleteButtonPushed()
    {
        ObservableList<Bricks> selectedRows1, allOrder1;
        allOrder1 = tableView1.getItems();
        
        selectedRows1 = tableView1.getSelectionModel().getSelectedItems();
        
        for (Bricks brick: selectedRows1)
        {
            allOrder1.remove(brick);
        }
        
        ObservableList<Mortar> selectedRows2, allOrder2;
        allOrder2 = tableView2.getItems();
        
        selectedRows2 = tableView2.getSelectionModel().getSelectedItems();
        
        for (Mortar mortars: selectedRows2)
        {
            allOrder2.remove(mortars);
        }
    }
    
    public static ArrayList<String> getMenu(){
    	return menu;
    }
    
    public static ArrayList<Integer> getQuant(){
    	return quant;
    }
    
    public static ArrayList<Double> getPrice(){
    	return price;
    }
}