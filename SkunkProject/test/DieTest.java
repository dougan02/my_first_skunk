import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {
	private Die die = new Die();
	private ClassForTestingProtectedMethod die2 = new ClassForTestingProtectedMethod();
	private int dieResult;
	private int dieResultFromProtectedMethodTester;
	
	@Before
	public void setUp() throws Exception {
		this.dieResult = this.die.getLastRoll();
		this.dieResultFromProtectedMethodTester = this.die2.getLastRoll();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_getLastRoll_functionality() {
		assertTrue("The dieResult is out of range.", ((1 <= this.dieResult) && (this.dieResult <=6)));

	}
	

	@Test
	public void test_setLastRoll_functionality() {
		assertEquals("The Protected Method failed to set values.", 5, dieResultFromProtectedMethodTester);
	}

	
	public class ClassForTestingProtectedMethod extends Die{
		
		public ClassForTestingProtectedMethod()
		{
			this.setLastRoll(5);
		}
	}
}