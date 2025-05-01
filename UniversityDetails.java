package InstanceVariable;

public class UniversityDetails {
	public static void main(String[] args)
	{
        // First university object
        University uni1 = new University();
        uni1.universityName = "DABTU University";
        uni1.location = "Lonere, Mahrashrta, India";
        uni1.numStudents = 17140;
        uni1.numProfessors = 1400;
        uni1.ranking = 1;
        uni1.foundingYear = 1997;
        uni1.department = "Computer Science";
        uni1.graduationLevel = "Undergraduate";

        // Second university object
        University uni2 = new University();
        uni2.universityName = "Solapur University";
        uni2.location = " Solapur, Mahrashrta, India";
        uni2.numStudents = 18210;
        uni2.numProfessors = 1900;
        uni2.ranking = 2;
        uni2.foundingYear = 1990;
        uni2.department = " Civil Engineering";
        uni2.graduationLevel = "Postgraduate";

        // Displaying details
        uni1.displayDetails();
        uni2.displayDetails();
    }
}


