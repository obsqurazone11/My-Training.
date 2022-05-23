package salary.program;
import java.util.*;
public class Employee 
{
	double basic,deduc,bonus;
public void get()
{
	Scanner s=new Scanner(System.in);
	System.out.println("basic pay :");
	basic=s.nextDouble();
	System.out.println("deduction :");
	deduc=s.nextDouble();
	System.out.println("bonus :");
	bonus=s.nextDouble();
	System.out.println("Employee Salary Slip :");
	System.out.println("Basic Pay : " +basic);
	System.out.println("Deduction :" +deduc);
	System.out.println("Bonus :" +bonus);
}
}
