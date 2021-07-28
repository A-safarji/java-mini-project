/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top;

/**
 *
 * @author toby
 */
public class Top {

    int length;

    int breadth;

    //declare constructor to initialize length and breadth of rectangle
    Top() {

        length = 5;
        breadth = 6;

    }

    Top(int len, int bre) {

        length = len;
        breadth = bre;

    }
    //declare method to calculate area of rectangle

    int area() {

        int rectArea = length * breadth;

        return rectArea;

    }

    /* private static  double pi = 3.14; 
 
public static double area(int radius){
        return pi * Math.pow(radius, 2);
        }

    public static double cirum(int radius){
        return 2 * pi * radius;
            }
     */ public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        //  Top b = new Top();
        //   System.out.println(b.area());

        //enum // for( Name of Cinstroctor
        for (Season d : Season.values()) { // smae new object pattern Season d(any letter) : (new) Seasn.values
            System.out.println(d);
        }

        // Scanner input = new Scanner(System.in);
        //   String message = JOptionPane.showInputDialog(null, "text");
//JOptionPane.showMessageDialog(null, message);
        //String ans=JOptionPane.showInputDialog("Give some input");
//JOptionPane.showMessageDialog(null, ans);
        /*
int radius = Integer.parseInt(JOptionPane.showInputDialog ("Give the radius of circle"));
                     System.out.printf("Area of the circle = %.2f\n" , area(radius));
System.out.printf("Circumference of the circel = %.2f\n", cirum(radius));
        
         */
 /* System.out.println("Enter frist number=");
       int num1= input.nextInt();
        System.out.println("Enter second number:");
        int num2=input.nextInt();
        System.out.println("Enter third number:");
       double num= input.nextDouble();
       
      double avg= ( num1 + num2 + num)/3;
      System.out.printf("%s", avg);
         */
 /* System.out.println("Enter radius of the circle::"); 
        int r= input.nextInt();
       double A =(r*r)*3.14*2;
        System.out.println("Area=" +A);
 double c=2*3.14*r;
             System.out.println("Circumference="+c);
            double D=2*r;
       System.out.println("Diamter="+D);
        
         */
 /* System.out.println("ENter 1s number =");
                int x = input.nextInt();
                 System.out.println("ENter 1s number =");
                int y = input.nextInt();
                System.out.println("Menu");
          
                    
        System.out.println("1- Addition");
        System.out.println("2- substraction");
        System.out.println("3- mulitiplication");
        System.out.println("4- Divid");
        System.out.println("5- Exit");
        System.out.println("Enter choice of opration= ");
        int c = input.nextInt();
        
        if (c==1) {
           int add= x+y;
            System.out.println("Addtion of two numbers="+add);
        }
        
        if (c==2) {
            int su=x-y;
            System.out.println("subtraction of two numbers="+su);
            
        }
        if (c==3) {
            int cv= x*y;
            System.out.println("Mulitcation of two numbers="+cv);
        }
             if(c==4)  {
                float ty=x/y;
                 System.out.println("Division of two numbers="+ty);
             } 
             if(c==5)
                 System.out.println("Thanks for using ");
         */
 /*    int c=1;
               System.out.println("Enter a value for n= ");
               int x = input.nextInt();
               System.out.println("Odd Intergers from 1 to "+x);
               for (int i = 1; i < x; i++) {
                   
                             if (i % 2!=0) {
                                 System.out.printf("%d\n",i);
                                 
                             }
               c=c*i;
                  
               }
        
              System.out.println("all odd="+c);
                   
         */
 /*        
                   int max = 0;
    try{
             System.out.printf("Enter how many numbers = ");
              int n = input.nextInt();

                 System.out.print("Enter first no = ");
              int a = input.nextInt();
                      max = a;
        System.out.println("Enter remaining different nos");
        for(int i = 0; i < n - 1; i++){
            a = input.nextInt();
            if(a > max) {
                max = a;
            }
         }
    }
        catch(Exception ex){
                     System.out.println("Invalid Input");
                 }
                 System.out.println("Maximum = " + max);
         */
        // System.out.println("v="+bb(3,5));
        ///  }
        // public static int bb(int a, int b ){
        // return a+b;
        /*
      int min = 0;
         int max= 0;
    try{
             System.out.printf("Enter how many numbers = ");
              int n = input.nextInt();

                 System.out.print("Enter first no = ");
              int a = input.nextInt();
                      min = a;
                      max=a;
        System.out.println("Enter remaining different nos");
        for(int i = 0; i < n-1 ; i++){
            a = input.nextInt();
            if(a > max) {
                max = a;
            }if(a < min) {
                min = a;
            }
         }
    }
        catch(Exception ex){
                     System.out.println("Invalid Input");
                 }
                 System.out.println(" nabeel Maximum = " + max);
                 System.out.println("nabeel Min="+min);
         */
 /* for(int i = 1; i < 10; i += 6){
for(int j = 1; j < 20; j += 5){
		if (j == 6)
			continue;
		if (j == 16)
			break;
		System.out.printf("%d  %d\n", i, j);
	}
}

         */
 /* int a = 1;
        int b = 2;
        int c;
        int d;
        c = --b;
        d = a--;
        c--;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
         */
    }
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}
