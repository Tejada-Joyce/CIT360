/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppContrPattern;

/**
 *
 * @author Joyce
 */
public class BuyDollars implements HandleConverter {
    
    double change = 3.36;
    
    public void execute (Double soles) {
    	
	    Double dollars = soles / change;
        Double howMuch = Math.round(dollars * 100.0)/100.0;
        System.out.println("That would be " + howMuch + " dollars.");
        
    }
    
}
