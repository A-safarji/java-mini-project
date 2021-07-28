/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabArr;

import java.util.Scanner;

/**
 *
 * @author toby
 */
public class ArrayOper {
  static Scanner inp = new Scanner(System.in); 
	
	public static void readArray(int profits[]) {
		
		int i;
		for(i=0;i<profits.length;i++) {
			System.out.printf("Enter elemnts profits , [%d]\n",i);
			profits[i]=inp.nextInt();
		}	
	}
	
	public static void displayArray(int []profits) {
		
		for(int i:profits) {
			System.out.println(i);
		}
	}
	
	public static int sumArrays(int []profits) {
		int sum=0;
		for(int i:profits) {
			sum+=i;
		}
		return sum;
	}
	public static double avgArray(int sum,int size) {
		
		double avg = sum/size;
		return avg;
	}
	
	public static int maxValue(int []profits) {
		int max = profits[0];
		for(int value:profits) {
			
			if(value>max) {
                            max=value;
                        }
		}
		return max;
	}
	public static int minValue(int []profits) {
		int min = profits[0];
		for(int value:profits) {
			
			if(value<min) {
                            min=value;
                        }
		}
		return min;
	
	}
}
	