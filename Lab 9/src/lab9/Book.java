package lab9;

public class Book extends LibraryItem implements LoanItem{
	//fields
	
	private String author;
	private int numPages;
	
	//constructors
	
	public Book(String author, String title, int numPages) {
		super("Book", title);
		
		setAuthor(author);
		setNumPages(numPages);
	}
	
	//getters and setters 

	public String getAuthor() {return author;}
	public String getTitle() {return super.getTitle();}
	public int getNumPages() {return numPages;}
	public String getType() {return super.getType();}
	public String getId() {return super.getId();}
	
	public void setAuthor(String author) {this.author = author;}
	public void setNumPages(int numPages) {this.numPages = numPages;}
	
	//other methods
	
	@Override
	public float calculatePrice() {
		float cents = 0.07f;
		float price = cents * numPages;
		return price;
	}
}
