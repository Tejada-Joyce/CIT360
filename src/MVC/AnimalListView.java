/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joyce
 */
public class AnimalListView {
    
    public void printAnimalDetails(){
           
        Scanner sc = new Scanner(System.in);
        AnimalListController controller = new AnimalListController();
		
        while(true) {
             System.out.println("\nAnimal List\n" + 
                                "1 - Add animal\n" +
                                "2 - Show all animals\n" +
                                "3 - Exit") ;
            int option = sc.nextInt();
            if(option == 1) {
                controller.first();
            } else if(option == 2){
                controller.second();
            } else if(option == 3){
                    System.out.println("BYE!");
                    break;
            } else {
                    break;
            }
        }
        sc.close();
    }
  
}
