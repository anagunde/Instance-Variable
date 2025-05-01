package InstanceVariable;
/*
 * Create a Flight class with instance variables flightNumber, airline, departureCity, destinationCity, departureTime, and ticketPrice.
 *  Create at least two objects, assign values, and display their details.
 */

public class Flight {
	 String flightNumber;
	    String airline;
	    String departureCity;
	    String destinationCity;
	    String departureTime;
	    double ticketPrice;

	    public void displayDetails() {
	        System.out.println("Flight Number: " + flightNumber);
	        System.out.println("Airline: " + airline);
	        System.out.println("Departure City: " + departureCity);
	        System.out.println("Destination City: " + destinationCity);
	        System.out.println("Departure Time: " + departureTime);
	        System.out.println("Ticket Price: $" + ticketPrice);
	        System.out.println("-----------------------------------");
	    }
}
	
	
	


