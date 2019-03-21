import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Turn {
	
	private int turnScore;
	private String choice;
	
	public Turn () {
		
	}
	
	public Turn(Player p, Dice d) {
		
		this.turnScore=0;
		
		do {
			StdOut.println(p.getPlayerName() + ", would you like (p)lay or (h)old?");
			// choice = sc.next();
			choice = StdIn.readString();
			
			if (choice.equals("p")) {
				d.roll();
				if (d.getDie1LastRoll()== 1 || d.getDie2LastRoll()== 1) {
					StdOut.println("SKUNK :D");
					this.turnScore=0;
					break;
				}
				else {
				this.turnScore+= d.getLastRoll();
				StdOut.println(p.getPlayerName() + " turn score is " + this.turnScore);
				}
			}
			else if (choice.equals("h")) {
				break;
			}
			else {
				continue;
			}
		} while (true);
		
		p.setPlayerScore(p.getPlayerScore() + this.turnScore);
		
		StdOut.println(p.getPlayerName() + "'s turn is over!!!");
	}
}
