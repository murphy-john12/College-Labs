package oosd.lab7;

public class Dog extends Animal{

	public Dog(int age, char gender) {
		super("Dog", age, gender);
	}
	
	@Override
	public void eat() {
		System.out.println("The Dog is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("The dog is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println("roof!");
	}

	public void wagtail () {
		System.out. println ("Tail is wagging");
	}

	@Override
	public String toString() {
		return "Dog [" + "age: " + super.getAge() + ", gender: " + super.getGender() + " ]";
	}
}
