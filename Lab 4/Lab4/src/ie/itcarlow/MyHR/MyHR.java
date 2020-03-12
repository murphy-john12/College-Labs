package ie.itcarlow.MyHR;

import java.util.Scanner;

public class MyHR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice = 0; // users selection
		Employee[] employees = new Employee[5];
		Office[] offices = new Office[3];
		
		for(int i = 0; i <= 2; i++) {
			Office of = new Office();
			offices[i] = of;
		}
		
		while(choice != 4) {
			System.out.println("Please select an option");
			System.out.println("1. List all Offices");
			System.out.println("2. Create a new employee record");
			System.out.println("3. List all employees");
			System.out.println("4. Exit");
			choice = in.nextInt();
			
			switch(choice) 
			{
				case 1:
					for(Office of : offices) {
						System.out.println(of);
						
						if(of.getNoOfEmps() != 0)
							System.out.println("Employee:\n" + of.printEmployee());
					}
					break;
					
				case 2:
					if(Employee.noOfEmployeeRecords() < 5) {
						String street;
						String town;
						String county;
						String empTyp;
						String compCar = null;
						
						Scanner inemp = new Scanner(System.in);
						
						System.out.println("Street:");
						street = inemp.nextLine();
						System.out.println("Town/City");
						town = inemp.nextLine();
						System.out.println("County");
						county = inemp.nextLine();
						
						Address empAddress = new Address(street, town, county);
						
						System.out.println("Employee type");
						empTyp = inemp.nextLine();
						if(empTyp.equalsIgnoreCase("Manager")) {
							System.out.println("Company car");
							compCar = inemp.nextLine();
						}
						Employee newEmp = new Employee(empTyp, empAddress);
						newEmp.setCompanyCarType(compCar);
						
						employees[Employee.noOfEmployeeRecords() - 1] = newEmp;
						for(Office of : offices) {
							if(of.getNoOfEmps() < 2) {
								of.addEmployee(newEmp);
								break;
							}
						}
					}
					else
						System.out.println("You have reached the maximum number of employees allowed.");
					
					break;
					
				case 3:
					for(Employee emp : employees) {
						if(emp != null)
							System.out.println(emp);
					}
					break;
					
				case 4:
					break;
					
				default:
					System.out.println("That is not a valid option please choose another");
			}
		}
		
		
		
		in.close();
	}

}
