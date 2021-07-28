/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author safarji
 */
public class JavaApplication41 {

  


    public static void main(String[] args) {
        
                Random rand = new Random();

        

        Scanner console = new Scanner(System.in);

        System.out.println("Enter row");
        int n = console.nextInt();

        System.out.println("Enter column");
        int y = console.nextInt();

        int[][] array = new int[n][y];
        //array[n][y] = randomnumber;
        //
        //int k;
        int count=0;
        int step=0;
        int total=0;
        boolean going_right = true;
        for(int i=0;i<array.length;i++){

         for(int k=0;k<array[i].length;k++){
              array[i][k]=rand.nextInt()%2+1;
               if (array[i][k] == 0)
            {
               step++;
            }
               if (array[i][k] == 2)
            {
               step++;
            }
           
             // System.out.print(array[i][k]);
         System.out.print(array[i][k]+ "  ");
         count+= array[i][k];
         total+=count;

         }
         System.out.println("profurmance\t"+count);
         /// separate rows
        }
        
  System.out.println("step to clean dirt\n"+step); 
  System.out.println("total profurmance\n "+total); 
  System.out.println("The number 0 and 2 means not"
          + " clean and the step cleaned it"); 
  
           }
        }
