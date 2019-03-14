import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;

public class Player {
	private String playerName;
	private int playerScore;
	private Dice dice;
	
	public Player() {
		// Setting a default player name, player score, and dice object for default constructor.
		this.playerName = "Player";
		this.playerScore = 0;
		this.dice = new Dice();
	}
	
	public Player(String name) {
		// This constructor allows you to pass a player name (otherwise the same).
		this.playerName = name;
		this.playerScore = 0;
		this.dice = new Dice();
	}

	public void takeTurn() {
		// turnScore variable represents the temporary score that a player has during his/her turn (that can be lost when rolling a skunk).
		int turnScore = 0;
		// choice variable used to capture keyboard input for player choice of play or hold.
		String choice;
		// Scanner required to take user input.
		Scanner sc = new Scanner(System.in);
		// continueTurn variable used in loop to track whether player turn continues or is over.
		boolean continueTurn = true;
		
		do {
			StdOut.println(this.getPlayerName() + ", would you like (p)lay or (h)old?");
			choice = sc.next();
			
			if (choice.equals("p")) {
				this.dice.roll();
				if (this.dice.getDie1LastRoll() == 1 || this.dice.getDie2LastRoll() == 1) {
					StdOut.println("SKUNK :D");
					turnScore = 0;
					continueTurn = false;
				}
				else {
					turnScore += dice.getLastRoll();
					StdOut.println(this.getPlayerName() + " turn score is " + turnScore);
				}
			}
			else if (choice.equals("h")) {
				continueTurn = false;
			}
			// This else is included to cover if the user enters anything other than (p) or (h).  They will start the loop again.
			else {
				continue;
			}
		} while (continueTurn);
		
		// Increment player total score with the amount of points earned during the turn (turnScore).
		this.playerScore += turnScore;
		StdOut.println(this.getPlayerName() + "'s turn is over!!!");
	}
	
	public String getPlayerName() {
		return this.playerName;
	}
	
	public int getPlayerScore() {
		return this.playerScore;
	}
	
	public void setPlayerName(String name) {
		this.playerName=name; 
	}
	
	public void setPlayerScore(int playerScore) {
		this.playerScore=playerScore;
	}
	
	
}
