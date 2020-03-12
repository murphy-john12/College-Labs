package ie.itcarlow.MyHR;

public class Employee {
	//variables
	private static int empNumberCounter = 1000; // shared among class
	private int empNumber;
	private Address empAddress;
	private String empType;// can be "STAFF" or "MANAGER"
	private String companyCarType;
	
	//constructors
	public Employee() {
		this(null, null);
	}
	
	public Employee(String empType, Address empAddress) {
		++empNumberCounter;
		setEmpNumber(empNumberCounter);
		setEmpType(empType);
		setAddress(empAddress);
	}
	
	//getters and setters
	private void setEmpNumber(int empNumberCounter) {
		empNumber = empNumberCounter;
	}
	
	private void setEmpType(String type) {
		if(isValid(type.toUpperCase()))
			empType = type.toUpperCase();
		else
			System.out.println("Err: This type is invalid. please retype.");
	}
	
	private void setAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	public void setCompanyCarType(String companyCarType) {
		this.companyCarType = companyCarType;
	}
	
	public static int noOfEmployeeRecords() {return empNumberCounter - 1000;}
	public String getEmpType() {return empType;}
	public int getEmpNumber() {return empNumber;}
	public Address getAddress() {return empAddress;}
	public String getCompanyCarType() {return companyCarType;}
	
	
	//misc methods
	private boolean isValid(String theType) {
		switch(theType)
		{
			case "STAFF":
				return true;
			case "MANAGER":
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if(empType.equalsIgnoreCase("MANAGER"))
			return "Employee [empNumber = " + getEmpNumber() + 
					", empType = " + getEmpType() +
					", CompanyCarType = " + getCompanyCarType() + 
					"]";
		else
			return "Employee [empNumber = " + getEmpNumber() + 
					", empType = " + getEmpType() + "]";
		
	}

	
}
