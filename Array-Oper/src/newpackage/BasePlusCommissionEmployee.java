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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
	private double baiscSalary;
	
	public BasePlusCommissionEmployee(String name, String id, double grossSales, double rate,double baiscsalary){
		super(name,  id, grossSales,  rate);
		this.baiscSalary=baiscsalary;
	}

	public double getBaiscSalary() {
		return baiscSalary;
	}

	public void setBaiscSalary(double baiscSalary) {
		if(baiscSalary>0)
		this.baiscSalary = baiscSalary;
		else 
			this.baiscSalary=0;
	}
	public double earning(){
		return baiscSalary+super.earning();
	}

	@Override
	public String toString() {
		return "baiscSalary=" + baiscSalary+""+super.toString()+"earning="+earning();
	}
	
}


