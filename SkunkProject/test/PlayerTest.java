import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	private Player player1;
	private Player player2;
	
	@Before
	public void setUp() throws Exception {
		this.player1 = new Player();
		this.player2 = new Player("New Player");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_getPlayerName_for_default_constructor() {		
		assertEquals(this.player1.getPlayerName(), "Player");
	}
	
	@Test
	public void test_getPlayerName_for_parameterized_constructor() {
		
		assertEquals(this.player2.getPlayerName(), "New Player");
	}
	
	@Test
	public void test_setPlayerName() {
		this.player1.setPlayerName("A New Player Name");
		assertEquals(this.player1.getPlayerName(), "A New Player Name");
	}
	
	@Test
	public void test_setPlayerScore() {
		this.player1.setPlayerScore(99);
		assertEquals(this.player1.getPlayerScore(), 99);
	}
	
	
	//TODO:
	@Test
	public void test_takeTurn() {
		assertTrue(true);
	}

}
