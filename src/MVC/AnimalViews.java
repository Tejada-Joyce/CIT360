/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;


import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joyce
 */
public class AnimalViews {
    
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
		Animal animal = AnimalController.getInstance().singleAnimal(id);
		System.out.println("ID\tName\tDescription\tStatus");
		System.out.println(animal);
		
	}

	public static void seeAll() {
		List<Animal> animals = AnimalController.getInstance().allAnimals();
		System.out.println("ID\tName\tDescription\tStatus");
		for(Animal animal : animals) {
			System.out.println(animal);
		}
	}
  
}
