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
public class es_1 extends Thread{
private String m;
    public es_1(String riga) {
        m=riga;
    }
    
   @Override
  synchronized public void run(){
      try {
          if(m.equals("bella")){
              Thread.sleep(500);
          }
       while(true){
       System.out.println(m);
           
               this.sleep(1000);
       }
      }catch (InterruptedException ex) {
        Logger.getLogger(es_1.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}

   

