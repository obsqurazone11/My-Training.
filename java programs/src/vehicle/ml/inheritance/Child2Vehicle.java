package vehicle.ml.inheritance;

import java.util.Scanner;

public class Child2Vehicle extends Child1Vehicle
{
	String name;
	int seat;
	
	Scanner sc=new Scanner(System.in);
	public void van()
	{
		super.bus();
		System.out.println("Enter the vehicle name");
		name=sc.nextLine();
		System.out.println("Enter the Number of Seats");
		seat=sc.nextInt();
	
	}
	public void print()
	{
		super.display();
		System.out.println("Vehicle Name :" +name);
		System.out.println("Number of Seats :" +seat);
	System.out.println("Model of the car :" +super.model);
	}
	public static void main(String[] args) {
		Child2Vehicle ob=new Child2Vehicle();
		ob.van();
		ob.print();
		
		// TODO Auto-generated method stub

	}

}
