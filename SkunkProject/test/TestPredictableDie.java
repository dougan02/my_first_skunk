
//Updated TestPredictableDie_SHA-1
import static org.junit.Assert.*;

import org.junit.Test;

public class TestPredictableDie {

	@Test
	public void test_predictable_die_one_value() 
	{
        int[] initializer = {1};
        PredictableDie pd = new PredictableDie(new int[] {1});
        pd.roll();
        assertEquals(1, pd.getLastRoll());
	}

}
