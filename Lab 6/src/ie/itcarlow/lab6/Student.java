package ie.itcarlow.lab6;

import java.util.Arrays;

public class Student extends Person{
	//variables
	private int numCourses = 0;
	private String[] courses = new String[15];
	private int[] grades = new int[15];
	
	
	//constructors	
	public Student(String name, String address) {
		super(name, address);
	}


	//misc methods
	
	//add course and grade to corrosponding index of array
	public void addCourseGrade(String newCourse, int newGrade) {
		++numCourses;
		
		for(int i = 0; i < numCourses; i++)
			courses[i] = newCourse;
		
		for(int i = 0; i < numCourses; i++)
			grades[i] = newGrade;

	}
	
	//return average grade as a double
	public double getAverageGrade() {
		double total = 0;
		int divBy = 0;
		for(int i : grades)
			if(i != 0) {
				total += i;
				++divBy;
			}
		
		return total / divBy;
	}
	
	//print all grades 
	public void printGrades() {
		System.out.print(super.toString());
		for(int i = 0; i < numCourses; i ++)
				System.out.print(" " + courses[i] + ":" + grades[i]);
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [courses=" + Arrays.toString(courses) + ", grades=" + Arrays.toString(grades) + "]";
	}
}
