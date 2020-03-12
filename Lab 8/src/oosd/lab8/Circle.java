package oosd.lab8;

import java.lang.Math;

public class Circle extends TwoDShape{
	//fields
	
	private double radius;

	//constructors
	
	public Circle(String name, String colour, double radius) {
		super(name, colour);
		setRadius(radius);
	}
	
	//getters and setters
	
	public double getRadius() {return radius;}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//other methods
	
	//returns area of the circle	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
