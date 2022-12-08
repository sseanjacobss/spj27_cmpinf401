package spj27_MenuManagerTest;

public class Entree extends MenuItem {
	
	public Entree(String name, String description, int calories, double price) {
		super(name, description, calories, price);
	}
	
}



/* OLD CODE
public class Entree {

	private String name;
	private String description;
	private int calories;
	
	public Entree (String name, String desc, int cal) {
		this.name = name;
		this.description = desc;
		this.calories = cal;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return this.description;
	}
	
	public void setDesc(String description) {
		this.description = description;
	}
	
	public int getCal() {
		return this.calories;
	}
	
	public void setCal(int calories) {
		this.calories = calories;
	}
}
*/
