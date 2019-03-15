import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoadedDie1Test {
	private LoadedDie1 die = new LoadedDie1();
	private int dieResult;
	
	@Before
	public void setUp() throws Exception {
		this.dieResult = this.die.getLastRoll();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_LoadedDie1_constructor_functionality() {
		assertEquals("The dieResult is NOT 3.", 3, this.dieResult);
	}

}
