package org.howard.edu.lsp.assignment6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * * {@summary to implement Junit test cases for AverageStrategyContext}
 * @author Sanjaya Subedi
 
 *
 */

class AverageStrategyContextTest {
	@Test
	@DisplayName("Test cases for type of strategy implemented")
	public void testSetAverageStrategy() {
		
		AverageStrategyContext undroppedAverage = new AverageStrategyContext();
		AverageStrategyContext droppedAverage = new AverageStrategyContext();
		
		
		undroppedAverage.setAverageStrategy(new UnDroppedAverageStrategy());
		
		droppedAverage.setAverageStrategy(new TwoLowestDroppedAverageStrategy());
		
		
		
		assertEquals("Undropped strategy error()", undroppedAverage.getStrategyType(), UnDroppedAverageStrategy.class);
		

		assertEquals("Two Lowest Dropped strategy error()", droppedAverage.getStrategyType(), TwoLowestDroppedAverageStrategy.class);
		

	}
	
	/**
	 * {@summary to check getAverage method}
	 * @throws EmptyListException 
	 */
	@Test
	@DisplayName("Test cases for getAverage method of the given strategies")
	public void testGetAverage() throws EmptyListException {
		
		
		AverageStrategyContext undroppedAverage = new AverageStrategyContext();
		AverageStrategyContext droppedAverage = new AverageStrategyContext();
		List<Integer> gradesI;
		List<Integer> gradesII;
		
		undroppedAverage.setAverageStrategy(new UnDroppedAverageStrategy());
		droppedAverage.setAverageStrategy(new TwoLowestDroppedAverageStrategy());
		
		//gradesI will have values
		gradesI = new ArrayList<Integer>();

		//gradesII will be empty
		gradesII = new ArrayList<Integer>();
		
		//gradesI to have added grades
		gradesI.add(90);
		gradesI.add(84);
		gradesI.add(71);
		gradesI.add(92);
		gradesI.add(93);
		gradesI.add(98);
		
		//undropped average
		assertEquals("The average value of [90, 84, 71, 92, 93, 98] is 88", 88, undroppedAverage.getAverage(gradesI));
		
	
		
		//dropped average
		assertEquals("The average value of [90, 84, 71, 92, 93, 98] when dropping the lowest two grades is 93", 93, droppedAverage.getAverage(gradesI));
		
		
		
		//empty list after dropping two lowest grades
		gradesII.add(93);
		gradesII.add(98);
		
		assertThrows(" EmptyListException ", EmptyListException.class ,
				() -> {
					
					droppedAverage.getAverage(gradesII);
				}
				);
	}
	
	
	
	@Test
	@DisplayName("testUndropped throws exception")
	public void testUndropped_THROWS_EXCEPTION() {
		
		AverageStrategyContext undroppedAverage = new AverageStrategyContext();
		List<Integer> gradesII;
		
		undroppedAverage.setAverageStrategy(new UnDroppedAverageStrategy());
		//gradesII will be empty
		gradesII = new ArrayList<Integer>();
		
		Exception exception = assertThrows(EmptyListException.class, ()->{
			undroppedAverage.getAverage(gradesII);
		});
		String expectedMessage = "Empty list cannot have values to calculate averages";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	
	@Test
	@DisplayName("testTwoLowestDropped throws exception")
	public void testTwoLowestDropped_THROWS_EXCEPTION() {
		
		AverageStrategyContext droppedAverage = new AverageStrategyContext();
		List<Integer> gradesII;
		
		droppedAverage.setAverageStrategy(new TwoLowestDroppedAverageStrategy());
		
		//gradesII will have two values
		gradesII = new ArrayList<Integer>();
		

		gradesII.add(93);
		gradesII.add(98);
		
		Exception exception = assertThrows(EmptyListException.class, ()->{
			droppedAverage.getAverage(gradesII);
		});
		String expectedMessage = "Empty list cannot have values to calculate averages";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	

}


