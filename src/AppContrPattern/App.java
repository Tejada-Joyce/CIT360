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
        
        AppControlPat convert = new AppControlPat();

        System.out.println( "Choose what you want to do\n" + 
                            "1 - Buy Dollars\n" +
                            "2 - Sell Dollars\n" +
                            "3 - Buy Euros\n" + 
                            "4 - Sell Euros\n") ;

        Integer key = keyboard.nextInt();

        System.out.println("Enter the amount you want to change:");
        Double money = keyboard.nextDouble();

        convert.handleCommand(key,money);
    
    }    
}
