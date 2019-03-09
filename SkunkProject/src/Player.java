import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;

public class Player {
	private String playerName;
	private int playerScore;
	private Dice dice;
	
	public Player() {
		this.playerName="Player";
		this.playerScore=0;
		this.dice= new Dice();
	}
	
	public Player(String name) {
		this.playerName=name;
		this.playerScore=0;
		this.dice= new Dice();
	}

	public void takeTurn() {
		int turnScore= 0;
		String choice;
		Scanner sc = new Scanner(System.in);
		
		do {
			StdOut.println(this.getPlayerName() + ", would you like (p)lay or (h)old?");
			choice = sc.next();
			
			if (choice.equals("p")) {
				this.dice.roll();
				if (this.dice.getDie1LastRoll()== 1 || this.dice.getDie2LastRoll()== 1) {
					StdOut.println("SKUNK :D");
					turnScore=0;
					break;
				}
				else {
				turnScore+= dice.getLastRoll();
				StdOut.println(this.getPlayerName() + " turn score is " + turnScore);
				}
			}
			else if (choice.equals("h")) {
				break;
			}
			else {
				continue;
			}
		} while (true);
		
		this.playerScore+= turnScore;
		
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
