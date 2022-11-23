package org.howard.edu.lsp.assignment6;

import java.util.Collections;
import java.util.List;

/**
 * {@summary implement average strategy for the two lowest dropped grades}
 * @author Sanjaya Subedi
 *
 */
public class TwoLowestDroppedAverageStrategy implements AverageStrategy {
	
	/**
	 * {@summary to calculate the average of the grades after removing two lowest grades}
	 * @param grades list of grade inputted.
	 * @return integer average calculated of inputted grades after removing two lowest grades
	 * @throws EmptyListException
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException{
		
		if (grades.size() <= 2) {
			throw new EmptyListException();
		}
		
		Collections.sort(grades);
		
		grades.remove(0);
		grades.remove(0);
		
		Integer sumGrades = 0;
		
		for(int i = 0; i < grades.size(); i++) {
			sumGrades += grades.get(i);
		}
		
		Integer averageSum =  Math.round( (float) sumGrades / (float) grades.size());
		return averageSum;
	}

}
