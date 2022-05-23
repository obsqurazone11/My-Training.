package encapsulation;

public class Customer {
Bank b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank o=new Bank();
		o.setMoney(12000);
		o.calculate();
		double amount=o.getMoney();
		System.out.println("Customer Balance :" +amount);
		

	}

}
