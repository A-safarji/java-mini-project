/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;


public class ComplexImpl implements Complex {
    private double a;
    private double  b;
 public ComplexImpl (double a, double b){
     this.a=a;
     
     this.b= b;
     
     
 }
         
 
 
    @Override
    public double GetRe() {
        return a;
        
    }

    @Override
    public double GetIm() {
        
        return b;
    }

    @Override
    public Complex mu(Complex c) {
        double re= this.a * c.GetRe() - this.b* c.GetIm();
        double im= this.a * c.GetIm() + this.b * c.GetRe();
        
        Complex result= new ComplexImpl (re,im);
        return result;
        
    }

    @Override
    public Complex de(Complex c) {
        double re= this.a * this.a;
        double im= this.b * this.b;
        double root= re + im;
        
        
        Complex result= new ComplexImpl (this.a / root,this.b / root);
        return result;
        
    }

    @Override
    public Complex dev(Complex c) {
        Complex m= this;
        return m.mu(c.de(c));
    }

    @Override
    public String toString (){
        return a + " +"+b+"i";
    }
   
    
   
}