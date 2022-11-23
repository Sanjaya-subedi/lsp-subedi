package org.howard.edu.lsp.assignment6;

import java.util.List;
/**
 * {@summary to implement Average Strategy Context}
 * @author Sanjaya Subedi
 *
 */
public class AverageStrategyContext {
	private AverageStrategy strategy;
	
	/**
	 * {@summary to set what sort of strategy is to be implemented}
	 * @param strategy it takes one of the strategy i.e. TwoLowestDropped or UnDropped.
	 * @return void
	 */
	
	//this can be set at runtime by the application preferences
	public void setAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * {@summary to calculate the average based on the selected strategy}
	 * @param grades list of grade inputted.
	 * @return integer average calculated of inputted grades.
	 * @throws EmptyListException
	 */
	
	
	//using the strategy
	int getAverage(List<Integer> grades) throws EmptyListException {
		try {
			int averageSum = strategy.compute(grades);
			return averageSum;
		}
		catch(EmptyListException e) {
			throw new EmptyListException();
		}
		
	}
	/**
	 * {@summary to name the given strategy}
	 * @return which type of strategy is implemented
	 */
	public Object getStrategyType () {
		return this.strategy.getClass();
	}
}
