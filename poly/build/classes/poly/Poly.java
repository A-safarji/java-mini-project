/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

import java.util.Scanner;

/**
 *
 * @author toby
 */
public class Poly {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter staff code");
        String stuffcode = input.nextLine();
        System.out.println("Enter stuff name");
        String stufname = input.nextLine();
        System.out.println("Enter stuff salary");
        double salary=input.nextDouble();
        System.out.println("Enter stuff experince");
        int exprince=input.nextInt();
        
        
        Eginering eng= new Eginering(exprince,salary,stuffcode,stufname);
        
        
        System.out.println(eng);
        input.close();
        
        
    }
    
}
