package oosd.lab8;

public class Rectangle extends TwoDShape{
	//fields
	
	private double length;
	private double width;

	//constructors
	
	public Rectangle(String name, String colour, double length, double width) {
		super(name, colour);
		setLength(length);
		setWidth(width);
	}
	
	//getters and setters
	
	public double getLength() {return length;}
	public double getWidth() {return width;}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	//other methods
	
	//returns area of the rectangle
	@Override
	public double area() {
		return length * width;
	}
}
