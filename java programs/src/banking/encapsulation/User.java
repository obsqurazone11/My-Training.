package banking.encapsulation;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank ob=new Bank();
ob.setPin(1258);
int pinnumber=ob.getPin();
System.out.println("User's pinnumber :" +pinnumber);
ob.check();
	}

}
