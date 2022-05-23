package discount.polymorphism;

public class Offsale extends Onsale
{
	public void display()
	{
		super.display();
		System.out.println("Final price After discount :" +super.finalval);
		System.out.println("OffSale Discount :");
		discount=total*0.15;
		System.out.println("Discount price : " +discount);
		finalval=total-discount;
		System.out.println("Final price After discount :" +finalval);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offsale ob=new Offsale();
		ob.get();
		ob.display();
		

	}

}
