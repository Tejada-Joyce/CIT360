/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author Joyce
 */
public class DisplayMap {
    
    public static void displayMap() {
        
        //The iteration order in a LinkedHashMap is normally the order in which the elements are inserted.
        LinkedHashMap<String, String> regularOrders = new LinkedHashMap<>();
        
        regularOrders.put("Roger", "Lemon pie");
        regularOrders.put("Paul", "Chocolate cake");
        regularOrders.put("Juliet", "Cheesecake");
        regularOrders.put("Rebecca", "Carrot cake");
        regularOrders.put("David", "Lemon pie");
        //A LinkedHashMap cannot contain duplicate keys.
        regularOrders.put("David", "Lemon pie");
        //LinkedHashMap can have null values and the null key.
        regularOrders.put(null, null);
        
        System.out.println("Clients and their regular orders:" + regularOrders);
        
        String newOrder = "Ice cream cake";
        regularOrders.put("David", newOrder);
        System.out.println("David has changed his regular order lately to: " + regularOrders.get("David"));
        
        Set<String> clients = regularOrders.keySet();
        System.out.println("Clients: " + clients);

        Collection<String> regularOrder = regularOrders.values();
        System.out.println("Popular Orders: " + regularOrder);
        
    }
}
