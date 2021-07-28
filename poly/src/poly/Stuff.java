/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author  A.Safarji
 */
public abstract class Stuff {
    protected String stuffcode;
    protected String stufname;

    public Stuff(String stuffcode, String stufname) {
        this.stuffcode = stuffcode;
        this.stufname = stufname;
    }

    public String getStuffcode() {
        return stuffcode;
    }

    public void setStuffcode(String stuffcode) {
        this.stuffcode = stuffcode;
    }

    public String getStufname() {
        return stufname;
    }

    public void setStufname(String stufname) {
        this.stufname = stufname;
    }

    public abstract double Calsalary();
    
  
    
    @Override
    public String toString() {
        return "Stuff{" + "stuffcode=" + stuffcode + ", stufname=" + stufname + '}';
    }
    
    
    
    
}
