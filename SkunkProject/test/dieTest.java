import static org.junit.Assert.*;

import org.junit.Test;

public class dieTest {
	@Test
	public void test() {
		Die die = new Die();
		int dieResult = die.getLastRoll();
		assertTrue((0 < dieResult) && (dieResult < 7));
		//fail("Not yet implemented");
	}

}
