package lab9;

public class LibraryItem {
	//fields
	
	private String type;
	private String id;
	private String title;
	private static int idGen = 0;
	
	//constructors
	
	protected LibraryItem(String type, String title) {
		setType(type);
		setId(generateID());
		setTitle(title);
	}

	//getter and setters
	
	protected String getType() {return type;}
	protected String getId() {return id;}
	protected String getTitle() {return title;}

	private void setType(String type) {this.type = type;}
	private void setId(String id) {this.id = id;}
	private void setTitle(String title) {this.title = title;}
	
	//other methods
	
	protected float calculatePrice() {return 0.0f;}
	
	private static String generateID() {
		idGen++;
		return idGen+"";
	}
}
