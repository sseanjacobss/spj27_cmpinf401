package spj27_MenuManager;
import java.io.BufferedOutputStream;
//import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileReader;
//import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Class FileManager
 * @author seanjacobs
 * created 11/4/2022
 */
public class FileManager {


	public static void main(String[] args) {

		System.out.println("\n Entrees:");
		for(Entree e : readEntrees("entrees.txt")) {
			System.out.println(e.toString());
		}

		System.out.println("\n Sides:");
		for(Side s : readSides("sides.txt")) {
			System.out.println(s.toString());
		}

		System.out.println("\n Salads:");
		for(Salad l : readSalads("salads.txt")) {
			System.out.println(l.toString());
		}

		System.out.println("\n Desserts:");
		for(Dessert d : readDesserts("desserts.txt")) {
			System.out.println(d.toString());
		}
	}

	private static ArrayList<Entree> entreeList;
	private static ArrayList<Side> sideList;
	private static ArrayList<Salad> saladList;
	private static ArrayList<Dessert> dessertList;

	
	/**
	 * Method readEntrees
	 * @param fileName
	 * @return
	 */
	
	public static ArrayList<Entree> readEntrees(String fileName){

		entreeList = new ArrayList<Entree>();

		try {
			Scanner scanner = new Scanner(new File(Paths.get("").toAbsolutePath().toString()+"//data//"+fileName));
			//FileReader fr = new FileReader(scanner);
			//BufferedReader br = new BufferedReader(fr);
			//String line = null;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] entreeItems = line.split("@@");

				if(entreeItems.length == 3) {
					String entree = entreeItems[0];
					String description = entreeItems[1];
					double calories = Double.parseDouble(entreeItems[2]);
					Entree e = new Entree(entree, description, calories);
					entreeList.add(e);
				}
			}
			//br.close();
			//fr.close();

		} catch (FileNotFoundException x) {
			x.printStackTrace();
		} //catch (IOException e) {
		//e.printStackTrace();
		//}
		return entreeList;
	}

	/**
	 * Method readSides
	 * @param fileName
	 * @return
	 */
	
	public static ArrayList<Side> readSides(String fileName) {

		sideList = new ArrayList<Side>();

		try {
			Scanner scanner = new Scanner(new File(Paths.get("").toAbsolutePath().toString()+"//data//"+fileName));
			//FileReader fr = new FileReader(dataPath);
			//BufferedReader br = new BufferedReader(fr);
			//String line = null;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] sideItems = line.split("@@");

				if(sideItems.length == 3) {
					String side = sideItems[0];
					String description = sideItems[1];
					double calories = Double.parseDouble(sideItems[2]);
					Side s = new Side(side, description, calories);
					sideList.add(s);
				}
			}
			//br.close();
			//fr.close();

		} catch (FileNotFoundException x) {
			x.printStackTrace();
		} //catch (IOException e) {
		//e.printStackTrace();
		//}
		return sideList;
	}

	/**
	 * Method readSalads
	 * @param fileName
	 * @return
	 */
	
	public static ArrayList<Salad> readSalads(String fileName) {

		saladList = new ArrayList<Salad>();

		try {
			Scanner scanner = new Scanner(new File(Paths.get("").toAbsolutePath().toString()+"//data//"+fileName));
			//FileReader fr = new FileReader(dataPath);
			//BufferedReader br = new BufferedReader(fr);
			//String line = null;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] saladItems = line.split("@@");

				if (saladItems.length == 3) {
					String salad = saladItems[0];
					String description = saladItems[1];
					double calories = Double.parseDouble(saladItems[2]);
					Salad l = new Salad(salad, description, calories);
					saladList.add(l);
				}
			} 
			//br.close();
			//fr.close();

		} catch (FileNotFoundException x) {
			x.printStackTrace();
		} //catch (IOException e) {
		//e.printStackTrace();
		//}
		return saladList;
	}

	/**
	 * Method readDesserts
	 * @param fileName
	 * @return
	 */
	
	public static ArrayList<Dessert> readDesserts(String fileName) {

		dessertList = new ArrayList<Dessert>();

		try {
			Scanner scanner = new Scanner(new File(Paths.get("").toAbsolutePath().toString()+"//data//"+fileName));
			//FileReader fr = new FileReader(dataPath);
			//BufferedReader br = new BufferedReader(fr);
			//String line = null;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] dessertItems = line.split("@@");

				if (dessertItems.length == 3) {
					String dessert = dessertItems[0];
					String description = dessertItems[1];
					double calories = Double.parseDouble(dessertItems[2]);
					Dessert d = new Dessert(dessert, description, calories);
					dessertList.add(d);
				}
			}
			//br.close();
			//fr.close();

		} catch (FileNotFoundException x ) {
			x.printStackTrace();
		} //catch (IOException e) {
		//e.printStackTrace();
		//}
		return dessertList;
	} 
	
	public class Entrees extends Food {
		public Entrees(String name, String description, double calories) {
			super(name, description, calories);
		}
	}

	public class Sides extends Food {
		public Sides(String name, String description, double calories) {
			super(name, description, calories);
		}
	}

	public class Salads extends Food {
		public Salads(String name, String description, double calories) {
			super(name, description, calories);
		}
	}

	public class Desserts extends Food {
		public Desserts(String name, String description, double calories) {
			super(name, description, calories);
		}
	}

	public class Food {
		private String name;
		private String description;
		private double calories;

		public Food(String name, String description, double calories) {
			this.name = name;
			this.description = description;
			this.calories = calories;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getCalories() {
			return calories;
		}

		public void setCalories(double calories) {
			this.calories = calories;
		}

		@Override
		public String toString() {
			return "Name:" + name
					+ "\n Description:" + description
					+ "\n Calories:" + calories;
		}
	}


	public static ArrayList<Entree> getEntreeList() {
		return entreeList;
	}

	public static void setEntreeList(ArrayList<Entree> entreeList) {
		FileManager.entreeList = entreeList;
	}

	public static ArrayList<Side> getSideList() {
		return sideList;
	}

	public static void setSideList(ArrayList<Side> sideList) {
		FileManager.sideList = sideList;
	}

	public static ArrayList<Salad> getSaladList() {
		return saladList;
	}

	public static void setSaladList(ArrayList<Salad> saladList) {
		FileManager.saladList = saladList;
	}

	public static ArrayList<Dessert> getDessertList() {
		return dessertList;
	}

	public static void setDessertList(ArrayList<Dessert> dessertList) {
		FileManager.dessertList = dessertList;
	}


}

