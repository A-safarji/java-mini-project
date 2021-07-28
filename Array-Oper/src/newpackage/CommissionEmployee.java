/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author toby
 */
public class CommissionEmployee {
   
	protected String name;
	protected String id;
	protected double grossSales;
	protected double rate;
	public CommissionEmployee(String name, String id, double grossSales, double rate) {
		
		this.name = name;
		this.id = id;
		this.grossSales = grossSales;
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
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		if(grossSales>0)         // input validation 
		this.grossSales = grossSales;
		else 
			this.grossSales=0;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		if(rate>0)				// input validation 
		this.rate = rate;
		else 
		this.rate=0;
	}
	public double earning(){
		return this.rate * this.grossSales;
	}

        @Override
	public String toString() {
		return "name=" + name + " id=" + id + " grossSales=" + grossSales + " rate=" + rate;
	}
	

		
}


