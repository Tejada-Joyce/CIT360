
package view;

import ThreadsAndMore.ImplementAll;
import Hibernate.*;
import HttpURLConnection.HttpUrlConecc;
import JSON.Json;
import JSON.Json2;
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
                " 3 - Application Controller Pattern\n" +
                " 4 - MVC\n" + 
                " 5 - Hibernate\n" +
                " 6 - JSON\n" +
                " 7 - HttpURLConnection\n" +
                " 8 - Quit\n",      
         8);
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
                displayHibernate();
                break;  
                
            case 6:
				try {
					displayJSON();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                break; 
                
            case 7:
                displayHttpUrlCon();
                break;      
                        
            case 8:
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
        ImplementAll.displayThreadsAndMore();
    }
    
    public void displayAppControlPatt()
    {
        App.displayAppControPattern();
    }  
    
    public void displayMVC()
    { 
        AnimalViews.display();
    }
    
    public void displayHibernate()
    { 
        RunHibernate.displayHibernate();
    }
    
    public void displayJSON() throws Exception
    {
    	Json2.fileToJson();
		Json.jsonToFile();
    }
    public void displayHttpUrlCon() 
    {
    	HttpUrlConecc.displayHttpUrlConn();
    }
  
}
