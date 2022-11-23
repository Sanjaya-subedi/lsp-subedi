package org.howard.edu.lsp.assignment6;

import java.util.List;

/**
 
 * {@summary Strategy interface}
 * @author Sanjaya Subedi
 *
 */

public interface AverageStrategy {
	/**
	 * {@summary to calculate the average of the grades given in a list }
	 * @param grades list of grade inputted.
	 * @return integer average calculated of inputted grades
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
}





