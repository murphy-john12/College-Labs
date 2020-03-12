package ie.itcarlow.lab5;

public class Point {
	//variables
	private int x;
	private int y;
	
	
	//constructors
	
	//default constructor
	public Point() { this(0, 0); }
	
	/* Point constructor given all 
	 * required fields.  */
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	
	//getters and setters
	public int getX() {return x;} //return x coordinate
	public int getY() {return y;} //return y coordinate
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
		
	
	//misc methods
	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
