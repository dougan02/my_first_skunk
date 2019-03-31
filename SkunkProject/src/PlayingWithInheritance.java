//SHA-1 comment as requested
import edu.princeton.cs.introcs.StdOut;

public class PlayingWithInheritance
{
	public static int RUN_EXAMPLE = 1; 
										
	public static void main(String[] args)
	{
		StdOut.println();

		Die aSingleDie = new Die();
		LoadedDie1 Loaded1 = new LoadedDie1();
		LoadedDie2 Loaded2 = new LoadedDie2();
		LoadedDie3 Loaded3 = new LoadedDie3();

		StdOut.println();

		// change RUN_EXAMPLE above to run any one of the following 6 examples

		if (RUN_EXAMPLE == 1)
		{
			StdOut.println("Note the output: constructor chaining.");
		}
		else if (RUN_EXAMPLE == 2)
		{
			// When a reference is treated like a String
			// => toString() is automatically invoked, and its returned value
			// used instead!

			StdOut.println(aSingleDie.toString());

			StdOut.print("toString() automatically called when reference treated as String: ");
			StdOut.println(aSingleDie.toString());
			StdOut.println("Concatenating a string to a reference: " + aSingleDie.toString());
		}
		else if (RUN_EXAMPLE == 3)
		{
			// concatenate " " + super.toString() to end of toString() code
			// inside each of 3 classes, then watch the result when run again.

			StdOut.println("die1's toString(): '" + aSingleDie + "'");
			StdOut.println("loaded1's toString(): '" + Loaded1 + "'");
			StdOut.println("loaded2's toString(): '" + Loaded2 + "'");
			StdOut.println("loaded3's toString(): '" + Loaded3 + "'");

		}
		else if (RUN_EXAMPLE == 4)
		{
			// Die alias = die1; // try replacing this line with either below
			Die alias = Loaded1; // upcasting!
			// Die alias = crooked2; // ditto

			StdOut.println("alias's toString(): '" + alias.toString() + "'");
			StdOut.println();
		}
		else if (RUN_EXAMPLE == 5)
		{
			Die alias;

			double toss = Math.random(); // [0.0..1.0)

			if (toss < 0.333)
				alias = aSingleDie;
			else if (toss < 0.666)
				alias = Loaded1;
			else if (toss < 0.999);
				alias = Loaded2;
				  
					alias =Loaded3;

			// Can the compiler figure out the actual type
			// of alias in the following call?
			// No => dynamic runtime lookup happens

			describe("Which toString() is called? Answer is: ", alias);
		}
		else if (RUN_EXAMPLE == 6)
		{
			Dice dice = new Dice(); // we'll try substituting here

			dice.roll();

			int result = dice.getLastRoll();

			StdOut.printf("Roll of '%s' and '%s' is: %d.\n", aSingleDie, Loaded1, Loaded2, Loaded3, result);
		}

		StdOut.println();
	}

//Shows polymorphism via passing either Die ref as toDescribe, or
//LoadedDie1 or LoadedDie2 ref instead
//@param msg
//@param toDescribe

	public static void describe(String msg, Die toDescribe)
	{
		StdOut.printf("%s '%s' \n", msg, toDescribe.toString());
	}

}
