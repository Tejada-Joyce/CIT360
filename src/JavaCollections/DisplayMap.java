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
        
        LinkedHashMap<String, String> regularOrders = new LinkedHashMap<>();
        regularOrders.put("Roger", "Lemon pie");
        regularOrders.put("Paul", "Chocolate cake");
        regularOrders.put("Juliet", "Cheesecake");
        regularOrders.put("Rebecca", "Carrot cake");
        regularOrders.put("David", "Lemon pie");
        
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
