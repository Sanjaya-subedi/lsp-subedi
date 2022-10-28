package org.howard.edu.lsp.midterm.problem2;

public class Driver {

	public static void main(String[] args) {
		
		Person p = new Person("Sanjaya Subedi", "1122334455", 21);
		System.out.println("Description of person: "+ p.toString());
		System.out.println("\n");
		
		Person p1 = new Person("Liza Uprety", "112256785", 41);
		System.out.println("Description of person: "+ p1.toString());
		System.out.println("\n");
		
		
		Person testPerson = new Person("Randy", "1122334455", 55);
		if (p.equals(testPerson)) {
			System.out.println("These persons are the same");
		}else {
			System.out.println("These persons are not the same");
			
		}
		
		System.out.println("\n");
		
		
		
		Person testPerson2 = new Person("Rishi", "11334455", 75);
		if (p.equals(testPerson2)) {
			System.out.println("These persons are the same");
		}else {
			System.out.println("These persons are not the same");
			
		}
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
	}
}