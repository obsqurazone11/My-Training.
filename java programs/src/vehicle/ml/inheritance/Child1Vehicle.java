package vehicle.ml.inheritance;

import java.util.Scanner;

public class Child1Vehicle extends ParentVehicle
{
	String name;
	int seat;
	String model;
	Scanner sc=new Scanner(System.in);
	public void bus()
	{
		super.car();
		System.out.println("Enter the vehicle name");
		name=sc.nextLine();
		System.out.println("Enter the Number of Seats");
		seat=sc.nextInt();
		System.out.println("enter the model name ");
		model=sc.nextLine();
	}
	public void display()
	{
		super.disp();
		System.out.println("Vehicle Name :" +name);
		System.out.println("Number of Seats :" +seat);
	}
}
