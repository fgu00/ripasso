/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripasso;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class es_2 extends Thread{
    private int a;

    public es_2(int a) {
        this.a = a;
    }
    @Override
     synchronized public void run(){
         while(true){
             try {
                 if(a==2){
                     this.sleep(500);
                 }
                 Ripasso.m=Ripasso.m+a;
                 System.out.println("risultato = "+Ripasso.m);
                 this.sleep(500);
             } catch (InterruptedException ex) {
                 Logger.getLogger(es_2.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
}
}
