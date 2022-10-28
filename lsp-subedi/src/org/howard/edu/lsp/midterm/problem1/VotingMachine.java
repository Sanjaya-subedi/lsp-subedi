package org.howard.edu.lsp.midterm.problem1;

//importing libraries
import java.util.LinkedHashMap;

import java.util.Scanner;
import java.util.Set;

public class VotingMachine {
	
	// YOU must decide upon an appropriate data representation to associate a name with respective votes. Create whatever you like.
	//LinkedHasMap is used to keep track of voters with their respective votes
	static Scanner  sc = new Scanner(System.in);
	static LinkedHashMap<String, Integer> votesRep = new LinkedHashMap<>();
	
	
	public static void main(String[] args) throws UnknownCandidateException {
		
		boolean flag = true;
		while (flag) {
			
			System.out.println("1. Add Candidate");
			System.out.println("2. Cast Votes");
			System.out.println("3. Get Votes");
			System.out.println("4. Sum of votes");
			
			//getting input and executing accordingly
			int input_Voter = sc.nextInt();
			
			//if voters want to add candidate
			if (input_Voter == 1) {
				sc.nextLine();
				System.out.println("Enter the name of the candidate");
				String name = sc.nextLine();
				addCandidate(name);
			}
			
			
			//if voters want to cast vote to the candidates
			else if (input_Voter == 2) {
				sc.nextLine();
				System.out.println("Enter candidates name to cast vote: ");
				String name = sc.nextLine();
				if (votesRep.containsKey(name)) {
					int vote = votesRep.get(name);
					vote = vote + 1;
					castVotes(name,vote);
				} else {
					System.out.println("Invalid candidate.");
				}
				
			}
			//if voters want to know the number of votes of a given candidate
			else if (input_Voter == 3) {
				sc.nextLine();
				System.out.println("Enter candidates name to see vote of: ");
				String name = sc.nextLine();
				getVotes(name);
			} 
			
			//if voters want to get the number of total votes of all candidates
			else if (input_Voter == 4) {
				sum();
			}else {
				return;
			}
		}
	}
	
	
	
	public static void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		votesRep.put(name, 0);
	} 
	
	
	
	public static void castVotes(String name, int votes) {
		// Cast votes to the candidate with the given name
		votesRep.put(name,votes);
	}
	
	
	
	public static int getVotes(String name) throws UnknownCandidateException{
		//		public int getVotes(String names)  throws UnknownCandidateException {
		//		// Return the number of votes for a given candidate.  Throws
		//// UnknownCandidateException if name not present.  Make this a 
		//// checked exception.
		if (votesRep.containsKey(name)) {
			int vote = votesRep.get(name);
			return vote;
			
		} else {
			throw new UnknownCandidateException();
		}
		
	}
	

	
	

	

	public static int sum() {
		// Return the total number of votes for all candidates.	
		int total = 0;
		Set<String> votes = votesRep.keySet();
		for (String vote : votes) {
			total += votesRep.get(vote);
		}return total;
	}
}