package employee.encapsulation;

import java.util.Scanner;

public abstract class Employee {
	public String name;
	public int paymentperhour;
	Scanner sc=new Scanner(System.in);
	public void Emp()
	{
		
		System.out.println("Enter the Employee Name :");
		name=sc.nextLine();
		System.out.println("enter the payment per hour :");
		paymentperhour=sc.nextInt();
	}
	public abstract void calculate();

}
