package lab9;

public class CD extends LibraryItem implements LoanItem{
	//fields
	
	private String band;
	private int numTracks;
	
	//constructors
	
	public CD(String band, String title, int numTracks) {
		super("CD", title);
		
		setBand(band);
		setNumTracks(numTracks);
	}
	
	//getters and setters

	public String getBand() {return band;}
	public String getTitle() {return super.getTitle();}
	public int getNumTracks() {return numTracks;}
	public String getType() {return super.getType();}
	public String getId() {return super.getId();}

	public void setBand(String band) {this.band = band;}
	public void setNumTracks(int numTracks) {this.numTracks = numTracks;}
	
	//other methods
	
	@Override
	public float calculatePrice() {
		float cents = 0.91f;
		return cents * numTracks;
	}
}
