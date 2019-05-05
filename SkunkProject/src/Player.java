import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;

public class Player {
	private String playerName;
	private int playerScore;
	private Dice dice;
	public int rollScore;
	public int turnScore;
	public int roundScore;
	public int gameScore; // for now, same as roundScore
	public int numberChips;

	public Player(int startingChipsPerPlayer)
	{
		this();
		this.numberChips = startingChipsPerPlayer;
	}
	public Player() {
		// Setting a default player name, player score, and dice object for default constructor.
		this.playerName = "Player";
		this.playerScore = 0;
		this.dice = new Dice();
		this.rollScore = 0;
		this.turnScore = 0;
		this.roundScore = 0;
		this.gameScore = 0;
		this.numberChips = 50; // for now
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
		
		do {
			StdOut.println(this.getPlayerName() + ", would you like (p)lay or (h)old?");
			// choice = sc.next();
			choice = StdIn.readString();
			
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
	public void addToRollScore(int lastTotal)
	{
		rollScore += lastTotal;
	}

	public void setRollScore(int newRollScore)
	{
		this.rollScore = newRollScore;
	}

	public int getRollScore()
	{
		return this.rollScore;
	}

	public int getNumberChips()
	{
		return this.numberChips;
	}

	public void setNumberChips(int newChips)
	{
		this.numberChips = newChips;
	}

	public void setTurnScore(int newScore)
	{
		this.turnScore = newScore;
	}

	public int getTurnScore()
	{
		return this.turnScore;
	}

	public String getName()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void setRoundScore(int i)
	{
		this.roundScore = i;
	}

	public int getRoundScore()
	{
		return this.roundScore;
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
