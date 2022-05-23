package hierarchical.inheritance;

public class Child2 extends Parent 
{
	public void say()
	{
		System.out.println("World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child2 ob=new Child2();
ob.say();
ob.display();
	}

}
