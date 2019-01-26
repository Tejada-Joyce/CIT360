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
        //For ArrayList, you need to use boxed types like Integer, Character, Boolean etc.
        List<String> famousSingers = new ArrayList<>();
        
        //An ArrayList allows duplicate and null values.
        //Java ArrayList is an ordered collection. 
        famousSingers.add("Bruno Mars");
        famousSingers.add("Charlie Puth");
        famousSingers.add("Adele");
        famousSingers.add("Ed Sheeran");
        famousSingers.add("Ariana Grande");
        famousSingers.add("Ariana Grande");
        
        System.out.println("Top 5 Singers: " + famousSingers);
        
        //An ArrayList is a re-sizable array, also called a dynamic array.
        //It allows you to retrieve the elements by their index.
        famousSingers.remove(5);
        famousSingers.set(1,"Taylor Swift");
        
        System.out.println("Top 5 Singers (Updated): " + famousSingers);
        
        Collections.sort(famousSingers);
        System.out.println("Top 5 Singers in Alphabetical Order: " + famousSingers);
        
    }
}
