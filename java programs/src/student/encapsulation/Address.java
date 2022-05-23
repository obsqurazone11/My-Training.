package student.encapsulation;

public class Address {
	private Student s;
	private String housename;
	private int houseno;
	private String place;
	private int pin;
    

	public Student getS() {
		return s;
	}


	public void setS(Student s) {
		this.s = s;
	}


	public String getHousename() {
		return housename;
	}


	public void setHousename(String housename) {
		this.housename = housename;
	}


	public int getHouseno() {
		return houseno;
	}


	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}
 public void display()
 {
	 System.out.println("Name :" +s.getName());
	 System.out.println("Roll no :" +getS().getRollno());
	 System.out.println("House Name :" +getHousename());
	 System.out.println("House Number :" +getHouseno());
	 System.out.println("Place :" +getPlace());
	 System.out.println("Pin :" +getPin());
	 
	 
	 
	 
 }

	

}
