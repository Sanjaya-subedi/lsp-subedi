package org.howard.edu.lsp.assignment2.combination;

import java.util.ArrayList;

import java.util.Arrays;

public class Combinations{

	  public static ArrayList<ArrayList> compute(int [] input, int sum){
	    /*
	     * taking an array of integers and and desired target sum as parameters as per the question
	     * returning the sets of combinations as an arraylist of arraylists i.e. outputArray
	     */
		  
		ArrayList <ArrayList> outputArray = new ArrayList<>();
	    

	    for (int i = 0; i < input.length; i ++){
	    	
	      //checking if the single value is  equal to the given sum
	      if (input[i] ==sum){
	    	  
	    	//converting that single value to an arraylist of integer
	        ArrayList <Integer> oneIndex = new ArrayList<>(Arrays.asList(i));
	        
	        //appending that single index to the output array
	        outputArray.add(oneIndex);
	        continue;
	     
	      }
	      
	      /*twoindicesArr handles if two numbers add up to desired target sum
	       * largeArr handles cases if more than two numbers add up to target
	       * appending current ith element to both of the arraylists
	       * */
	      ArrayList <Integer> twoindicesArr = new ArrayList<>();
	      ArrayList <Integer> largeArr = new ArrayList<>();

	      twoindicesArr.add(i);
	      largeArr.add(i);
	      
	      /* since there is a chance of two or more than two integers that sum up to the desired target sum, we need to 
	       * keep track of two or more integers
	       */
	      
	      //initializing innerloopSum to 0 so that it starts from 0 after every i loop
	      int innerloopSum = 0;
	      
	      //assigning outerloopSum to keep track of the sum upto the ith index
	      int outerloopSum = input[i];
	      
	      //adding current ith element to the innerloopSum as the new ith iteration starts
	      innerloopSum += input[i];

	      
	      
	      
	      //iterating through the inner loop
	      for (int j = i + 1; j < input.length; j ++){
	    	  
	    	  
	    	//first condition if the sum of ith element and current jth element is less than the desired target sum, we keep appending the index of elements
	        if (outerloopSum + input[j] < sum){
	          largeArr.add(j);
	          
	          //we need to keep track of the sum of the available elements in case they equal to the desired target sum
	          innerloopSum += input[j];
	          
	          //checking is sum is equal
	          if (innerloopSum == sum){
	        	  
	            //creating arraylist to store the indexes of those elements whose sum is equal to the desired target sum
	            ArrayList <Integer> trackingArr = new ArrayList<>();
	            for (int elem = 0; elem < largeArr.size(); elem++) {
	            	trackingArr.add(largeArr.get(elem));
	            }
	            //appending those indexes to the output array
	            outputArray.add(trackingArr);
	         }
	        }	

	        //second condition those ith and jth element equals to sum and we need not do anything if it's greater than desired target sum
	        else if (input[i] + input[j] == sum){
	          twoindicesArr.add(j);
	          
	          //creating new arraylist to append those two indexes
	          ArrayList <Integer> trackingArr = new ArrayList<>();
	          for (int elem = 0; elem < twoindicesArr.size(); elem++) {
	          	trackingArr.add(twoindicesArr.get(elem));
	    
	          }
	          //ultimately appending that new arraylist to the output arraylist
	          outputArray.add(trackingArr);
	          
	        }
	      } 
	    }
	    
	    return outputArray;
	    
	  }
	



	}
