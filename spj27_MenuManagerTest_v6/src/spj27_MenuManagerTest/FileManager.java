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
			
			for(int i =0; i < menus.size(); i++) {
				System.out.println("Loop " + i);
				
				bw.write(menus.get(i).getName());
				bw.newLine();
				bw.newLine();
				
				bw.write(menus.get(i).getEntree().getName());
				bw.newLine();
				bw.write(menus.get(i).getEntree().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getEntree().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getEntree().getPrice()));
				bw.newLine();
				bw.newLine();
				
				bw.write(menus.get(i).getSide().getName());
				bw.newLine();
				bw.write(menus.get(i).getSide().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSide().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSide().getPrice()));
				bw.newLine();
				bw.newLine();
				
				bw.write(menus.get(i).getSalad().getName());
				bw.newLine();
				bw.write(menus.get(i).getSalad().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSalad().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getSalad().getPrice()));
				bw.newLine();
				bw.newLine();
				
				bw.write(menus.get(i).getDessert().getName());
				bw.newLine();
				bw.write(menus.get(i).getDessert().getDescription());
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getDessert().getCalories()));
				bw.newLine();
				bw.write(String.valueOf(menus.get(i).getDessert().getPrice()));
				bw.newLine();
				bw.newLine();
				
				bw.write("Total Calories: " + menus.get(i).totalCalories());
				bw.newLine();
				
				//bw.write("Total Price: " + menus.get(i).totalPrice();
				//bw.newLine();
				//bw.newLine();
				
			}
			
			bw.close();
			fw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
