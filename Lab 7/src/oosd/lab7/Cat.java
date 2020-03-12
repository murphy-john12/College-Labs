package oosd.lab7;

public class Cat extends Animal{

	public Cat(int age, char gender) {
		super("Cat", age, gender);
	}
	
	@Override
	public void eat() {
		System.out.println("The cat is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("The cat is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}

	@Override
	public String toString() {
		return "Cat [" + "age: " + super.getAge() + ", gender: " + super.getGender() + " ]";
	}
}
