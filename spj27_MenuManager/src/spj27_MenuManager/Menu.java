package spj27_MenuManager;
import spj27_MenuManager.Entree;
import spj27_MenuManager.Side;
import spj27_MenuManager.Salad;
import spj27_MenuManager.Dessert;

/**
 * Class Menu
	 * author : Sean Jacobs
 * created: 10/15/2022
 */

public class Menu
{
    String name;
    Entree entree;
    Side side;
    Salad salad;
    Dessert dessert;
    public Menu(String name, Entree entree, Salad salad)
    {
        this.name = name;
        this.entree = entree;
        this.side = null;
        this.salad = salad;
        this.dessert = null;
    }
    public Menu(String name, Side side,Salad salad)
    {
        this.name = name;
        this.entree = null;
        this.side = side;
        this.salad = salad;
        this.dessert = null;
    }
    public Menu(String name, Entree entree, Side side,Salad salad, Dessert dessert)
    {
        this.name = name;
        this.entree = entree;
        this.side = side;
        this.salad = salad;
        this.dessert = dessert;
    }
    public double totalCals()
    {
        double totalCals = 0.0;
        if(this.entree!=null)
        {
            totalCals += this.entree.getCal();
        }
         if(this.side != null)
        {
            totalCals += this.side.getCal();
        }
         if(this.salad != null)
        {
            totalCals += this.salad.getCal();
        }
         if(this.dessert != null)
        {
            totalCals += this.dessert.getCal();
        }
        return totalCals;
    }
    public String desc()
    {
        String desc = "";
        desc += this.name;
        desc += "\n";
        if(this.entree != null)
        {
        	desc += "Entree: " + this.entree.getName() + " ~" + " " + this.entree.getDescription();
        }else
        {
            desc += "Entree:N/A";
        }
        desc += "\n";
         if(this.side != null)
        {
            desc += "Side: " + this.side.getName() + " ~" + " " + this.side.getDescription();
        }else
        {
            desc += "Side:N/A";
        }
        desc += "\n";
         if(this.salad!=null)
        {
        	 desc += "Salad: " + this.salad.getName() + " ~" + " " + this.salad.getDescription();
        }else
        {
            desc += "Salad:N/A";
        }
        desc += "\n";
         if(this.dessert!=null)
        {
        	 desc += "Dessert: " + this.dessert.getName() + " ~" + " " + this.dessert.getDescription();
        }else
        {
            desc += "Dessert:N/A";
        }
        desc += "\n";
        return desc;
    }
}
