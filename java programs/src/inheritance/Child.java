package inheritance;

public class Child extends Parent {
public void print()
{
	System.out.println("Sum of two numbers :" +sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ob=new Child();
ob.display(5,6);
ob.print();
	}

}
