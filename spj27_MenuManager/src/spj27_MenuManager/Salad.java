package spj27_MenuManager;

/**
 * Class Salad
	 * author : Sean Jacobs
 * created: 10/15/2022
 */

public class Salad
{
    String name;
    double cal;
    String description;
    public Salad(String name,double cal,String description)
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
