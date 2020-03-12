package ie.itcarlow.lab2;

public class Lab2aq4 {
	
	public void setRoomOccupiedStatus (HotelRoom theRoom, int statusUpdate) {
		// can only set new occupied status if room is not occupied
		if(theRoom.isOccupied() == false) {
			theRoom.setOccupied(statusUpdate);
			System.out.print("\n\nRoom Status updated.");
		}
		else
			System.out.print("\n\nRoom Status could not be updated. Room is occupied.");
	}

	public static void main(String[] args) {
		Lab2aq4 lab2qa4 = new Lab2aq4();
		
		// creating a HotelRoom object that is initialized as vacant
		HotelRoom roomD = new HotelRoom(202, "Double", 0, 150); 
		
		//room is set to vacant - successful
		lab2qa4.setRoomOccupiedStatus(roomD, 0);
		
		//room is set to occupied - successful
		lab2qa4.setRoomOccupiedStatus(roomD, 1);
		
		//room is set to vacant - failed as it is occupied
		lab2qa4.setRoomOccupiedStatus(roomD, 0);
		
	}
}
