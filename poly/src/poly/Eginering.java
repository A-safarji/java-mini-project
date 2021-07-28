/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author A.Safarji
 */
public class Eginering extends Stuff {
    private int exprince;
    private double salary;

    public Eginering(int exprince, double salary, String stuffcode, String stufname) {
        super(stuffcode, stufname);
        this.exprince = exprince;
        this.salary = salary;
    }
      
    public Eginering(String stuffcode, String stufname) {
        super(stuffcode, stufname);
    }

    
    @Override /// means replace
    public double Calsalary() {
       if (this.exprince > 4) 
           return (this.salary)+(this.salary*0.5);
       else if (this.exprince>2)
                return this.salary+(this.salary*0.5);
                else                 
                            return salary;
    }


    public int getExprince() {
        return exprince;
    }

    public void setExprince(int exprince) {
        this.exprince = exprince;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

  
     @Override
    public String toString() {
        return "Eginering{"+super.toString()+"" + "exprince=" + exprince + ", salary=" + salary +"total salary="+Calsalary()+'}';
    }
    

   
}
