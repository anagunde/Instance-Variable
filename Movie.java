package InstanceVariable;
/*
 *  Create a Movie class with instance variables title, director, releaseYear, lead actor, lead actress, duration, genre, and rating. 
 *  Create at least two objects, assign values, and print their details.
 */


public class Movie {
	 String title;
	    String director;
	    int releaseYear;
	    String leadActor;
	    String leadActress;
	    int duration; // in minutes
	    String genre;
	    double rating; // out of 10

	    // Method to display movie details
	    public void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Director: " + director);
	        System.out.println("Release Year: " + releaseYear);
	        System.out.println("Lead Actor: " + leadActor);
	        System.out.println("Lead Actress: " + leadActress);
	        System.out.println("Duration: " + duration + " minutes");
	        System.out.println("Genre: " + genre);
	        System.out.println("Rating: " + rating + "/10");
	        System.out.println("-----------------------------------");
	    }

}
