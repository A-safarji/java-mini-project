/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arry;

import java.util.Arrays;

/**
 *
 * @author A.Safari
 */
public class Arry {

             //  public static void modifyElement( int x[] ){
                 //  for (int i = 0; i < x.length; i++) {
                   //    x[i]+=2;
  //                 }
 //{
    //    } 
              // }
    
    public static void displayArray( int[] array, String description )
   {
      System.out.printf( "\n%s: ", description );
      for ( int value : array ) {
          System.out.printf( "%d ", value );
      }
   } // end method displayArray
 // end class ArrayManipulation
     
    public static void main(String[] args) {
       /*
final int ARRAY_LENGTH = 10; // declare constant
int[] array = new int[ ARRAY_LENGTH ]; // create array

// calculate value for each array element
for ( int counter = 0; counter < array.length; counter++ ) {
    array[ counter ] = 2 + 2 * counter;
        }

 System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
      // output each array element's value
     for ( int counter = 0; counter < array.length; counter++ ) {
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
        }
   } // end main
} // end class InitArray
*/
     /*
        
       
       
      
Random randomNumbers = new Random(); // random number generator
int[] frequency = new int[ 7 ]; // array of frequency counters
// roll die 6,000,000 times; use die value as frequency index
      for ( int roll = 1; roll <= 6; roll++ ) {
          ++frequency[ 1+ randomNumbers.nextInt( 6 ) ];
}
      System.out.printf( "%s%10s\n", "Face", "Frequency" );
      // output each array element's value
      for ( int face = 1; face < frequency.length; face++ ) {
          System.out.printf( "%4d%10d\n", face, frequency[ face ] );
}
   } // end main
} // end class RollDie
       */
       /* int array[] = {6,8,7,0,8,0};
        
               modifyElement( array ); // pass array reference
        for (int i : array) {
            System.out.println(i);
        }
   */
      /* int c[] = {1,3,9,5,6,0};  //// it has to be sort to excute well
      
      int v =  Arrays.binarySearch(c,1);
        System.out.println(v); 
    /*
       
      */
       

              int[] filledIntArray = new int[ 10 ];
          Arrays.fill( filledIntArray, 7 );
         
         displayArray( filledIntArray, "filledIntArray" );
       
         
         int x=5;
         int y=8;
          int result= x+y;
          System.out.println(x*y);
         
         
        }
}


