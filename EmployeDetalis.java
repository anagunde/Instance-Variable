package InstanceVariable;

public class EmployeDetalis {
	public static void main(String[] args) {
        
		
        Employee emp1 = new Employee();
        emp1.empId = 101;
        emp1.name = "Mayra";
        emp1.age = 2;
        emp1.address = "North Kasba , Solapur";
        emp1.email = "mayrakurulkar19@gmail.com";
        emp1.mob_no = "8619171418";
        emp1.gender = "Female";
        emp1.department = "Software Development";
        emp1.salary = 85000.00;
        
        emp1.displayDetails();
        
    }
}


