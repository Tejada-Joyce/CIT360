/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsAndMore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Joyce
 */

public class ImplementAll {
    
    static final int NUMBER_COPIES = 200;
    
    public static void displayThreadsAndMore() throws InterruptedException {
        
               
        Printer printer = new Printer();
        
        //Use of Thread
        ThreadClass task1 = new ThreadClass(printer);
        //Use of Runnable
        Runnable aRef = new RunnableClass(printer);
        Thread task2 = new Thread(aRef);
        
        //Use of Executors      
        System.out.println("Creating Executor Service with a thread pool of Size 2");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        
        Runnable task3 = new RunnableClass(printer) {   
            @Override
            public void run(){
            pRef. printDocuments(40,"Rose's project - T3");
            }            
        };
        
        Runnable task4 = new RunnableClass(printer) {
            @Override
            public void run(){
            pRef. printDocuments(40,"Paul's project - T4");
            }           
        };

        Runnable task5 = new RunnableClass(printer){ 
            @Override
            public void run(){
            pRef. printDocuments(40,"Jacob's project - T5");
            }            
        };
                
        System.out.println("Submitting the tasks for execution...");
        //Running Thread
        task1.start();
        //Running Runnable
        task2.start();
        //Running Executors
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);

        //Example of Manage of an Atomic Variable
        AtomicCounter counter = new AtomicCounter();

        for(int i = 0; i < NUMBER_COPIES; i++) {
            executorService.submit(() -> counter.incrementAndGet());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        
        System.out.println("Final count is : " + counter.getCount());
    }
    
}   

