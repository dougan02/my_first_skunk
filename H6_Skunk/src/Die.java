public class Die
{
	private int lastRoll;
	private boolean predictable = false;
	private int[] rolls;
	private int index_of_next_roll;

	public Die()
	{
		this.roll();
	}

	public Die(int[] predictable_rolls)
	{
		if (predictable_rolls == null)
		{
			throw new RuntimeException("null initializing int[] array");
		}

		this.predictable = true;
		this.rolls = predictable_rolls;
		this.index_of_next_roll = 0;

	}

	int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	void roll() // note how this changes Die's state, but doesn't return
						// anything
	{
		if (!predictable)
			this.lastRoll = (int) (Math.random() * 6 + 1);
		else
		{
			this.lastRoll = this.rolls[index_of_next_roll];
			index_of_next_roll++;
			if (index_of_next_roll >= this.rolls.length)
			{
				index_of_next_roll = 0; // back to start
			}
		}
	}

	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}

}