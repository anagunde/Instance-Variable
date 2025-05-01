package InstanceVariable;
/*
 * Create a University class with instance variables universityName, location, numStudents, 
 * numProfessors, ranking , foundingYear, department and graduationLevel . 
 * Create at least two objects, assign values, and display their details.
 */

public class University {
	 String universityName;
	    String location;
	    int numStudents;
	    int numProfessors;
	    int ranking;
	    int foundingYear;
	    String department;
	    String graduationLevel;

	    // Method to display university details
	    public void displayDetails() {
	        System.out.println("University Name: " + universityName);
	        System.out.println("Location: " + location);
	        System.out.println("Number of Students: " + numStudents);
	        System.out.println("Number of Professors: " + numProfessors);
	        System.out.println("Ranking: " + ranking);
	        System.out.println("Founding Year: " + foundingYear);
	        System.out.println("Department: " + department);
	        System.out.println("Graduation Level: " + graduationLevel);
	        System.out.println("-----------------------------------");
	    }

	

}
