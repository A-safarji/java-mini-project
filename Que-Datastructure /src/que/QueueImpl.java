/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

import java.lang.reflect.Array;


public class QueueImpl<T> implements Queue<T> {
   private int front=0;
   private int rear =-1;
   private T[] arr;
   private int Cap;
    QueueImpl(Class<T> c, int cap){
        Cap=cap;
        
    this.arr= (T[])Array.newInstance(c, Cap);
    
}




    @Override
    public boolean enQue(T value) throws QueueException {
            if (Full()) {
               throw new QueueException("Que is full") ;
            }
         /*
     if(rear == Cap-1 && front != 0) {
         for(int i = 0; i <= size(); i++){
             arr[front++]=  arr[i];
             
         }
           front=0;
                 rear=size()-1;
     }
         */    
        arr[++rear]= value;
       
        return true;
   

    }

   
   @Override
    public T Deque() {
                                                             //  if(Empty())
    //  for (int i = 0; i < rear-1; i++) {  // or i=1,
                 //   arr[i]=arr[i+1];
                 //rear--;
  
                 
 for (int i = 0; i <=rear ; i++) {  //shift
         arr[i]=arr[i+1];
         
 }
            
            
    //    }
  
       
        T d = arr[front++];
	rear--; //shift
       
		return d;
       
    
}
   @Override
    public boolean Full() {
if (front==0 && rear ==Cap-1) {
    
    return true;
}
       return false;
       
              }
   
   @Override
     public boolean Empty(){
         
         if (front >rear) {
             return true;
         }
       return false;
     }
        
     
      

   @Override
    public String toString() {
        String Content= "";
         for (int i =front; i <= rear; i++) 
             Content+= i+"->"+arr[i]+"\n";
         
         
         return Content;
        
    }
    
 /*   String content="";
		
		for(int i=0; i<this.size; i++) {
                    content += i + " -> " + arr[i] + "\n";
                }
		
		return content;
*/
    @Override
    public int size() {
       return rear-front+1;
     
    }
}
