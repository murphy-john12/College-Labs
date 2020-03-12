package ie.itcarlow.Lab2b;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() { //default constructor
		length = 1;
		width = 1;
	}
	
	public Rectangle(double length, double width) {
		if( isSizeValid(length) ) 
			this.length = length;
		else
			this.length = 1;
		
		if( isSizeValid(width) ) 
			this.width = width;
		else
			this.width = 1;
	}
	
	
	//mutators
	public void setLength(double length) { // set the rectangles length
		if( isSizeValid(length) ) 
			this.length = length;
		else
			System.out.println("\nError: Size must be between 0.0 and 40.0\n");
	}
	
	public void setWidth(double width) { // set the rectangles width
		if( isSizeValid(width) ) 
			this.width = width;
		else
			System.out.println("\nError: Size must be between 0.0 and 40.0\n");
	}
	
	
	//Accessors
	public double getLength() { // returns the rectangles length
		return this.length;
	}
	
	public double getWidth() { // returns the rectangles width
		return this.width;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return (length * 2) + (width * 2);
	}
	
	
	//other methods
	private boolean isSizeValid(double sizeIn) { // tests if size is between 0.0 ad 40.0
		if (sizeIn >= 0.0 && sizeIn <= 40.0)
			return true;
		else
			return false;
	}
	
	public void printRectangle() {
		for (int i = 0; i < length; i++)// prints length
			System.out.print("*");
		
		System.out.println();
		
		for (int i = 0; i < width; i++) {
			System.out.print("*");
			
			for (int j = 0; j < length; j++)
				if (j == length-2)
					System.out.print("*");
				else
					System.out.print(" ");	
			
			System.out.println();				
		}
			
			
		
		for (int i = 0; i < length; i++)// prints length
			System.out.print("*");
		
	}
	
	public String toString() {
		return "Length = " + length + 
				",\tWidth = " + width +
				"\nArea = " + getArea() +
				",\tPerimeter = " + getPerimeter();
	}
}
