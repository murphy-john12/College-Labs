package ie.itcarlow.Lab2b;

public class Lab2bq1 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		
		System.out.println("Length = " + rect.getLength());
		System.out.println("width = " + rect.getWidth());
		
		rect.setLength(42);
		System.out.println("Length = " + rect.getLength());
		rect.setLength(15);

		rect.setWidth(42);
		System.out.println("width = " + rect.getWidth());
		rect.setWidth(33);
		
		System.out.println("\n\n" + rect.toString());
		
	}

}
