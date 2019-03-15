import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class DiceTest {
	
	private Dice dice1;	
	private Dice dice2;
	
	private Die die1;
	private Die die2;
	
	
	@Before
	public void setUp() throws Exception {
		this.dice1 = new Dice();		
		
		this.die1 = new Die();
		this.die2 = new Die();
		
		this.dice2 = new Dice(die1, die2);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test_getLastRoll_for_default_constructor() {
		assertEquals("Default Constructor functionality failed.", 
				(this.dice1.getDie1LastRoll() + this.dice1.getDie2LastRoll()), 
				this.dice1.getLastRoll());
	}

	
	@Test
	public void test_getLastRoll_for_parameterized_constructor() {
		assertEquals("Parameterized Constructor functionality failed.", 
				(this.die1.getLastRoll() + this.die2.getLastRoll()),
				this.dice2.getLastRoll());
	}

}
