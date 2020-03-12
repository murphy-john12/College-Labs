package lab9;

public class Driver {

	//Driver method
	public static void main(String[] args) {
		LibraryItem[] items = new LibraryItem[2];
	
		items[0] = new Book("J.K. Rolling", "Harry Potter", 224);
		items[1] = new CD("The Beatles", "Abby Road", 8);
	
		for(int i = 0; i < items.length; i++) {
			System.out.println( "\nName: " + items[i].getTitle() +
								"\nType: " + items[i].getType() +
								"\nID: " + items[i].getId() +
								"\nPrice: £" + items[i].calculatePrice());
		}
	}
}