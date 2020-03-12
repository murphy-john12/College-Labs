package ie.itcarlow.lab5;

public class Circle extends Point{
	//variables
	private int radius;
	
	
	//constructors
	
	//default constructor
	public Circle() {}
	
	/* Point constructor given all 
	 * required fields.  */
	public Circle(int x, int y, int radius) {
		super(x, y);
		setRadius(radius);
	}

	
	//getters and setters
	public int getRadius() {return radius;}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

		
	//misc methods
	
	//toString
	@Override
	public String toString() {
		return "Inherited from Point: x = " + super.getX() + ", y = " + super.getY() +". Circle [radius=" + radius + "]";
	}
}
