/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPracticLo;
import java.util.*;
import javax.swing.JOptionPane;
  

/**
 *
 * @author A.Safarji
 */
public class Certifi {
 public static void drawLegs(){
        System.out.println("     ||     ||      ");
        System.out.println("     ||     ||      ");
        System.out.println("    (||)   (||)     ");
    }
           
            
    public static void main(String[] args) {
        // TODO code application logic here
     //   Test vb = new Test();
       // Test vn=new Test();
        //vb.ids();
        //
        //vn.ids();
      //  String v = new String ("jva");
      // String t = new String (v);
         //    System.out.println(t);
       //String word="javan";
       //String word2= word;
       
      //  System.out.println(word2);
        
        
       // ArrayList<Integer> obj = new ArrayList<>(); 
      //  }
  //int c [] = new int[10];
   
   //int c[]={9,3,4,5};
  //int v[]={9,3,4,5};
  //int b [] = new int [c.length];//copy arry frist step
 // System.arraycopy(c, 0, b, 0, c.length);  // copy array second
       // boolean e = Arrays.equals(b, c);
        
        //System.out.println(e);
 //Arrays.sort(c);
 //Arrays.fill(c, 0);
       // boolean b =Arrays.equals(v, c);
        //System.out.println(b);
 //for (int i : c) {
       //   System.out.println(i);
        
  //}
  // int lo=Arrays.binarySearch(c, 7);
       
           // if (lo>=0) {
              //  System.out.printf("the location is at indx %d\n",lo);
                
            //}else {
          //      System.out.println("not found\n");
        //  }
        /*
        System.out.println("   /\\         /\\   ");
        System.out.println("  /  \\_______/  \\  ");
        System.out.println(" /               \\ ");
        System.out.println("(  /\\         /\\  )");
        System.out.println("====     V     ====");
        System.out.println("======(__|__)======");
        System.out.println("  (             )  ");
        System.out.println("   (___________)   ");
            drawLegs();
            
      double m=100;
      double t=121;
      double w=117;
      double dailyAverage = 0;
      double monthlyAverage=0;
      double monthlyProfit= 0.18;
            dailyAverage+= (m+t+w)/3;
            monthlyAverage+=  dailyAverage*30;
            monthlyProfit*=monthlyAverage;
            
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        
        
        String custName = "Alex";
        String itemDesc = "Shirts";
    
    
     
        String message = custName+" wants to purchase " +2+ " " + itemDesc;
        double price=10;
        double tax=.50;
     
        int qunitty=2;
        
        double totalprice =(tax + price)*qunitty ;
           
        
        
        
        // Declare and assign a calculated totalPrice
        
        
        // Modify message to include quantity 
        
        System.out.println(message);
        
        System.out.println("The total pric =" + totalprice);
        
       
       
        
      //  float v = (float) 5.7;
        
        */
        
        /*
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirt="15";
        String tnax= "0.05";
        String gibb="887ds7nds87dsfs";
         int z = Integer.parseInt(shirt);
        double y= Double.parseDouble(tnax);
        int a= Integer.parseInt(gibb);
        
        System.out.println(z * y);
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
      
      */
      
      
      
      
      
      
        /*
        int x = 55555;
        long y = 66666;
        long v= x*y;
        System.out.println(v);
        */
        
        
        
        
        
        /*
        String cutsName= "TOpy";
        String itemDesc= "Shirt";
        String messsage = cutsName +" Eantd to buy a "+ itemDesc;
        System.out.println(messsage);
        String  nn= "bebe"+4;
        System.out.println(nn);
        
        */
        
            
        
        /*
        
          //Create a JOptionPane.
        //Store the input as a String and print it.
    // String v = JOptionPane.showInputDialog("tyep your word");
       int z = Integer.parseInt(JOptionPane.showInputDialog("tyep your word"))+1;
        System.out.println(z);
       
        //int s = Integer.parseInt(v);
        //s++;
      //  System.out.println(s);
        
        //Parse the input as an int.
        //Print its value +1
        String u = JOptionPane.showInputDialog(null, "this", "thiscc",2);
        */
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        
        
      JOptionPane.showMessageDialog(null,"There's no input here, just a message","Title",0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");
      //  int input2 = Integer.parseInt(input1);
      //  System.out.println(input2);
        
        String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[2]);
                
        
        
        }

        
    }
    

