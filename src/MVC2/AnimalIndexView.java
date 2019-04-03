package MVC2;

import java.util.Scanner;


public class AnimalIndexView {
	
	public AnimalIndexView() {
		
	}
	
	public int showIndexView(Scanner sc) {
	    System.out.flush();  		
		System.out.println( "\n" +
							"***Choose what you want to do***\n" + 
			                "1 - Add a new dog\n" +
			                "2 - See all dogs\n" +
			                "3 - Return\n") ;
		int option = sc.nextInt();
		
		return option;
	}

}
