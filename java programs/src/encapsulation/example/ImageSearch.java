package encapsulation.example;

public class ImageSearch extends Google
{
public void display()
{
	System.out.println("Welcome to image search");
}
public void search()
{
	System.out.println("All image search results");
}

public static void main(String[] args)
{
	ImageSearch ob=new ImageSearch();
	ob.print();
	ob.display();
	ob.search();
}
}