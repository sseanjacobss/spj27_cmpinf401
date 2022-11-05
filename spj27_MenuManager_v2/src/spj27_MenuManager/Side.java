package spj27_MenuManager;
import java.util.ArrayList;

/**
 * Class Side
	 * author : Sean Jacobs
 * created: 10/15/2022
 */

public class Side {
	
    private String name;
    private double calories;
    private String description;
    
    public Side(String name, String description, double calories) {
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
    
    public void setCal(double calories) {
        this.calories = calories;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
