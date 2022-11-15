package spj27_lab9;

public class Cylinder extends Circle {

	private double height;
	
	public Cylinder() {
		super();
		this.height = 1.0;
		
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		double volume = this.getArea() * this.getHeight();
		return volume;
	}
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		System.out.println("Volume of the cylinder: " + c.getVolume());
	}
}
