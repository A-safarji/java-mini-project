
package pro1;
import java.util.Scanner;

public class Min {
     public static int shortest_Path (int[][]paths, int m, int n)
  {
      
      
    // base case
    if (n == 0 || m == 0)
      {
	return Integer.MAX_VALUE;
      }

    // if we are in the first cell `(0, 0)`
    if (m == 1 && n == 1)
      {
	return paths[0][0];
      }

    // include the current cell's cost in the path and recur to find the minimum
    // of the path from the adjacent left cell and adjacent top cell.
    return Integer.min (shortest_Path (paths, m - 1, n),
			shortest_Path (paths, m, n - 1)) + paths[m - 1][n - 1];
  }




     String print(){
      
     
         return "Welcome to project 1";
              
   }


}


