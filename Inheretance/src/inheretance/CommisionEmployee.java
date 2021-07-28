/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheretance;


public class CommisionEmployee {
    
    protected String name;
    protected String id;
    protected double grossSale;
    protected double rate;

    public CommisionEmployee(String name, String id, double grossSale, double rate) {
        this.name = name;
        this.id = id;
        this.grossSale = grossSale;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGroddSale() {
        return grossSale;
    }

    public void setGroddSale(double grossSale) {
        if (grossSale>0) {
            this.grossSale= grossSale;
        }else {
            this.grossSale=0;
        }    
        
        this.grossSale = grossSale;
        
    }

    public double getRate() {
       return rate;
    }

    public double setRate(double rate) {
         if(rate>0) {
            this.rate=rate;
        }
         else {
             this.rate=0;
         }
          return rate;  
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" + "name=" + name + ", id=" + id + ", grossSale=" + grossSale + ", rate=" + rate +era '}';
    
         
        }
   

    public double earnings(){
        return grossSale*rate;
    }
}
