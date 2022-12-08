package spj27_MenuManagerTest;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuManagerGUI {

	private JFrame mainMenuWindow;
	private JLabel lblEntree, lblSide, lblSalad, lblDessert;
	
	public MenuManagerGUI() {
		
		buildWindow();
		
	}
	
	private void buildWindow() {
		
		mainMenuWindow = new JFrame("Here is my menu");
		mainMenuWindow.setBounds(20, 20, 500, 500);
		mainMenuWindow.setLayout(null);
		
		
		lblEntree = new JLabel("Entree: ");
		lblEntree.setBounds(10, 10, 80, 30);
		mainMenuWindow.getContentPane().add(lblEntree);
		
		lblSide = new JLabel("Side: ");
		lblSide.setBounds(10,30,80,30);
		mainMenuWindow.getContentPane().add(lblSide);
		
		lblSalad = new JLabel("Salad: ");
		lblSalad.setBounds(10,50,80,30);
		mainMenuWindow.getContentPane().add(lblSalad);
		
		lblDessert = new JLabel("Dessert: ");
		lblDessert.setBounds(10, 70, 80, 80);
		mainMenuWindow.getContentPane().add(lblDessert);
		
		mainMenuWindow.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
	}

}
