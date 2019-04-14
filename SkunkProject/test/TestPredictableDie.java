//Updated TestPredictableDie_SHA-1
//Updated by trying with 2 Dies

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPredictableDie {

	@Test
	public void test_predictable_die_one_value() 
	{
        PredictableDie pd = new PredictableDie(new int[] {1});
        pd.roll();
        assertEquals(1, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_two_value() 
	{
        PredictableDie pd = new PredictableDie(new int[] {1,2});
        pd.roll();
        assertEquals(1, pd.getLastRoll());
        
        pd.roll();
        assertEquals(2, pd.getLastRoll());
	}
	
	@Test
	public void test_predictable_die_two_value_wraparound() 
	{
       PredictableDie pd = new PredictableDie(new int[] {1,2});
        pd.roll();
        assertEquals(1, pd.getLastRoll());
        
        pd.roll();
        assertEquals(2, pd.getLastRoll());
        
        pd.roll();
        assertEquals(1, pd.getLastRoll());
	}
	
	@Test (expected= ArrayIndexOutOfBoundsException.class)
	public void test_predictable_die_empty_initializer() 
	{
        PredictableDie pd = new PredictableDie(new int[] {});
        pd.roll();
        assertEquals(1, pd.getLastRoll());
        
	}
}
