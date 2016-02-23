/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunstile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Iman H
 */
public class Tester {
    static final int NUMBER_OF_TURNSTILES = 40;
    static Tunstile[] turnStiles = new Tunstile[NUMBER_OF_TURNSTILES];
    
    public static void main(String[] args) throws InterruptedException {
       TurnstileCounter sharedCounter = new TurnstileCounter();
        
        for( int i = 0; i< NUMBER_OF_TURNSTILES; i++){
          turnStiles[i] = new Tunstile(sharedCounter);
        }
        ExecutorService es = Executors.newCachedThreadPool();
        
        for(int i = 0; i<NUMBER_OF_TURNSTILES; i++){
            es.execute(turnStiles[1]);
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        
        System.out.println("All tunstiles are done");
        System.out.println(sharedCounter.getValue);
    }

    }
    

