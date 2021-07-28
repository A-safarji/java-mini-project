/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air;

/**
 *
 * @author a.safarji
 */
import java.util.Scanner;

public class Airline 
{
    
    boolean[] seating = new boolean[11]; /* create 10 seat numbers (array[0] will not be used). Empty seat indicated by false*/
    Scanner input = new Scanner(System.in);

    public void start()
    {       
        while ( true )
        {
            makeReservation();
        }   
    }

    public void makeReservation()
    {
        System.out.println("Please type 1 for First Class or 2 for Economy: ");
        int section = input.nextInt();
        if ( section == 1 )
        {
            firstClassSeat();
        }
        else
        {
            economySeat();
        }
    }

    public void firstClassSeat() // assign a first class seat
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seating[count] == false )  // if false, then a seat is available for assignment
            {
                seating[count] = true;  // assign seat
                System.out.printf("First Class. Seat# %d\n", count);
                break;
            }
            else if ( seating[5] == true ) // If seating[5] is true then first class is fully booked
            {
                if ( seating[10] == true) // If seating[10] is true then economy (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else // ask passenger if they would like an economy ticket instead
                {
                    System.out.println("First Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        economySeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }   

    public void economySeat() // assign an economy seat
    {
        for ( int count = 6; count <= 10; count++ )
        {
            if ( seating[count] == false ) // if false, then a seat is available for assignment
            {
                seating[count] = true; // assign seat
                System.out.printf("Economy. Seat# %d\n", count);
                break;
            }
            else if ( seating[10] == true ) // If seating[10] is true then economy is fully booked
            {
                if ( seating[5] == true) // If seating[5] is true then first class (and therefore whole flight) is fully booked
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }
                else // ask if passenger would like a first class ticket instead
                {
                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        firstClassSeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }
}  