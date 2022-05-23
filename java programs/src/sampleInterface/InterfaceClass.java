package sampleInterface;

public class InterfaceClass implements InterfaceMethod3
{
	public void sayhello()
	{
		System.out.println("HELLO");
	}
	public void display()
	{
		System.out.println("WELCOME");
		System.out.println("Max value :" +MAX);
	}
	public int print(int num)
	{
		num+=MAX;
		return num;
	}

	public static void main(String[] args) {
		InterfaceClass ob=new InterfaceClass();
		ob.sayhello();
		ob.display();
		System.out.println("number :" +ob.print(20));
		ob.disp();
		// TODO Auto-generated method stub

	}
	public void disp()
	{
		System.out.println("This is from Interface3");
	}

}
