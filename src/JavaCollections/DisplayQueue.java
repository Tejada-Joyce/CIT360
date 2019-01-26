
package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Joyce
 */

//A Queue is a First In First Out (FIFO) data structure.
public class DisplayQueue {
 
    public static void displayQueue() {
        
        Queue<String> client = new LinkedList<>();
        
        System.out.println("Is the queue empty? " + client.isEmpty());
        
        //The Enqueue operation
        client.add("Mary");
        client.add("Aaron");
        client.add("Rose");
        client.add("Carter");
        
        System.out.println("How many clients are there now? " + client.size());
        
        //The Dequeue operation
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
