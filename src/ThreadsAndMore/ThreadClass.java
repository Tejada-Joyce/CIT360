
package ThreadsAndMore;

/**
 *
 * @author Joyce
 */
 public class ThreadClass extends Thread{

    Printer pRef;
     
    ThreadClass(Printer p){
        pRef = p;
    }
    
    @Override
    public void run(){
        pRef. printDocuments(40,"Danna's project - T1");
    }
}
   
