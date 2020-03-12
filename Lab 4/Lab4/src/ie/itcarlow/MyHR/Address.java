package ie.itcarlow.MyHR;

public class Address {
	//variables
	private String street;
	private String town;
	private String county;
	
	//constructors
	public Address() {
		setStreet(null);
		setTown(null);
		setCounty(null);
	}
	
	public Address(String street, String town, String county) {
		setStreet(street);
		setTown(town);
		setCounty(county);
	}
	
	//getters and setters
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setTown(String town) {
		this.town = town;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getStreet() {return street;}
	public String getCounty() {return county;}
	public String getTown() {return town;}

		
	//misc methods
	@Override
	public String toString() { // print address as string
		return "Address [street=" + getStreet() + ", town=" + getTown() + ", county=" + getCounty() + "]";
	}
}
