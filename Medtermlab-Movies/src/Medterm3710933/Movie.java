/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Medterm3710933;



/**
 *
 * @author A.Safarji
 */
public class Movie {

    private  String titl;
    private  int rating;
    private   double price;
    public static int numrented;
    public static int numallmovies;

    public Movie(String titl, int rating, double price) {
       
        this.titl = titl;
        this.rating = rating;
        this.price = price;
        numallmovies++;// counter
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    

    public  int rent( ) {
        
        ++numrented;
        return numrented;
    }

    public  int Return() {
        
        --numallmovies;
        if (numallmovies>0) {
            return numallmovies;
        }
        else {
            return 0;
        }
        

    }

    public int getRating() {
        return rating;
    }

    

    
    @Override
    public String toString() {
        
       return String.format("Movie Name=" + titl + ", Rate=" + rating + ", Price=" + price );
        
    }
    
}
