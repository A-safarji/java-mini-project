/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author A.Safarji
 */
public class Employeetest {

  
    public static void main(String[] args) {
        
    
   
            Scanner input = new Scanner(System.in);
        char loop ='0' ;
  
       do{
            
               String frist = JOptionPane.showInputDialog("Ahlam Enter your last name");
       
       System.out.println(frist);
        
        String last = JOptionPane.showInputDialog("Enter your last name");
        System.out.println(last);
        
        Employeee bb = new Employeee(frist,last);  
       
        System.out.println("Namber of employee =" +Employeee.getCount());
           System.out.println("NAme of new employy"+bb.getFrist()+"  " +bb.getLast());
           try{
               
           
            loop = JOptionPane.showInputDialog("U want to add Y/N").toUpperCase().charAt(0);
           }catch(Exception ex){
               System.out.println(ex);
           }
           
          
               //.toUpperCase(); 
                 //    System.out.println(loop);   
                // System.out.println(" u want to add Y or N");
         //  loop = input.nextLine().toUpperCase().charAt(0);
              // loop=loop.toUpperCase().concat("Y");
// loop= input.nextLine();
//System.out.println(loop);
       } while(loop=='Y');
       
    
  System.out.println("Thanks for using bye");      
   
}
}