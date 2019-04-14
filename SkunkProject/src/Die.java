//update: changed 'private lastroll to protected'
import edu.princeton.cs.introcs.StdOut;

public class Die
{
	protected int lastRoll;

	public Die()
	{
		//this.roll();
		lastRoll = (int) (Math.random() * 6 + 1); 
	}

	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		this.lastRoll = (int) (Math.random() * 6 + 1);
	}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}
	
	protected void setLastRoll(int lastRoll) // setter or mutator method
	{
		this.lastRoll = lastRoll;
	}
}
