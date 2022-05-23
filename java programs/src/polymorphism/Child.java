package polymorphism;

public class Child extends Parent{
	public float disp(int n1,float n2)
	{
		float res;
		res=n2-n1;
		return res;
	}
public void printchild()
{
	System.out.println("parent result :" +super.disp(20,14.5f));
	System.out.println("Child class method");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Child ob=new Child();
//System.out.println("Child result :" +ob.disp(12,15.5f));
//ob.printchild();
//ob.printparent();
		Parent ob=new Child();
		float result=ob.disp(20,30.5f);
		System.out.println(result);
		ob.printparent();
		
	}

}
