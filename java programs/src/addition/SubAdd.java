package addition;

public class SubAdd extends AddSum {

	public SubAdd() {
		super(86,55);
		super.display();
		
		if(res%10==0)
			System.out.println("The number is divisible by ten");
		
		else 
			System.out.println("The number Not divisible by ten");// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		SubAdd ob=new SubAdd();
		// TODO Auto-generated method stub
	}

}
