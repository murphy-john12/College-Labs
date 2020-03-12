package ie.itcarlow.lab2;

public class Lab2aq1 {

	public static void main(String[] args) {
		HotelRoom roomA = new HotelRoom(200, "Single");
		HotelRoom roomB = new HotelRoom(201, "Double");
		
		System.out.println(	"RoomA:  Number = " + roomA.getRoomNumber() +
							". Type  = " + roomA.getRoomType());
		
		System.out.println(	"Roomb:  Number = " + roomB.getRoomNumber() +
				". Type  = " + roomB.getRoomType());
	}
}
