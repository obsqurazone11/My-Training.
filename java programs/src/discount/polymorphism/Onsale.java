package discount.polymorphism;

import java.util.Scanner;

public class Onsale {
	int total;
	double discount,finalval;
	Scanner s=new Scanner(System.in);
	public void get()
	{
		System.out.println("Enter the total amount for clothes to be purchased ");
		total=s.nextInt();
	}
public void display()
{
	System.out.println("OnSale Discount :");
	discount=total*0.4;
	System.out.println("Discount price : " +discount);
	finalval=total-discount;
}
}
