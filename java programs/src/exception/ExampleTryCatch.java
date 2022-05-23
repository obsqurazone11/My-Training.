package exception;

public class ExampleTryCatch {
	public void operation(int n1,int n2)
	{
		int res;
		int[] arr=new int[5];
		try
		{
			res=n1/n2;
			System.out.println(res);
	
		for(int i=0;i<=5;i++)
		{
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
	}
	
catch(ArithmeticException e)
{
	System.out.println("Division by zero not possible");
}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size is 5");
	
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("End");
		}
		System.out.println("End program");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleTryCatch ob=new ExampleTryCatch();
		ob.operation(10, 5);

	}

}
