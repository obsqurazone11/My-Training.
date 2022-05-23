package superexample;

public class Parent {
int num,n;
	public Parent(int num) {
		this.num=num;
		System.out.println("Parent Class Constructor");
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		num++;
		System.out.println("number :" +num);
		System.out.println("n :" +n);
	}

}
