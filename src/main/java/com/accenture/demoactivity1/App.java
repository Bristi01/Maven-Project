package com.accenture.demoactivity1;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	    	SportsTeamManager teamManager = new SportsTeamManager();
    	        Scanner scanner = new Scanner(System.in);
    	 
    	        // Prompt the user to add players
    	        System.out.println("Enter player names (type 'done' to finish):");
    	        String playerName;
    	        while (true) {
    	            System.out.print("Player name: ");
    	            playerName = scanner.nextLine();
    	            if (playerName.equalsIgnoreCase("done")) {
    	                break;
    	            }
    	            teamManager.addPlayer(playerName);
    	        }
    	 
    	        // Displaying players
    	        System.out.println("\nPlayers in the team:");
    	        teamManager.displayPlayers();
    	 
    	        // Checking if a player is in the team
    	        System.out.print("\nEnter a player name to check if they are in the team: ");
    	        String playerNameToCheck = scanner.nextLine();
    	        System.out.println("Is " + playerNameToCheck + " in the team? " + teamManager.isPlayerInTeam(playerNameToCheck));
    	 
    	        // Closing the scanner
    	        scanner.close();
    	    }
    	}
    	 
    	class SportsTeamManager {
    	    private Set<String> players;
    	 
    	    public SportsTeamManager() {
    	        this.players = new HashSet<>();
    	    }
    	 
    	    public void addPlayer(String playerName) {
    	        players.add(playerName);
    	    }
    	 
    	    public void removePlayer(String playerName) {
    	        players.remove(playerName);
    	    }
    	 
    	    public boolean isPlayerInTeam(String playerName) {
    	        return players.containshaskjnkj(playerName);
    	    }
    	 
    	    public void displayPlayers() {
    	        System.out.println("Players in the team:");
    	        for (String player : players) {
    	            System.out.println(player);
    	        }
    	    }
    	


    }

