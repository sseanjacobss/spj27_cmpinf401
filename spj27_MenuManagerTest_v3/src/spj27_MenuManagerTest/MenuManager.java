package spj27_MenuManagerTest;

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private static ArrayList<Entree> entrees;
	private static ArrayList<Side> sides;
	private static ArrayList<Salad> salads;
	private static ArrayList<Dessert> desserts;
	
	
	
	public static ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public static void setEntrees(ArrayList<Entree> entrees) {
		MenuManager.entrees = entrees;
	}

	public static ArrayList<Side> getSides() {
		return sides;
	}

	public static void setSides(ArrayList<Side> sides) {
		MenuManager.sides = sides;
	}

	public static ArrayList<Salad> getSalads() {
		return salads;
	}

	public static void setSalads(ArrayList<Salad> salads) {
		MenuManager.salads = salads;
	}

	public static ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public static void setDesserts(ArrayList<Dessert> desserts) {
		MenuManager.desserts = desserts;
	}

	public MenuManager(String dishesFile) {
		
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		
		ArrayList<MenuItem> dish = FileManager.readItems(dishesFile);
		
		for(int i = 0; i < dish.size(); i++) {
			
			if(dish.get(i) instanceof Entree) {
				entrees.add((Entree) dish.get(i));
			}
			if(dish.get(i) instanceof Side) {
				sides.add((Side) dish.get(i));
			}
			if(dish.get(i) instanceof Salad) {
				salads.add((Salad) dish.get(i));
			}
			if(dish.get(i) instanceof Dessert) {
				desserts.add((Dessert) dish.get(i));
			}
		}
		
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
