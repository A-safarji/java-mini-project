/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

/**
 *
 * @author A.Safarji
 */
public class Que {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Queue<Integer> s1 = new QueueImpl<Integer>(Integer.class,100); // 5 is the size
        
     //   try{
     //   s1.enQue(0);
        // s1.enQue(1);
        //  s1.enQue(2);
        //  s1.enQue(3);
          //s1.enQue("hjhj");
     //   s1.Deque();
        //    s1.Deque();
            for (int i = 0; i <=5; i++) {
                s1.enQue(i+2);
               
                
            }
           System.out.println(s1);
           
            // s1.enQue("hjhj");
      //  System.out.println(s1);/// if u add done afer the que wont print it will jamp
       // }catch ( QueueException qe){
       //     System.out.println(qe);
       // }
      //  System.out.println("done is full Que");
   // }
    
}
}