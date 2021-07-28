/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

/**
 *
 * @author A.Safarji
 * @param <T>
 */
public interface Queue<T> {
    
   boolean enQue (T value ) throws QueueException;
   public boolean Full();
    public boolean Empty();
    int size();
    
   
   
   T Deque ();
    
}
