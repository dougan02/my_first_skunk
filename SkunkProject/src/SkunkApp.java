import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdOut.println("Welcome to this really cool app!!!");
		Die testDie = new Die();
		LoadedDie1 testLoadedDie1 = new LoadedDie1();
		LoadedDie2 testLoadedDie2 = new LoadedDie2();
		
		testDie.roll();
		StdOut.println(testDie.toString());
		
		testLoadedDie1.roll();
		StdOut.println(testLoadedDie1.toString());
		
		testLoadedDie2.roll();
		StdOut.println(testLoadedDie2.toString());
		testLoadedDie2.roll();
		StdOut.println(testLoadedDie2.toString());
		testLoadedDie2.roll();
		StdOut.println(testLoadedDie2.toString());
		testLoadedDie2.roll();
		StdOut.println(testLoadedDie2.toString());
		testLoadedDie2.roll();
		StdOut.println(testLoadedDie2.toString());
		testLoadedDie2.roll();
		StdOut.println(testLoadedDie2.toString());
	}

}