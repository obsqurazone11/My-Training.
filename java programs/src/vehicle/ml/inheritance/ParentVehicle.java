package vehicle.ml.inheritance;

import java.util.Scanner;

public class ParentVehicle {
	String name;
	int seat;
	Scanner sc=new Scanner(System.in);
	public void car()
	{
		System.out.println("Enter the vehicle name");
		name=sc.nextLine();
		System.out.println("Enter the Number of Seats");
		seat=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("Vehicle Name :" +name);
		System.out.println("Number of Seats :" +seat);
	}
}
