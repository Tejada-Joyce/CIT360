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
public class BuyEuros implements HandleConverter {

    double change = 3.84;
    
    public void execute (Double soles) {
        Double euros = soles / change;
        Double howMuch = Math.round(euros * 100.0)/100.0;
        System.out.println("That would be " + howMuch + " euros.");
    }
    
}
