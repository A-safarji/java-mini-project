/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication43;

import java.util.ArrayDeque;

public class NewInterfaceImp extends HuffmanCode implements NewInterface  {
 
 
  private int size=6;

    public NewInterfaceImp(char c, int freq) {
        super(c, freq);
    }


 
 
    public void huffm(Node root, String n) {
          if (root.left.equals(null))
                   huffm(root.left, n + "0");
          
                  if(root.right.equals(null))
                      huffm(root.right, n + "1"); 
                  
          
 
            System.out.println(" Result" + root.c + ":" + n); 

        
        
    } 
   
    
    
    public class Node   {
  
    Node left; 
   Node right;
     int data; 
     char c; 
    public Node(int data){
          this.data = data;
     }
     
    }
}