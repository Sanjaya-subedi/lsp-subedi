package org.howard.edu.lsp.midterm.problem1;

public class UnknownCandidateException extends Exception{
	private static final long serialVersionUID = 1L;

	public UnknownCandidateException() {
		super("Candidate name is not present!");

	}
}
