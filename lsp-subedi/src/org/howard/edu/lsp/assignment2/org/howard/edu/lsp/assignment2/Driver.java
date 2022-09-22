package org.howard.edu.lsp.assignment2;

import java.util.ArrayList;


import java.util.Arrays;

import org.howard.edu.lsp.assignment2.combination.Combinations;



public class Driver {

	public static void main(String[] args) {

		
		
		Combinations combi = new Combinations();
		//homework testcase
		int [] input1 = {5, 5,15,10};
	    int target1 = 15;
	    System.out.println(combi.compute(input1,target1));
	    
	    
	    //given testcase in homework
	    int [] input2 = {1,2,3,4,5,6};
	    int target2 = 6;
	    System.out.println(combi.compute(input2,target2));
	    
	    
	    //given in homework
	    int [] input3 = {};
	    int target3 = 15;
		System.out.println(combi.compute(input3,target3));
		
		
		
		//given testcase in homework
		int [] input4 = {1,2,3,4,5};
	    int target4 = 15;
		System.out.println(combi.compute(input4,target4));
		
		
		//testing negative values
		int [] input5 = {3, 0, -3, 1, -4, 8};
	    int target5 = 1;
		System.out.println(combi.compute(input5,target5));
		
		
		//random list
		int [] input6 = {1,4,5,6,2,3};
	    int target6 = 4;
		System.out.println(combi.compute(input6,target6));
		
		
		
		
		
		
		

		

    

	}
	


}