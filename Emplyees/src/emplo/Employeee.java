/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emplo;

/**
 *
 * @author A.Safarji
 */
public class Employeee {
   private String frist;
    private String last;
    private static int count;

    public Employeee(String frist, String last) {
        this.frist = frist;
        this.last = last;
        count++;
    }


    public void setFrist(String frist) {
        this.frist = frist;
    }

    

    public String getFrist() {
        return frist;
    }

    public String getLast() {
        return last;
    }

    public static int getCount() {
        return count;
    }
    
    
}
