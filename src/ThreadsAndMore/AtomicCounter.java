/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsAndMore;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Joyce
 */
public class AtomicCounter {

    private AtomicInteger count = new AtomicInteger(0);

    public int incrementAndGet() {
        return count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
 
}
