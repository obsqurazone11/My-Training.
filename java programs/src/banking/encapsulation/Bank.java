package banking.encapsulation;

public class Bank {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public void check()
	{
		if((pin==1001)||(pin==1234)||(pin==1212))
			
		{
			System.out.println(" The pin is VALID PIN");
		}
		else
		{
			System.out.println(" The pin is INVALID PIN");
		}
	}

}
