package org.howard.edu.lsp.assignment6;

/**
 * {@summary to handle the empty list}
 * @author Sanjaya Subedi
 *
 */

public class EmptyListException extends Exception {
	
	/**
	 * @return void
	 * {@summary to show the error message}
	 */
	public EmptyListException() {
		super("Empty list cannot have values to calculate averages");
	}
}

