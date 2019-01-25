/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Joyce
 */
public class DisplayList {
    
    public static void displayList() {
        
        List<String> famousSingers = new ArrayList<>();
        famousSingers.add("Bruno Mars");
        famousSingers.add("Charlie Puth");
        famousSingers.add("Adele");
        famousSingers.add("Ed Sheeran");
        famousSingers.add("Ariana Grande");
        
        System.out.println("Top 5 Singers: " + famousSingers);
        
        famousSingers.remove("Charlie Puth");
        famousSingers.add("Taylor Swift");
        
        System.out.println("Top 5 Singers (Updated): " + famousSingers);
        
        Collections.sort(famousSingers);
        System.out.println("Top 5 Singers in Alphabetical Order: " + famousSingers);
        
    }
}
