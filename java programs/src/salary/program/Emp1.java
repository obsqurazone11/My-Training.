package salary.program;

public class Emp1 extends Employee
{
	double hra,pf;
	public void read()
	{
		hra=basic*0.05;
		System.out.println("HRA :" +hra);
		pf=basic*0.2;
		System.out.println("PF :" +pf);
	}

}
