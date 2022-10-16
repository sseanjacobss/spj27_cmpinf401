package spj27_MenuManager;

/**
 * Class Dessert
	 * author : Sean Jacobs
 * created: 10/15/2022
 */

public class Dessert
{
    String name;
    double cal;
    String description;
    public Dessert(String name,double cal,String description)
    {
        this.name = name;
        this.cal = cal;
        this.description = description;
    }
    public String getName()
    {
        return this.name;
    }
    public double getCal()
    {
        return this.cal;
    }
    public String getDescription()
    {
        return this.description;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCal(double cal)
    {
        this.cal = cal;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
}
