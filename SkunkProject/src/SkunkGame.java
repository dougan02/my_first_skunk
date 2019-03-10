import java.util.*;

import edu.princeton.cs.introcs.StdOut;
public class SkunkGame {

	private ArrayList<Player> players;
	boolean isPlayerOver100;
	
	public SkunkGame() {
		this.players= new ArrayList<Player>();
		this.isPlayerOver100=false;
		this.requestPlayers();
		this.playGame();
	}
	
	public void addPlayer(String name) {
		this.players.add(new Player(name));
	}
	
	public void requestPlayers() {
		
		int numberOfPlayers;
		Scanner sc = new Scanner(System.in);
		
		StdOut.println("How many players are wasting their time with this? >:)");
		numberOfPlayers = sc.nextInt();
		
		//loop based on number of players
		for (int i = 0; i < numberOfPlayers; i++) {
			StdOut.println("Give me the player name...");
			this.players.add(new Player(sc.next()));
			StdOut.println("Player " + this.players.get(i).getPlayerName() + " added");
			// players.get(players.size() - 1).getPlayerName();
			
		}
		
		StdOut.println("You added the players and the loop is over.");
		
	}
	
	public void playGame() {
		int scoreLimit = 20;
		StdOut.println("Game Starting");
		// This method was set up so each player takes the same number of turns.
		//Use two loops - one that iterates over array of players taking turns and one that starts the iteration loop again.
		
		while(!isPlayerOver100) {
			for (int i = 0; i < this.players.size(); i++) {
				this.players.get(i).takeTurn();
				if (this.players.get(i).getPlayerScore() >= scoreLimit) {
					isPlayerOver100 = true;
				}
			}
			this.printPlayerScores();
		}
		
		int winnerIndex = 0;
		for (int i = 0; i < this.players.size(); i++) {
			int currentPlayerScore=this.players.get(i).getPlayerScore();
			int currentWinningPlayerScore=this.players.get(winnerIndex).getPlayerScore();
			if (currentPlayerScore > currentWinningPlayerScore) {
				winnerIndex = i;
			}
		}
		
		StdOut.println("And the winner is " + this.players.get(winnerIndex).getPlayerName() + " with a score of " + this.players.get(winnerIndex).getPlayerScore() + " points!");
		
	}
	
	public void printPlayerScores() {
		for (int i = 0; i < this.players.size(); i++) {
			StdOut.println(this.players.get(i).getPlayerName() + "'s score is " + this.players.get(i).getPlayerScore());
			//String s = “”
			//s = s + player.name + “: “ + player.score
		}
	}
}
