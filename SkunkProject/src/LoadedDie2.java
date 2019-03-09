
public class LoadedDie2 extends Die {
	public void roll() // can you see what this computes?
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
		return "A LoadedDie2 rolling 1,2,3,4,5,6 in sequence, and... " + super.toString();
	}
}
