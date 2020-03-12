package oosd.lab7;

public class Vet {
	public String name;
	
	public Vet(String name) {
		setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void vaccinate(Animal animal) {
		System.out.println(name + " is vaccinating.");
		
		if(animal instanceof Dog) {
			System.out.println(animal.getType() + " has been vaccinated: " + animal.toString());
		}
		else if(animal instanceof Cat) {
			System.out.println(animal.getType() + " has been vaccinated: " + animal.toString());
		}
		else {
			System.out.println(animal.getType() + " has been vaccinated: " + animal.toString());
		}
	}
}
