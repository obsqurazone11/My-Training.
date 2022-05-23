package employee.encapsulation;

public class FullTimeEmployee extends Employee
{
	public int fullsalary;
	final int TOTALHOUR=8;
	public void calculate()
	{
		super.Emp();
		fullsalary=paymentperhour*TOTALHOUR;
		System.out.println("Full Salary :" +fullsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FullTimeEmployee ob=new FullTimeEmployee();
ob.calculate();
	}

}
