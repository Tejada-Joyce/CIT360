package JavaCollections;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.SortedSet;

/**
*
* @author Joyce
*/

public class DisplayTree {

    public static void displayTree() {
        
        //The elements in a TreeSet are sorted according to their natural ordering. 
        TreeSet<Integer> numbers = new TreeSet<>();

        //TreeSet cannot contain null value.
        numbers.add(25);
        numbers.add(48);
        numbers.add(16);
        numbers.add(33);
        numbers.add(19);
        numbers.add(29);
               
        System.out.println("Random Numbers : " + numbers);

        numbers.removeIf(number -> number % 4 != 0);

        System.out.println("Only numbers divisible by 4: "+ numbers);

        //TreeSet cannot contain duplicate elements.
        numbers.add(42);
        numbers.add(42);
        numbers.add(17);
        numbers.add(22);

        System.out.println("Random Numbers (updated) : " + numbers);
        
        //It provides functionalities to navigate 
        int firstNumber = numbers.first();
        int lastNumber = numbers.last();

        System.out.printf("First Number: " + firstNumber +
                          "\nLast Number: " + lastNumber);

        SortedSet<Integer> reverseList = new TreeSet<>(Comparator.reverseOrder());
        reverseList.addAll(numbers);

        System.out.println("\nRandom Numbers (descending order) : " + reverseList);
    }
}
