/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppContrPattern;

import java.util.Scanner;

/**
 *
 * @author Joyce
 */
public class App {
    
    private static Scanner keyboard = new Scanner(System.in);   
    
    public static void displayAppControPattern() {
        
        System.out.println( "Choose what you want to do\n" + 
                            "1 - Buy Dollars\n" +
                            "2 - Sell Dollars\n" +
                            "3 - Buy Euros\n" + 
                            "4 - Sell Euros\n") ;

        Integer key;
		do {
			key = keyboard.nextInt();
			if(key < 1 || key > 4) {			
			System.out.println("\nChoose a valid option. Option must be between 1 and 4.");
			}   
		} while(key < 1 || key > 4);
       
        System.out.println("Enter the amount you want to change:");
        
        Double money;
        
        do {
        	money = keyboard.nextDouble();
        	if(money < 0) {			
    			System.out.println("\nThat amount is not allowed. Please enter a valid amount.");
    			}   
    	} while(money < 0);
        
        AppControlPat.handleCommand(key,money);
    
    }    
}
