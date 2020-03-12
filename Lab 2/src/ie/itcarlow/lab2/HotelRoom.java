package ie.itcarlow.lab2;

public class HotelRoom {
	private String roomType; // can either be "single" or "double"
	private int roomNumber;
	private int occupied;
	private double rate;
	
	//default constructor
	public HotelRoom() {
		this.roomType = "not set";
		this.roomNumber = 0;
		this.occupied = 0;
		this.rate = 0;
	} 
	
	//constructor for Lab2aq1
	public HotelRoom(int roomNumber, String roomType) {
		//check if given roomtype is valid as assign if so
		if(isRoomTypeValid(roomType)) 
			this.roomType = roomType;
		else 
			this.roomType = "Not Set";
		
		this.roomNumber = roomNumber;
		this.occupied = 0;
		this.rate = 0;
	} 
	
	//constructor for Lab2aq3
	public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
		this.roomNumber = roomNumber;
		
		//check if given roomtype is valid as assign if so
		if(isRoomTypeValid(roomType)) 
			this.roomType = roomType;
		else 
			this.roomType = "Not Set";
		
		this.occupied = occupied;
		this.rate = rate;
	} 
	
	
	//mutators
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setRoomType(String roomType) {
		if(isRoomTypeValid(roomType)) 
			this.roomType = roomType;
		else
			System.out.println("Error: The room type entered is invalid");
	}
	
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	//Accessors
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public String getRoomType() {
		return this.roomType;
	}
	
	//other methods
	//tests if room is Single or double as no other types are valid
	public boolean isOccupied() {
		if (this.occupied == 0) 
			return false;
		else 
			return true;
	}
	
	public boolean isRoomTypeValid(String givenRoomType) {
		switch(givenRoomType)
			{
				case "Single":
					return true;
				
				case "single":
					return true;
					
				case "double":
					return true;
				
				case "Double":
					return true;
			}
		return false;
	}
	
	public String toString() {
		String roomDetails = 	"\nNumber:\t\t" + this.roomNumber +
								"\nType:\t\t" + this.roomType +
								"\nRate:\t\t" + this.rate +
								"\nOccupied:\t" + isOccupied();
		return roomDetails;
	}
}
