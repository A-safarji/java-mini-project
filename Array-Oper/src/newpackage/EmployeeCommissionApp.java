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

    
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class EmployeeCommissionApp {
    
	public static void main(String[] args) {
		ArrayList<BasePlusCommissionEmployee> list = new ArrayList<>();
		
		while(true){
		String name = JOptionPane.showInputDialog("Enter your name:");
		String id = JOptionPane.showInputDialog("Enter your id:");
		double grossSales = Double.parseDouble(JOptionPane.showInputDialog("Enter your grossSales"));
		double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter your rate"));
		double baiscSalery = Double.parseDouble(JOptionPane.showInputDialog("Enter your baiscSalery"));
		
		
		BasePlusCommissionEmployee user = new BasePlusCommissionEmployee(name,id,grossSales,rate,baiscSalery);
		JOptionPane.showMessageDialog(null, user);	
		list.add(user);
		String repeat = JOptionPane.showInputDialog("would u like to add anouther user(yes/no)?");
		
		if(repeat.toLowerCase().equals("no"));
		break;
		}
	for(BasePlusCommissionEmployee as : list){
		JOptionPane.showMessageDialog(null, as);
	}
	
}
}

