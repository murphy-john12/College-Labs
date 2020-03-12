package oosd.lab8;

public class Cylinder extends ThreeDShape {
	//fields
	
	private double radius;
	private double heigth;
	
	//constructors
	
	public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);
	}

	public double getRadius() {return radius;}
	public double getHeigth() {return heigth;}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	//getters and setters
	
	//returns the volume of the cylinder
	@overrride
	public double volume() {
		
	}
}
