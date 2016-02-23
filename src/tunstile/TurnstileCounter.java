/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunstile;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Iman H
 */
public class TurnstileCounter {
    
    static final long DELAY_VAL = 10000;
    long count = 0;
    boolean getValue;

    public long getValue(){
        return 0;
        
    }
   


    void inreLock() {
     count ++;
    }
    
    public synchronized void incrSync(){
        count++;
    }
        AtomicLong count_example = new AtomicLong();
        
        public void incrAtomic(){
            count_example.getAndIncrement();
        }
        private final ReentrantLock lock = new ReentrantLock();
        public void incrLock() {
            lock.lock();
            try{
                count++;
            } finally{
                lock.unlock();
            }
        }
            
        }
    
    

