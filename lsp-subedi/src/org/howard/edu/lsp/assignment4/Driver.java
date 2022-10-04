package org.howard.edu.lsp.assignment4;

public class Driver {

	public static void main(String[] args) throws IntegerSetException{
		// TODO Auto-generated method stub
		//creates a new set set1
				IntegerSet set1 = new IntegerSet();
				
				
				//adding some values to the set
				set1.add(5);
				set1.add(1);
				set1.add(8);
				
				
				
				//printing values of set1 in string form
				System.out.println("Value of Set1 is:"+set1.toString());
				
				
				//returns the smallest value of set1
				System.out.println("Smallest value of Set1 is:"+set1.smallest());
				
				
				//returns the largest value of set1
				System.out.println("Largest value of Set1 is:"+set1.largest());
				
				
				//adding new element and checking if the set contains that or any other elements on it or not
				set1.add(9);
				System.out.println("Value of Set1 is:"+set1.toString());
				System.out.println(set1.contains(6));
				System.out.println(set1.contains(9));
				System.out.println(set1.contains(1));
				
				
				
				//removing some elements and making sure it doesnot contain anymore and it doesnot do anything if it is not there
				set1.remove(1);
				set1.remove(9);
				System.out.println(set1.contains(9));
				System.out.println(set1.contains(1));
				System.out.println("Value of Set1 is:"+set1.toString());
				
				
				//creates a new set set2 adding values to it
				IntegerSet set2 = new IntegerSet();
				set2.add(9);
				set2.add(5);
				set2.add(0);
				
				
				//printing values of set2 in string form
				System.out.println("Value of Set2 is:"+set2.toString());
				
				
				
				//checks the union method of two sets and set1 stores all the values
				set1.union(set2);
				System.out.println("Result of union of Set1 and Set2:"+set1.toString());
				
				
				
				//checks the intersection method of two sets and set1 stores the overlapping values
				set1.intersect(set2);
				System.out.println("Result of intersection of Set1 and Set2:"+set1.toString());
				
				
				
				//checks the difference method of two sets and set1 stores the only values of set1
				set1.diff(set2);
				System.out.println("Result of difference of Set1 and Set2:"+set1.toString());
				
				
				
				//checks if set1 and set2 is empty or not
				System.out.println(set1.isEmpty());
				System.out.println(set2.isEmpty());
				
				
				
				//creating a new empty set3 and it throws the exception error as there are no elements
				try {
					IntegerSet set3 = new IntegerSet();
					set3.largest();
				}catch (IntegerSetException e){
					System.out.println(e.getMessage());
					
				}
				
				
				//creating a new empty set4 and it throws the exception error as there are no elements
				try {
					IntegerSet set4 = new IntegerSet();
					set4.smallest();
				}catch (IntegerSetException e){
					System.out.println(e.getMessage());
				}

				
				
				
				//clears the values of set1
				set1.clear();
				
				//adding values to return length
				set1.add(19);
				set1.add(15);
				System.out.println("Value of Set1 is:"+set1.toString());
				set1.add(12);
				set1.add(10);
				System.out.println("length of Set1 is:"+set1.length());
				
				
				
				

				//checks if set1 equals to set2
				System.out.println(set1.equals(set2));

	}

}
