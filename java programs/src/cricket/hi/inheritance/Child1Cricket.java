package cricket.hi.inheritance;

public class Child1Cricket extends ParentCricket
{
	public void display()
	{
		System.out.println("Name :" +name);
		System.out.println("No of Innings :" +innings);
		System.out.println("Total Runs :" +runs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1Cricket ob=new Child1Cricket();
		ob.test();
		ob.display();

	}

}
