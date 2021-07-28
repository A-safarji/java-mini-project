/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medterm3710933;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author toby
 */
public class MovieTest {

    
    public static void main(String[] args) {
  
        
       Movie m = new Movie("Avatar",5,20.30);
       Movie m1 = new Movie("Ironman",4,18.65);
      
       
        System.out.println(m.toString());
         System.out.println(m1.toString());
        
     //Scanner input= new Scanner(System.in);
         String title= JOptionPane.showInputDialog("Enter your movie title yahya ");
         //System.out.println(title);
        
       int rating = Integer.parseInt(JOptionPane.showInputDialog("Enter Rating number"));
        //System.out.println(rating);
         
          double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price number"));
          //System.out.println(price);
           Movie m3 = new Movie(title,rating,price);
           System.out.println(m3.toString());
           
        System.out.println("Info for all movies= "+m3.rent());
         System.out.println("Number of all avalible movies= "+m3.Return());
         
         System.out.println("Thanks yahya for using my app");
         
       
       
        
        
        
    }
    
}
