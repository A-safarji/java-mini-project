/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabArr;

/**
 *
 * @author toby
 */
import java.util.Scanner;

public class ArrayOperTest {

	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	
	System.out.println("enter the num of shop");	
		int size = inp.nextInt();
		
		int[] profits = new int[size];
		
	int sum = ArrayOper.sumArrays(profits);
	int max = ArrayOper.maxValue(profits);
		int min = ArrayOper.minValue(profits);
		ArrayOper.readArray(profits);
		ArrayOper.displayArray(profits);
	
		System.out.println("total profits = "+ArrayOper.sumArrays(profits));
		System.out.println("avg = "+ArrayOper.avgArray(sum, size));
		System.out.println("max value = "+max);
		System.out.println("min vlaue = "+min);
	}
	
}
