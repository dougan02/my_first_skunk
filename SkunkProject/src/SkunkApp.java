import edu.princeton.cs.introcs.StdOut;

public class SkunkApp 
	{
		public SkunkUI skunkUI;
		public SkunkDomain skunkDomain;
		public int numberOfPlayers;
		public String[] playerNames;

		public SkunkApp()
		{
			skunkUI = new SkunkUI();
			skunkDomain = new SkunkDomain(skunkUI);
			skunkUI.setDomain(skunkDomain);
			this.numberOfPlayers = 0;
			this.playerNames = new String[20];

		}

		/**
		 * Runs the app within an event loop
		 * 
		 * @return
		 */
		public boolean run()
		{
			return skunkDomain.run();
		}

		public static void main(String[] args)
		{
			new SkunkApp().run();
		
		
		//Returns fun for the players.
		// The mechanics of the game are all encapsulated in the SkunkGame class, so the main method only requires invocation of that method.
		SkunkGame g = new SkunkGame();
		
		StdOut.println("Program is complete.");
		
		

	}

}