import java.util.PriorityQueue; 

import java.util.Scanner; 
import java.util.Comparator; 
  


        
public  class Huff implements Comparator<Node> { 
  
          
    public static void Zeroone(Node root, String num) 
    { 
       // Character.
  
        if (root.left== null && root.right == null ) { 
  
           
          //  System.out.println(root.r + "|" + num); 
  
            return; 
        } else{
  
           
     
       Zeroone(root.left, num + "0"); 
        Zeroone(root.right, num + "1"); 
        }
    } 
  
   
    public static void main(String[] args) { 
                int size = 7; 
          PriorityQueue<Node> prQue = new PriorityQueue<Node>(size, new Huff());  

        char[] charArr = { 'A', 'B', 'C', 'D', 'E', 'F','G' }; 
        int[] charfreq =      { 3, 7, 10, 12, 15, 40,50 }; 
  
         
  
        for (int i = 0; i < size; i++) { 
  
            Node current = new Node(); 
  
            current.r = charArr[i]; 
           current.data = charfreq[i]; 
  
            current.left = null; 
            current.right = null; 
  
            prQue.add(current); 
        } 
  
        Node currentroot = null; 
  
        while (prQue.size() > 1) { 
  
            Node x = prQue.peek(); 
            prQue.poll(); 
  
            Node y = prQue.peek(); 
            prQue.poll(); 
  
            
            Node temp = new Node(); 
  
            temp.data = x.data + y.data; 
            temp.r = '_'; 
  
            temp.left = x; 
  
            temp.right = y; 
  
            currentroot = temp; 
  
           
            prQue.add(temp); 
        } 
 
        Zeroone(currentroot , " "); 
    } 

   public int compare(Node x, Node y) 
    { 
        if (x.data>y.data) {
            return 1;
        }else {
            return 0;
        }
       
    } 
    
} 
    class Node { 

   Node left; 
   Node right;
     int data; 
     char r; 

            } 

  