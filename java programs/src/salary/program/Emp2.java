package salary.program;

public class Emp2 extends Emp1
{
	public void display()
	{
		double total;
		total=basic+hra-pf-deduc+bonus;
		System.out.println("Total Salary :" +total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp2 ob=new Emp2();
ob.get();
ob.read();
ob.display();
	}

}
