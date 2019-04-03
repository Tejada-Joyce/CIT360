package MVC2;

import java.util.Scanner;

public class AnimalFormView {
	public AnimalFormView() {
		
	}
	
	public Object[] showForm(Scanner sc) {
	    System.out.flush();  
		System.out.println("\n***** New Dog *****");							
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Breed: ");
		String breed = sc.next();
		System.out.print("Status (Healthy/Recovering): ");
		String status = sc.next();
				
		Object[] params = {name, breed, status};
		System.out.println("\nYour dog's information has been added.");
		return params;
		
	}
}
