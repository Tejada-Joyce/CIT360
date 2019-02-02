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
public class AnimalListController {
    
    private AnimalListM2 alm2 = new AnimalListM2();
    Scanner sc = new Scanner(System.in);
        
    public void first(){
        System.out.println("Enter animal");
        String animal = sc.next();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        this.AddAnimal(animal, quantity);
    }
    
    public void second(){
        this.showAll();
    }
    private void AddAnimal(String animal, int quantity) {
        AnimalListModel alm = new AnimalListModel(animal, quantity);
        this.alm2.addAnimal(alm);
    }

    private void showAll() {
        ArrayList<AnimalListModel> animals = this.alm2.getAnimals();
        animals.forEach((a) -> {
            System.out.println(a);
        });
    }
   
   
}
