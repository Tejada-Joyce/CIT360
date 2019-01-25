/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Joyce
 */
public class DisplayQueue {
 
    public static void displayQueue() {
        
        Queue<String> client = new LinkedList<>();
        
        System.out.println("Is the queue empty? " + client.isEmpty());
        
        client.add("Mary");
        client.add("Aaron");
        client.add("Rose");
        client.add("Carter");
        
        System.out.println("How many clients are there now? " + client.size());
        
        client.poll();
        client.add("Alex");
        
        System.out.println("After attending Mary, who are left? " + client);
        
        String name = "Robert";
        
        System.out.println("Is there a " + name + " in the list?");
        
        if(client.contains(name)){
            System.out.println("Yes, there is.");
        } else {
            System.out.println("No, there isn't.");
        }
        
    }
}
