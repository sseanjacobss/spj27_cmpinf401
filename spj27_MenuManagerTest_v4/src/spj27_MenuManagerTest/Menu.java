package spj27_MenuManagerTest;

public class Menu {
	
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;
	
	public Menu (String name) {
		this.name = name;
		this.entree = null;
		this.salad = null;
		this.side = null;
		this.dessert = null;
	}
	
	public Menu (String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.salad = null;
		this.side = side;
		this.dessert = null;
	}
	
	public Menu (String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.salad = salad;
		this.side = side;
		this.dessert = dessert;
	}
	
	public int totalCalories() {
		
		int totalCals = 0;
		
		if(entree != null) {
			totalCals += this.entree.getCalories();
		} 
		if(side != null) {
			totalCals += this.side.getCalories();
		}
		if(salad != null) {
			totalCals += this.salad.getCalories();
		}
		if(dessert != null) {
			totalCals += this.dessert.getCalories();
		}
		
		return totalCals;
	}
	
	public double totalPrice() {
		
		double totalPrice = 0.0;
		
		if(entree != null) {
			totalPrice += this.entree.getPrice();
		}
		if(side != null) {
			totalPrice += this.side.getPrice();
		}
		if(salad != null) {
			totalPrice += this.salad.getPrice();
		}
		if(dessert != null) {
			totalPrice += this.dessert.getPrice();
		}
		
		return totalPrice;
	}
	
	public String description() {

        String desc = "";
        desc += this.name;
        desc += "\n";
        
        if(this.entree != null) {
        	desc += "Entree: " + this.entree.getName() + " - " + this.entree.getDescription() + ", " + this.entree.getCalories() + "cal";
        } else {
            desc += "Entree: N/A";
        }
        
        desc += "\n";
        
         if(this.side != null) {
            desc += "Side: " + this.side.getName() + " - " + this.side.getDescription() + ", " + this.side.getCalories() + "cal";
        } else {
            desc += "Side: N/A";
        }
         
        desc += "\n";
        
         if(this.salad!=null) {
        	 desc += "Salad: " + this.salad.getName() + " - " + this.salad.getDescription() + ", " + this.salad.getCalories() + "cal";
        } else {
            desc += "Salad: N/A";
        }
         
        desc += "\n";
        
         if(this.dessert!=null) {
        	 desc += "Dessert: " + this.dessert.getName() + " - " + this.dessert.getDescription() + ", " + this.dessert.getCalories() + "cal";
        } else {
            desc += "Dessert: N/A";
        }
         
        desc += "\n";
        
        return desc;
    }

	public String getName() {
	 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	
	@Override
	public String toString() {
		return name;
	}
}
