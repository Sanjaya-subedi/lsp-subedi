package org.howard.edu.lsp.midterm.problem2;

public class Person{
	private String name;
	private int age;
	private String socialSecurityNumber;
	
	public Person(String name, String socialSecurityNumber, int age) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	
	public String toString(){
		return "Person's name: " + this.name +"\n"+
				"Person's age: " + this.age+"\n"+
				"Person's Social Security Number: " +"\n"+ this.socialSecurityNumber;
		
		
	}
	public  boolean equals(Person p1) {
		boolean flag = true;
		if (this.socialSecurityNumber == p1.socialSecurityNumber) {
//			System.out.println("These persons are same!");
			
		}else {
//			System.out.println("Their persons are not the same!");
			flag = false;
			
		}
		return flag;
		
	}
	
	
}
