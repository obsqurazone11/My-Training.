package singleinheritance;

public class SubStudent extends Student {
public void display()
{
	System.out.println("The Student Name is "+name);
	System.out.println("Roll Number is" +rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubStudent ob=new SubStudent();
ob.get();
ob.display();
	}

}
