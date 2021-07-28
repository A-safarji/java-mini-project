package sa.edu.yuc;

import java.util.Scanner;

public class Account implements Comparable<Account>{
	private int id;
	private String name;
	private double balance;
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Dear " + name + ", Your Account # " + id + " Has Amount SR " + balance + ".\n";
	}
	public static Account getAccount() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter Account Information :: ");
		System.out.print("Id: ");
		int id = input.nextInt();
		input.nextLine();
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Balance: ");
		double balance = input.nextDouble();
		System.out.println();
		return new Account(id, name, balance);
	}
	
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
}