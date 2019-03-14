/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;


import java.util.Scanner;

/**
 *
 * @author Joyce
 */
public class AnimalListView {
    
private static Scanner keyboard = new Scanner(System.in);   
    
    public static void display() {
        
        System.out.println( "Choose what you want to do\n" + 
                            "1 - Search animal by ID\n" +
                            "2 - See all animals\n" ) ;
                                    
        Integer option = keyboard.nextInt();
        
        switch(option)
        { 
            case 1: 
                displayByID();
                break;
           
            case 2:
                seeAll();
                break; 
         } 
                
    }    

	public static void displayByID() {
		System.out.println( "Enter the ID (1-5)\n");
		
		Integer id = keyboard.nextInt();
		System.out.println(TestDAO.getInstance().getAnimal(id));
		
	}

	public static void seeAll() {
		TestDAO.getInstance().printAnimals();
	}
  
}
