/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppContrPattern;

import java.util.HashMap;

/**
 *
 * @author Joyce
 */
public class AppControlPat {
    
    public static HashMap<Integer, HandleConverter> request = new HashMap<>();
    
    public static void handleCommand(Integer key, Double money){
        
        request.put(1, new BuyDollars());
        request.put(2, new SellDollars());
        request.put(3, new BuyEuros());
        request.put(4, new SellEuros());
        
        HandleConverter handler = request.get(key);
        handler.execute(money);
    }
    
}
