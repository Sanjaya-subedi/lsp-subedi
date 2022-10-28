
package org.howard.edu.lsp.midterm.problem1;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.howard.edu.lsp.midterm.problem1.VotingMachine;
import org.howard.edu.lsp.midterm.problem1.UnknownCandidateException;

public class VotingMachineTest {
	@Test
	@DisplayName("Test cases for getVotes")
	public void testgetVotes() throws UnknownCandidateException{
		VotingMachine machine = new VotingMachine(); 
//		LinkedHashMap<String, Integer> votesRep = new LinkedHashMap<>();
		machine.addCandidate("Sanjaya");
		machine.addCandidate("Bernard");
		machine.addCandidate("A");
		machine.addCandidate("B");
		machine.addCandidate("C");
		
		
		machine.castVotes("Sanjaya", 60);
		machine.castVotes("Bernard", 6);
		machine.castVotes("A", 50);
		machine.castVotes("B", 80);
		machine.castVotes("C", 10);
		
		
		assertEquals("error found in getVotes()", 60, machine.getVotes("Sanjaya"));
		assertNotEquals("error found in getVotes()", 80, machine.getVotes("Sanjaya"));
		assertNotEquals("error found in getVotes()", 0, machine.getVotes("Bernard"));
		assertEquals("error found in getVotes()", 10, machine.getVotes("C"));
		assertEquals("error found in getVotes()", 80, machine.getVotes("B"));
		
		
	}
	
	
	
	@Test
	@DisplayName("testgetVotes throws exception")
	public void testgetVotes_THROWS_EXCEPTION() {
		VotingMachine machine = new VotingMachine();
		Exception exception = assertThrows(UnknownCandidateException.class, ()->{
			machine.getVotes("Liza");
		});
		String expectedMessage = "Candidate name is not present!";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("Test cases for sum")
	public void testsum() {
		VotingMachine machine = new VotingMachine(); 
//		LinkedHashMap<String, Integer> votesRep = new LinkedHashMap<>();
		machine.addCandidate("Sanjaya");
		machine.addCandidate("Bernard");
		machine.addCandidate("A");
		machine.addCandidate("B");
		machine.addCandidate("C");
		
		
		machine.castVotes("Sanjaya", 60);
		machine.castVotes("Bernard", 6);
		machine.castVotes("A", 50);
		machine.castVotes("B", 80);
		machine.castVotes("C", 10);
		
		assertNotEquals("error found in sum()", 230, machine.sum());
		assertEquals("error found in sum()", 206, machine.sum());
		
		
		
	
	}

		
		
		
		
	
	
	}
	