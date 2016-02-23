/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunstile;

/**
 *
 * @author Iman H
 */
public class Tunstile implements Runnable {
private final TurnstileCounter counter;
private int count;

final int COUNT_MAX = 1000;

    public Tunstile(TurnstileCounter c) {
        counter = c;
    }
   
    public int getCount(){
        return count;
    }
    
    
   

    @Override
    public void run() {
         for(int i = 0; i< COUNT_MAX; i++){
             counter.inreLock();
             count++;
         }
    }
    
}
