
public class LoadedDie1 extends Die{
	
	public LoadedDie1()
	{
		// super();  // We don't need to call the super constructor.
		this.setLastRoll(3);
	}

	public String toString() // this OVERRIDES Die's toString()
	{
		return "A LoadedDie always rolling 3, and... " + super.toString();
	}
}
