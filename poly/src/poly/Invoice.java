/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author toby
 */
public class Invoice implements Pay {
    private String partnumber;
    private String partdesc;
   private int qut;
    private double price; 

    public Invoice(String partnumber, String partdesc, int qut, double price) {
        this.partnumber = partnumber;
        this.partdesc = partdesc;
        this.qut=qut;
        this.price = price;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public String getPartdesc() {
        return partdesc;
    }

    public void setPartdesc(String partdesc) {
        this.partdesc = partdesc;
    }

    public int getQut() {
        return qut;
    }

    public void setQut(int qut) {
        this.qut = qut;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice{" + "partnumber=" + partnumber + ", partdesc=" + partdesc + ", price=" + price + '}';
    }

    @Override
    public double getpayment() {
       return price*qut;
    }
           
}
                 