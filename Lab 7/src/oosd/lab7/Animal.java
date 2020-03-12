package oosd.lab7;

abstract class Animal {
	private String type;
	private int age;
	private char gender;
	
	//constructr
	public Animal() {this("", 0, ' ');}
	
	public Animal(String type, int age, char gender) {
		this.type = type;
		this.age = age;
		this.gender = gender;
	}
	
	public String getType() {
		return type;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void eat() {
		System.out.println("The animal is eating");
	}
	
	public void sleep() {
		System.out.println("The animal is sleeping");
	}
	
	public void makeSound() {
		System.out.println("generic animal sound");
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", gender=" + gender + "]";
	}
}
