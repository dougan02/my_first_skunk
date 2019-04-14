//updated PredictablDie_SHA-1 

public class PredictableDie  extends Die{

	private int[] throwSequence = {};
	private int nextInSeq = 0;
	
	public PredictableDie(int[] seq)
	{
	super();	
      this.throwSequence = seq;
	}
	public void roll() 
	{
		lastRoll = throwSequence[nextInSeq];
	}
	
	
	public static void main(String[]  args)
	{
		
	}

}
