package superexample;

public class Child extends Parent{
int n;
	public Child(int n) {
		super(30);
		super.n=n;
		System.out.println("child class Constructor");
		// TODO Auto-generated constructor stub
	}
public void display()
{
	super.print();
	System.out.println("Hi");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ob=new Child(40);
ob.display();
	}

}
