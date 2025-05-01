package InstanceVariable;

public class FlightDetalis {
	 public static void main(String[] args) {
	        
	        Flight flight1 = new Flight();
	        flight1.flightNumber = "AA101";
	        flight1.airline = "American Airlines";
	        flight1.departureCity = "New York";
	        flight1.destinationCity = "Los Angeles";
	        flight1.departureTime = "08:00 AM";
	        flight1.ticketPrice = 399.99;

	       
	        Flight flight2 = new Flight();
	        flight2.flightNumber = "BA204";
	        flight2.airline = "British Airways";
	        flight2.departureCity = "London";
	        flight2.destinationCity = "New York";
	        flight2.departureTime = "06:30 PM";
	        flight2.ticketPrice = 650.50;

	      
	        flight1.displayDetails();
	        flight2.displayDetails();
	    }
	}



