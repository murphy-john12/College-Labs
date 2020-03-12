package ie.itcarlow.MyHR;

public class Office {
	private static int roomNumberCounter = 100; //shared counter for room numbers
	private int roomNumber; // individual room number
	private int noOfEmps; //number of emps assigned to the office
	private Employee[] emps = new Employee[2];
	
	//constructors
	public Office() {
		setRoomNumber(roomNumberCounter);
		++roomNumberCounter;
	}
	
	
	//getters and setters
	public int getRoomNumber() {return roomNumber;}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getNoOfEmps() {return noOfEmps;}

	public void setNoOfEmps(int noOfEmps) {
		this.noOfEmps = noOfEmps;
	}

	//misc methods
	
	public void addEmployee(Employee newEmp) {
		if(noOfEmps < 2) {
			emps[noOfEmps] = newEmp;
			++noOfEmps;
		}
		else
			System.out.print("we have reached max number of emplyees!");			
	}
	
	public String printEmployee() {
		String empRecord = "";
		for(Employee emp : emps) {
			if(emp != null) {
				empRecord += "Employee " +  emp.getEmpNumber() + "," + emp.getAddress() + "\n";
			}
		}
		return empRecord;
	}
	
	//toString
	@Override
	public String toString() { 
		return "Office [roomNumber=" + roomNumber + ", noOfEmps=" + noOfEmps + "]";
	}
}
