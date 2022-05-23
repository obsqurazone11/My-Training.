package encapsulation;

public class Bank {
	private double money;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	public void calculate()
	{
		money=money+1000;
	}

}
