import edu.princeton.cs.introcs.StdOut;

public class LoadedDie2 extends Die {
	public void roll() 
	{
		// call the inherited method to get lastRoll from parent Die parts

		int testRoll = getLastRoll();
		if (testRoll == 6)
			this.setLastRoll(1);
		else
			this.setLastRoll(testRoll + 1);
	}

	public String toString()
	{
		return "Loaded " + super.toString();
	}
}
