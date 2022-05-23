package encapsulation.example;

public class VideoSearch extends Google {
	public void disp()
	{
		System.out.println("Welcome to video search");
	}
	public void search()
	{
		System.out.println("All video search results");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoSearch obj=new VideoSearch();
		obj.print();
		obj.disp();
		obj.search();

	}

}
