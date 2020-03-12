package ie.itcarlow.lab6;

public class Teacher extends Person{
	//variables
	private int numCourses = 0;
	private String[] courses = new String[15];
	
	
	//constructor
	public Teacher(String name, String address) {
		super(name, address);
	}
	
	
	//misc methods
	
	public boolean addCourse(String newCourse) {
		++numCourses;
		try {
			for(int i = 0; i < numCourses; i++) 
				courses[i] = newCourse;
			
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	//removes blank space from the array so it is left justified
	public void leftJustifyCoursesArray(int i) {
		for(int j = i; j < numCourses; j++)
			courses[j] = courses[j + 1];
	}
	
	//remove course from the courses array
	public boolean removeCourse(String oldCourse) {
		try {
			for(int i = 0; i < numCourses; i++)
				if(courses[i].equalsIgnoreCase(oldCourse)) {
					courses[i] = null;
					leftJustifyCoursesArray(i);
					--numCourses;
				}
			
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public void printCourses() {
		for(String s : courses)
			System.out.println(s);
	}
	
	//toString
	public String toString() {
		return "Teacher: " + super.toString();
	}
}
