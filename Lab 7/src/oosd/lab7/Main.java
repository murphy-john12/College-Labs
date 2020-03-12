package oosd.lab7;

public class Main {

	public static void main(String[] args) {
		Vet theVet = new Vet("Dr. Byrne");
		Animal aDog = new Dog(9, 'M');
		Animal aCat = new Cat(10, 'F');
		
		theVet.vaccinate(aDog);
		
		System.out.println();
		
		theVet.vaccinate(aCat);
	}

}
