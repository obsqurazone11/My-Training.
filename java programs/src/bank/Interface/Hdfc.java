package bank.Interface;

import java.util.Scanner;

public class Hdfc implements RBI,RBIInterface1
{
	public int damt;
	public int n;
	public double totamt;
	Scanner sc=new Scanner(System.in);
	public void recurringdeposit()
	{
		System.out.println("Customer Deposited amount");
		damt=sc.nextInt();
		System.out.println("Enter the Duration");
		n=sc.nextInt();
		}
	public void finalamount()
	{
		totamt=damt+(damt*n*INTRESTRATE);
		System.out.println("Atlast the customer's total amount :" +totamt);
	}
	public static void main(String[] args)
	{
		Hdfc ob=new Hdfc();
		ob.recurringdeposit();
		ob.finalamount();
	}
}
