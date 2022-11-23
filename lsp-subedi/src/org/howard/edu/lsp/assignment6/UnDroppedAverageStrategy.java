package org.howard.edu.lsp.assignment6;

import java.util.List;

/**
 * {@summary implement average strategy for undropped grades}
 * @author Sanjaya Subedi
 *
 */
public class UnDroppedAverageStrategy implements AverageStrategy {
	
	
	/**
	 * {@summary to calculate the average of the all grades without dropping}
	 * @param grades list of grade inputted.
	 * @return integer average calculated of inputted grades.
	 * @throws EmptyListException
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException{
		
		if (grades.size() == 0) {
			throw new EmptyListException();
		}
		
		int sumGrades = 0;
		for (int i = 0; i < grades.size(); i++) {
			sumGrades += grades.get(i);
		}
		
		int averageSum = Math.round((float) sumGrades / (float) grades.size());
		
		return averageSum;
	}

}
