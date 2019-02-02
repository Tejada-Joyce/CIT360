/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Joyce
 */
public class AnimalListModel {
    
    String animal;
    int quantity;

    public AnimalListModel(String animal, int quantity) {
        this.animal = animal;
        this.quantity = quantity;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Animal: " + animal + "\tQuantity: " + quantity;
    }
        
}
