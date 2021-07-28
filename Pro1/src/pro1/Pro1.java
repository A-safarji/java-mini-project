
package pro1;
import java.util.Scanner;

public class Pro1 {

   
    public static void main(String[] args) {
       Min b = new Min();
      
      String v = b.print();
      
   System.out.println(v);
   
   
   System.out.print ("Enter the dimensions of the board:");
    Scanner sc = new Scanner (System.in);
    int rows = sc.nextInt ();
    int columns = sc.nextInt ();

    System.out.println ("Enter the values of the secures: ");

    int Board[][] = new int[rows][columns];


    for (int i = 0; i < rows; i++)
      {
	for (int j = 0; j < columns; j++)
	  {
	    Board[i][j] = sc.nextInt ();
            
            
            
	  }
         
      }
  
    System.out.print ("The minimum total is "
		      + b.shortest_Path (Board, Board.length, Board[0].length) +"\n");
    }
    
}
