package cricket.hi.inheritance;

import java.util.Scanner;

public class ParentCricket {
	String name;
	int runs,innings;
	int notout;
	float batavg;
	Scanner s=new Scanner(System.in);
	public void test()
	{
		
		System.out.println("Enter the player name,no of innings and total runs :");
		name=s.nextLine();
		innings=s.nextInt();
		runs=s.nextInt();
	}
public void check()
{
	System.out.println("Enter the no of times not out and bat average");
	notout=s.nextInt();
	batavg=s.nextFloat();
}
}
