////SHA-1 comment as requested

import java.util.ArrayList;

import edu.princeton.cs.introcs.StdOut;

		
		public class TestSkunk {
		
			public static final int NUM_TO_PLAY = 1000000;

// SkunkGame represents a single game of skunk, which contains a single Dice
//object that is rolled when game.play() is called. This returns true if
//the game is a win, false otherwise.
			 
			private SkunkGame game;

			private int numWins;

//Field <code>numPlays</code> counts the total number of individual games
//to play.
			private int numPlays;

// int array field <code>winSteps</code> tracks number of wins w after
//exactly k rolls: <code>winsteps[k]==w </code>, out of
//<code>numPlays</code> total plays.

			private int[] winForNumberOfStepsOf = new int[100];
			private ArrayList<Integer> test;

// int array field <code>lossSteps</code> racks number of losses l after
//exactly k rolls: <code>lossSteps[k]==l</code>, out of
// <code>numPlays</code> total plays.
			 
			private int[] lossSteps = new int[100];

//Constructor TestSkunks() creates a new SkunkGame for subsequent play.

			public TestSkunk()
			{
				// game = new SkunkGame();

				game = new SkunkGame(); // two "fair" Die objects
				
				// we'll use the above to substitute Die subclass objects,
				// thus affecting the outcome
			
			}

	
			 //Instance method <code>public void play(int)</code> plays n games of
			 //skunk, tracking the results of each: number of total wins out of n, and
			 //for each win, how many games end in a win/loss after exactly k plays:
			 //winSteps[k], lossSteps[k]
     		 //@param n
			 // total number of games to play

			public void play(int n)
			{
				numPlays = n;
				numWins = 0;
				for (int i = 0; i < numPlays; i++)
				{
					if (game.playOneGame(winForNumberOfStepsOf, lossSteps))
					{
						numWins++;
					}
				}
			}

// Instance method <code>public void reportStats</code> prints out final
//value of number of how many games end in a win/loss after exactly k
//plays: winSteps[k], lossSteps[k]total wins out of n, and
//It then prints out the winning percentage for all games played.

			public void reportStats()
			{
				StdOut.println("\nNumber of (wins,losses) for games of given length follow:\n");
				for (int numSteps = 1; numSteps < winForNumberOfStepsOf.length; numSteps++)
				{
					StdOut.println("(wins,losses) ending at " + numSteps + " roll" + ((numSteps > 1) ? "s" : "") + ": (" + winForNumberOfStepsOf[numSteps] + ","
							+ lossSteps[numSteps] + ")");
				}
				
				StdOut.println("\nPlayed " + numPlays + " games total.");
				
				StdOut.println("Won " + numWins + "/" + numPlays + "==" + 100.0 * (0.0 + numWins) / numPlays + "%");

			}



			public static void main(String[] args)
			{
				TestSkunk test = new TestSkunk();

				StdOut.println("Starting simulation of " + NUM_TO_PLAY + " games...");

				SkunkGame.showOutput = false; // turn off output to speed up

				test.play(NUM_TO_PLAY); 
				StdOut.println("Done.");

				test.reportStats(); // output

			}
	}


