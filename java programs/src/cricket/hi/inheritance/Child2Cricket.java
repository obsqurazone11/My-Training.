package cricket.hi.inheritance;

public class Child2Cricket extends ParentCricket
{
	public void print()
	{
		System.out.println("Name :" +name);
		System.out.println("No of Innings :" +innings);
		System.out.println("Total Runs :" +runs);
		System.out.println("No of times not out :" +notout);
		System.out.println("Bat average :" +batavg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2Cricket ob=new Child2Cricket();
		ob.test();
		ob.check();
		ob.print();

	}

}
