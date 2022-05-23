package singleinheritance;

import java.util.Scanner;

public class Student {
String name;
int rollno;
Scanner s=new Scanner(System.in);
public void get()
{
	System.out.println("Enter the Name");
	name=s.nextLine();
	System.out.println("enter the rollno");
	rollno=s.nextInt();
}
}
