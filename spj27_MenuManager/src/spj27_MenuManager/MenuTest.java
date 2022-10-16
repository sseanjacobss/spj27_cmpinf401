package spj27_MenuManager;
import spj27_MenuManager.Entree;
import spj27_MenuManager.Side;
import spj27_MenuManager.Salad;
import spj27_MenuManager.Dessert;
import spj27_MenuManager.Menu;

/**
 * Class MenuTest
	 * author : Sean Jacobs
 * created: 10/15/2022
 */



public class MenuTest
{
    public static void main(String[] args)
    {
        Entree entree1 = new Entree("Sirloin Steak", 552, "A delicious piece of 1/2 a pound of our carefully selected meat grilled and seasoned. Choose how much you want it cooked. \n");
        Entree entree2 = new Entree("Baby Back Ribs" , 1000, "Freshly grilled ribs slathered in our signature BBQ sauce.");
        
        Side side = new Side("Mashed Potatoes", 300, "Our world famous mashed potatoes topped with our creamy housemade butter.");
        
        Salad salad1 = new Salad("Cesear", 250, "Freshly chopped romaine lettuce, with grilled chicken, freshly grated parmesean cheese, and our signature cesear dressing");
        Salad salad2 = new Salad("Cobb", 300, "iceberg lettuce, watercress, endives and romaine lettuce. Tomato, crisp bacon, fried chicken breast, hard-boiled eggs, avocado, chives, blue cheese, and red-wine vinaigrette.");
        
        Dessert dessert = new Dessert("Chocolate Cake", 456, "Dark chocolate cake, with hot fudge. Served with vanilla ice cream on top.");
        
        Menu menu1= new Menu("Menu1 name", entree1, salad1);
        System.out.println(menu1.desc());
        System.out.println("Total Calories: " + menu1.totalCals());
        System.out.println("");
        
        Menu menu2 = new Menu("Menu2 name", entree2, side, salad2, dessert);
        System.out.println(menu2.desc());
        System.out.println("Total Calories: " + menu2.totalCals());
    }
}
