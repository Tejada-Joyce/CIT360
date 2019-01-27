
package ThreadsAndMore;

/**
 *
 * @author Joyce
 */

public class RunnableClass implements Runnable {

    Printer pRef;
     
    RunnableClass(Printer p){
        pRef = p;
    }
    
    @Override
    public void run(){
        pRef. printDocuments(40,"Mario's project - T2");
    }
   
}
