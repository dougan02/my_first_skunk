
public class LoadedDie1 extends Die{
	
	public int getLastRoll() // this OVERRIDES Die's getLastRoll(), replacing
								// it!
	{
		return 3;
	}

	public String toString() // this OVERRIDES Die's toString()
	{
		return "A LoadedDie always rolling 3, and... " + super.toString();
	}
}
