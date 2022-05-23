package employee.encapsulation;

public class Contractor extends Employee
{
	//public String name;
	//public int paymentperhour;
	private int workinghours;
	private int salary;
	public void Contract()
	{
		super.Emp();
		//super.name=name;
		//super.paymentperhour=paymentperhour;
		System.out.println("Enter the working hours");
		workinghours=sc.nextInt();	
	}
	public void calculate()
	{
		salary=paymentperhour*workinghours;
	System.out.println("salary :" +salary);
	}
	public static void main(String[] args)
	{
		Contractor ob=new Contractor();
	ob.Contract();
		ob.calculate();
	}

}
