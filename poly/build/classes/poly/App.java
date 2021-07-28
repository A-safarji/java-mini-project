/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author toby
 */
public class App {
    public static void main(String[] args) {
        
        Invoice inv = new Invoice ("345","slim",2,150);
        System.out.println(inv);
        System.out.println("amoutn du:"+ inv.getpayment());
    }
    
}
