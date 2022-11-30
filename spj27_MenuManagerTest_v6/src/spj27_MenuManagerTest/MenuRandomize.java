package spj27_MenuManagerTest;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {

	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	
	public Menu randomMenu() {
		
		Random rand = new Random();
		int randEntree = rand.nextInt(entrees.size());
		Entree randomEntree = entrees.get(randEntree);
		int randSide = rand.nextInt(sides.size());
		Side randomSide = sides.get(randSide);
		int randSalad = rand.nextInt(salads.size());
		Salad randomSalad = salads.get(randSalad);
		int randDessert = rand.nextInt(desserts.size());
		Dessert randomDessert = desserts.get(randDessert);
		return new Menu("Menu 1", randomEntree, randomSide, randomSalad, randomDessert);
		
	}
}
