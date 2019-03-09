
public class LoadedDie3 extends Die {
	public void roll() 
	{
		// call the inherited method to get lastRoll from parent Die parts

		int testRoll = getLastRoll();
		if (testRoll == 6)
			this.setLastRoll(1);
		else if (testRoll > 5)
			this.setLastRoll(testRoll % 6);
		else
			this.setLastRoll(testRoll + 1);
	}

}
