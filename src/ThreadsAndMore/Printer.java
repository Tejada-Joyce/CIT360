/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsAndMore;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Joyce
 */
public class Printer {
    //Use of the synchronized keyword 
    synchronized void printDocuments(int numOfCopies, String docName){
        for (int i = 1; i <= numOfCopies; i++) {
            try {
                Thread.currentThread().sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }  
            System.out.println(">>Printing " + docName + " " + i + "<<");
        }
    }
}
