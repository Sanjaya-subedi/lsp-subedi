package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;



import java.util.List;

import org.howard.edu.lsp.assignment4.IntegerSetException;

import java.util.*;
  

public class IntegerSet {
private List<Integer> set = new ArrayList<Integer>();
	

	// Default Constructor
	public IntegerSet() {
		
	};
	

	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};
	
	
	// Returns the length of the set
	public int length() {
		return set.size();
		
	}; 
	
	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b) {
		if (set.size() != b.set.size()) {
			return false;
		}
		for (int elem: set) {
			if (!b.contains(elem)) {
				return false;
			}
	
			
		}return true;
	};

	
	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
				
	};    
	
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest()  throws IntegerSetException{
		int maxi = (int) Float.NEGATIVE_INFINITY;
		if (set.size() == 0) {
			throw new IntegerSetException();
		}
		else {
			for (int i = 0; i < set.size(); i++) {
				if (set.get(i) > maxi) {
					maxi = set.get(i);
				};
			}
			return maxi;
			
		}
		
		
	}; 
	
	
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest()  throws IntegerSetException{
		int mini = (int) Float.POSITIVE_INFINITY;
		if (set.size() == 0) {
			throw new IntegerSetException();
		}
		else {
			for (int i = 0; i < set.size(); i++) {
				if (set.get(i) < mini) {
					mini = set.get(i);
				};
			}
			return mini;
			
		}
		
		
	};
	
	
	
		// Adds an item to the set or does nothing if it is already there	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}; 
	
	
		// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		};
		
		
	}; 
	
	
	// Set union
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			if (set.contains(intSetb.set.get(i))) {
				
			}else {
				set.add(intSetb.set.get(i));
			}
		}
	};
	
	// Set intersection
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
		
	}; 
	
	
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.set);
	}
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return set.isEmpty();
		
	}
	
	
	
	// Return String representation of your set
	public String toString() {
		String res_String = "";
		for (int i=0;i<length();i++) {
			res_String += Integer.toString(set.get(i));
		}
		return res_String;
		

};
}
