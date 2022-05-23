package student.encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student ob=new Student();
ob.setName("sree");
ob.setRollno(21);
Address ad=new Address();
ad.setHousename("Isha");
ad.setHouseno(1245);
ad.setPlace("kvtm");
ad.setPin(6951);
ad.setS(ob);
ad.display();
	}
}
