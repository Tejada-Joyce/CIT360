/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Joyce
 */
public class DisplaySet {
    
    public static void displaySet() {
        
        Set<Integer> age = new HashSet<>();
        
        age.add(25);
        age.add(32);
        age.add(34);
        age.add(28);
        age.add(21);
        
        System.out.println("Workers' Ages in General are:");
        age.forEach((ages) -> {
            System.out.println(ages);
        });
        
        Set<Integer> overThirty = new HashSet<>();
        overThirty.add(32);
        overThirty.add(34);
        
        age.removeAll(overThirty);
        
        System.out.println("Workers' Ages under 30: ");
        age.forEach((younger) -> {
            System.out.println(younger);
        });
        
        age.add(21);
        
        System.out.println("After adding another 21:" + age);
    }

 }
