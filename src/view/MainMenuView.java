/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import JavaCollections.*;
/**
 *
 * @author joyce
 */
public class MainMenuView extends MenuView{

 

    public MainMenuView() {
        super("\n" +
                "*********************\n" +
                "* Java Collections  *\n" +
                "*********************\n" +
                " 1 - List\n" +
                " 2 - Set\n" +
                " 3 - Map\n" +
                " 4 - Queue\n" +
                " 5 - Tree\n" +
                " 6 - Stop\n",     
         6);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
        @Override public void doAction(int option)
    {
        switch(option)
        {
             
            case 1: 
                List();
                break;
          
            case 2: 
                Set();
                break;
          
            case 3:
                Map();
                break;
         
            case 4: 
                Queue();
                break;
       
            case 5:
                Tree();
                break;
                
            case 6:
                System.out.println("That's it");
        }
    } 
    
  
    public void List()
    {
        DisplayList.displayList();
    }
     
    
    public void Set()
    {
        DisplaySet.displaySet();   
    }
    
    
    public void Map()
    {
        DisplayMap.displayMap();  
    }
    
    
    public void Queue()
    {
        DisplayQueue.displayQueue();   
    }
    
    public void Tree()
    {
    	DisplayTree.displayTree();   
    }
}
