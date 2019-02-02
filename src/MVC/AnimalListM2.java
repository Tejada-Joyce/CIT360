/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class AnimalListM2 {
    private ArrayList<AnimalListModel> animals = new ArrayList<>();
    
    public void addAnimal(AnimalListModel animal) {
        animals.add(animal);
        System.out.println("Animal Added");
        System.out.println(animal);
    }
    
    public ArrayList<AnimalListModel> getAnimals(){
        return this.animals;
    }
       
}
