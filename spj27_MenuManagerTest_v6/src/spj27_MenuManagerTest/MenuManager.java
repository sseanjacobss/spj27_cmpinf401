package spj27_MenuManagerTest;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private static ArrayList<Entree> entrees;
	private static ArrayList<Side> sides;
	private static ArrayList<Salad> salads;
	private static ArrayList<Dessert> desserts;
	
	public MenuManager(String dishesFile) {
		
	}
	
	public Menu randomMenu(String name) {
		
		Random rand = new Random();
		
		int randEntree = rand.nextInt(entrees.size());
		Entree randomEntree = entrees.get(randEntree);
		
		int randSide = rand.nextInt(sides.size());
		Side randomSide = sides.get(randSide);
		
		int randSalad = rand.nextInt(salads.size());
		Salad randomSalad = salads.get(randSalad);
		
		int randDessert = rand.nextInt(desserts.size());
		Dessert randomDessert = desserts.get(randDessert);
		
		return new Menu(name, randomEntree, randomSide, randomSalad, randomDessert);
		
	}
}
