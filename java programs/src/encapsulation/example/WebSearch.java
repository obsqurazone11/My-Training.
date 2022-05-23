package encapsulation.example;

public class WebSearch extends Google {
	public void show()
	{
		System.out.println("Welcome to web search");
	}
	public void search()
	{
		System.out.println("All search results");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSearch o=new WebSearch();
		o.print();
		o.show();
		o.search();

	}

}
