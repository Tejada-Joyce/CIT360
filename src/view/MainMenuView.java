
package view;

import ThreadsAndMore.ImplementAll;
import AppContrPattern.*;
import MVC.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author joyce
 */
public class MainMenuView extends MenuView{

    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================

    public MainMenuView() {
        super("\n" +
                "**************************\n" +
                "* CIT 360 - Technologies *\n" +
                "**************************\n" +
                " 1 - Java Collections\n" +
                " 2 - Threads, Executors and Runnables\n" +
                " 3 - Application Control Pattern\n" +
                " 4 - MVC\n" + 
                " 5 - Quit\n",     
         5);
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
                displayJavaCollectView();
                break;
           
            case 2: 
                {
                    try {
                        displayThreadsAndMore();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                
            case 3: 
                displayAppControlPatt();
                break;
                
            case 4:
                displayMVC();
                break;
                        
            case 5:
                System.out.println("That's it");    
        }
    } 
      
    
    public void displayJavaCollectView()
    {
        JavaCollectView jcv = new JavaCollectView();
        jcv.displayMenuView();
    }
     
    
    public void displayThreadsAndMore() throws InterruptedException
    {
        ImplementAll threadsAndMore = new ImplementAll();
        threadsAndMore.displayThreadsAndMore();
    }
    
    public void displayAppControlPatt()
    {
        App acp = new App();
        acp.displayAppControPattern();
    }  
    
    public void displayMVC()
    { 
        AnimalListView alv = new AnimalListView();
        alv.printAnimalDetails();
    }
  
}
