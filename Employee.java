package InstanceVariable;
/*
 * Create an Employee class with instance variables (empId, name, age, address, email, mob_no, gender, Department and salary.) 
 * Assign values to two objects and print their details.
 */


public class Employee {
	     int empId;
	    String name;
	    int age;
	    String address;
	    String email;
	    String mob_no;
	    String gender;
	    String department;
	    double salary;

	    // Method to display employee details
	    public void displayDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Email: " + email);
	        System.out.println("Mobile Number: " + mob_no);
	        System.out.println("Gender: " + gender);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: $" + salary);
	        System.out.println("-----------------------------------");
	    }


}
