import java.util.*;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import edu.princeton.cs.introcs.StdOut;
public class SkunkGame {
	// Array list created to hold player objects.
	private ArrayList<Player> players;
	// scoreLimit variable sets the score required to end the game.
	private int scoreLimit;
	// isPlayerOverScoreLimit variable is used to control the loop that ends when a player is over the score limit.
	boolean isPlayerOverScoreLimit;
	
	public SkunkGame() {
		// Creates array to hold players, sets scoreLimit, sets isPlayerOverScoreLimit, and invokes request players method and the play game method.
		this.players = new ArrayList<Player>();
		this.isPlayerOverScoreLimit = false;
		this.scoreLimit = 15;
		this.requestPlayers();
		this.playGame();
	}
	
	public void addPlayer(String name) {
		// Adds a player to the player list (used in requestPlayers method).
		this.players.add(new Player(name));
	}
	
	public void requestPlayers() {
		// numberOfPlayers variable used to set total players requested and created.
		int numberOfPlayers;		
		
		StdOut.println("How many players would you like to add to the game?");
		numberOfPlayers = StdIn.readInt();
		
		//loop based on number of players that requests a player name and adds that player to the player list array.
		for (int i = 0; i < numberOfPlayers; i++) {
			StdOut.println("Please enter the player name.");
			this.players.add(new Player( StdIn.readString()  ));;
			StdOut.println("Player " + this.players.get(i).getPlayerName() + " added.");
			// Alternative implementation code for previous line: players.get(players.size() - 1).getPlayerName();
		}
		
		StdOut.println("Players added successfully. Have fun.");
		
	}
	
	public void playGame() {
		// This method was set up so each player takes the same number of turns.
		// Uses two loops - one that iterates over array of players taking turns and one that starts the iteration loop again based isPlayerOverScoreLimit variable.
		// Finishes with a final loop used to calculate winner and final score.
		StdOut.println("Game Starting");
		
		while(!isPlayerOverScoreLimit) {
			// Iterating over each player taking a turn.
			for (int i = 0; i < this.players.size(); i++) {
				// takeTurn method is invoked for each player.
				this.players.get(i).takeTurn();
				// Check if current player is over the scoreLimit.  If yes, then remaining players take turns and loop ends (all players take same number of turns).
				if (this.players.get(i).getPlayerScore() >= scoreLimit) {
					isPlayerOverScoreLimit = true;
				}
			}
			// Prints player score at the end of his/her turn.
			this.printPlayersScores();
		}
		// winnerIndex variable contains the position of winning player in the players array list.
		int winnerIndex = 0;
		for (int i = 0; i < this.players.size(); i++) {
			// Loop compares all player scores against each other and finds the player with the highest score.
			int currentPlayerScore = this.players.get(i).getPlayerScore();
			int currentWinningPlayerScore = this.players.get(winnerIndex).getPlayerScore();
			if (currentPlayerScore > currentWinningPlayerScore) {
				winnerIndex = i;
			}
		}
		
		StdOut.println("And the winner is " + this.players.get(winnerIndex).getPlayerName() + " with a score of " + this.players.get(winnerIndex).getPlayerScore() + " points!");
		
	}
	
	public void printPlayersScores() {
		// Loop through players and prints their scores.
		for (int i = 0; i < this.players.size(); i++) {
			StdOut.println(this.players.get(i).getPlayerName() + "'s score is " + this.players.get(i).getPlayerScore());
		}
	}
}
