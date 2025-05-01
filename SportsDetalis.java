package InstanceVariable;
/*  Create a Sports class with instance variables sportName, teamName, sportType, coachName, numPlayers, homeCity, and
 *  championshipsWon. Create at least two objects, assign values, and display their details. 
 */


public class SportsDetalis {
	 public static void main(String[] args) {
	        
	        Sports sport1 = new Sports();
	        sport1.sportName = "Basketball";
	        sport1.teamName = "Los Angeles Lakers";
	        sport1.sportType = "Indoor";
	        sport1.coachName = "Darvin Ham";
	        sport1.numPlayers = 15;
	        sport1.homeCity = "Los Angeles";
	        sport1.championshipsWon = 17;

	        
	        Sports sport2 = new Sports();
	        sport2.sportName = "Football";
	        sport2.teamName = "Manchester United";
	        sport2.sportType = "Outdoor";
	        sport2.coachName = "Erik ten Hag";
	        sport2.numPlayers = 25;
	        sport2.homeCity = "Manchester";
	        sport2.championshipsWon = 20;

	        
	        sport1.displayDetails();
	        sport2.displayDetails();
	    }
	}


