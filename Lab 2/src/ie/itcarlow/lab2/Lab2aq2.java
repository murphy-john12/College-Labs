package ie.itcarlow.lab2;

public class Lab2aq2 {

	public static void main(String[] args) {
		HotelRoom roomA = new HotelRoom();
		HotelRoom roomB = new HotelRoom();
		
		roomA.setOccupied(1);
		roomA.setRate(100);
		
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		System.out.println("RoomA" + roomA.toString());
		System.out.println();
		System.out.println("RoomB" + roomB.toString());

	}

}
