
package math206;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {


     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

       
        System.err.println("How many numbers do you want to enter?");
        int num = input.nextInt();

        int array[] = new int[num];

        System.err.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }

   
        System.out.println("These are the numbers you have entered.");
        System.out.println(Arrays.toString(array));

         
         QuickSort n  = new QuickSort();
        
        n.quickSort(array, 0, array.length-1);
       
        System.err.println(Arrays.toString(array));
         System.err.println("Number of array: "+ array.length);
                 
    }
 
    public  void quickSort(int[] A, int l, int r){
 
        int s = partition(A, l, r);
 
        if(s-1>l) {
            quickSort(A, l, s - 1);
        }
        if(s+1<r) {
            quickSort(A, s + 1, r);
        }
    }
 
    public static int partition(int[] A, int low, int high){
        int pivot = A[high];
 
        for(int i=low; i<high; i++){
            if(A[i]<pivot){
                int temp= A[low];
                A[low]=A[i];
                A[i]=temp;
                low++;
            }
        }
 
        int temp = A[low];
        A[low] = pivot;
        A[high] = temp;
 
        return low;
    }
}