import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println("Welcome to this really cool app!!!");
//		Die testDie = new Die();
		Player testPlayer = new Player("Dietz");
		
		testPlayer.takeTurn();
		StdOut.println("final player score is: " + testPlayer.getPlayerScore());
		
		testPlayer.takeTurn();
		StdOut.println("final player score is: " + testPlayer.getPlayerScore());
		
		StdOut.println("Welcome to this really cool app!!!");

	}

}