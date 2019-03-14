import static org.junit.Assert.*;

import org.junit.Test;

public class playerTest {

	@Test
	public void test() {
		Player player = new Player();
		assertEquals(player.getPlayerName(), "Player");
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		Player player2 = new Player("Eric");
		assertEquals(player2.getPlayerName(), "Eric");
		//fail("Not yet implemented");
	}

}
