package spj27_MenuManagerTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public static ArrayList<MenuItem> readItems(String fileName) {
		
		ArrayList<MenuItem> dishes = new ArrayList<MenuItem>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				String[] split = line.split("@@");
				
				String type = split[1];
				switch(type) {
				case("entree"):
					Entree entree = new Entree(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(entree);
				break;
				case("side"):
					Side side = new Side(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(side);
				break;
				case("salad"):
					Salad salad = new Salad(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(salad);
				break;
				case("dessert"):
					Dessert dessert = new Dessert(split[0], split[2], Integer.parseInt(split[3]), Double.parseDouble(split[4]));
				dishes.add(dessert);
				break;
				}
			}
			
			br.close();
			fr.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return dishes;
	
	}
	
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		
		try {
			
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < menus.size(); i++) {
				System.out.println("Loop " + i);
				
				bw.write(menus.get(i).getName());
				bw.newLine();
				bw.newLine();
				
				// entree
				bw.write(menus.get(i).getEntree().getName());
				bw.newLine();
				bw.write(menus.get(i).getEntree().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getEntree().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getEntree().getPrice()));
				bw.newLine();
				bw.newLine();
				
				// side
				bw.write(menus.get(i).getSide().getName());
				bw.newLine();
				bw.write(menus.get(i).getSide().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSide().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSide().getPrice()));
				bw.newLine();
				bw.newLine();
				
				// salad
				bw.write(menus.get(i).getSalad().getName());
				bw.newLine();
				bw.write(menus.get(i).getSalad().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSalad().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSalad().getPrice()));
				bw.newLine();
				bw.newLine();
				
				// dessert
				bw.write(menus.get(i).getDessert().getName());
				bw.newLine();
				bw.write(menus.get(i).getDessert().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getDessert().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getDessert().getPrice()));
				bw.newLine();
				bw.newLine();
				
				// total calories
				bw.write("Total Calories: " + menus.get(i).totalCalories());
				bw.newLine();
				
				// total price
				bw.write("Total Price: " + menus.get(i).totalPrice());
				bw.newLine();
				bw.newLine();
				
			}
			
			bw.close();
			fw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
	
	/* OLD CODE
	public static ArrayList<Entree> readEntrees(String fileName) {
		
		ArrayList<Entree> entrees = new ArrayList<Entree>();
		
		String dir = printCurrentWorkingDirectory4();
		String path = dir + "/data/entrees.txt";
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while ((line = br.readLine()) != null) {
				String[] entreeItems = line.split("@@");
				
				if (entreeItems.length == 3) {
					String entree = entreeItems[0];
					String description = entreeItems[1];
					int calories = Integer.parseInt(entreeItems[2]);
					
					Entree e = new Entree(entree, description, calories);
					entrees.add(e);
				}
				
			}	br.close();
			
		}
		  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return entrees;
		
	} 
	
	public static ArrayList<Side> readSides(String fileName) {
		
		ArrayList<Side> sides = new ArrayList<Side>();
		
		String dir = printCurrentWorkingDirectory4();
		String path = dir + "/data/sides.txt";
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while ((line = br.readLine()) != null) {
				String[] sideItems = line.split("@@");
				
				if (sideItems.length == 3) {
					String side = sideItems[0];
					String description = sideItems[1];
					int calories = Integer.parseInt(sideItems[2]);
					
					Side s = new Side(side, description, calories);
					sides.add(s);
				}
				
			}	br.close();
			
		}
		  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		)return sides;
		
	}
	
	public static ArrayList<Salad> readSalads(String fileName) {
		
		ArrayList<Salad> salads = new ArrayList<Salad>();
		
		String dir = printCurrentWorkingDirectory4();
		String path = dir + "/data/salads.txt";
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while ((line = br.readLine()) != null) {
				String[] saladItems = line.split("@@");
				
				if (saladItems.length == 3) {
					String salad = saladItems[0];
					String description = saladItems[1];
					int calories = Integer.parseInt(saladItems[2]);
					
					Salad l = new Salad(salad, description, calories);
					salads.add(l);
				}
				
			}	br.close();
			
		}
		  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return salads;
		
	}
	
	public static ArrayList<Dessert> readDesserts(String fileName) {
		
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		
		String dir = printCurrentWorkingDirectory4();
		String path = dir + "/data/desserts.txt";
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			while ((line = br.readLine()) != null) {
				String[] dessertItems = line.split("@@");
				
				if (dessertItems.length == 3) {
					String dessert = dessertItems[0];
					String description = dessertItems[1];
					int calories = Integer.parseInt(dessertItems[2]);
					
					Dessert d = new Dessert(dessert, description, calories);
					desserts.add(d);
				}
				
			}	br.close();
			
		}
		  catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return desserts;
		
	}
	
	private static String printCurrentWorkingDirectory4() {
		String userDirectory = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
		System.out.println(userDirectory);
		return userDirectory;
	}
	
}
*/
