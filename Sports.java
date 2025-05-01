package InstanceVariable;
/*
 * Create a Sports class with instance variables sportName, teamName, sportType, coachName, 
 * numPlayers, homeCity, and championshipsWon. 
 * Create at least two objects, assign values, and display their details.
 */

public class Sports  {
	String sportName;
    String teamName;
    String sportType;
    String coachName;
    int numPlayers;
    String homeCity;
    int championshipsWon;

    
    public void displayDetails() {
        System.out.println("Sport Name: " + sportName);
        System.out.println("Team Name: " + teamName);
        System.out.println("Sport Type: " + sportType);
        System.out.println("Coach Name: " + coachName);
        System.out.println("Number of Players: " + numPlayers);
        System.out.println("Home City: " + homeCity);
        System.out.println("Championships Won: " + championshipsWon);
        System.out.println("-----------------------------------");
    }
}
	


