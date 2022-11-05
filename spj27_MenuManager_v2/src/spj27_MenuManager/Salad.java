package spj27_MenuManager;
import java.util.ArrayList;

/**
 * Class Salad
	 * author : Sean Jacobs
 * created: 10/15/2022
 */

public class Salad {
	
	private String name;
	private double calories;
	private String description;
    
    public Salad(String name, String description, double calories) {
        this.name = name;
        this.calories = calories;
        this.description = description;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCal() {
        return this.calories;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCal(double cal) {
        this.calories = calories;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
