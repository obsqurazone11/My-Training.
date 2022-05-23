package collection.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ob=new ArrayList<String>();
		ob.add("India");
		ob.add("China");
		ob.add("Japan");
		ob.add("Usa");
		System.out.println(ob);
		Collections.sort(ob);
		System.out.println("after sorting");
		System.out.println(ob);
			ob.remove(1);
			System.out.println("After removing");
			System.out.println(ob);
/*for(int i=0;i<ob.size();i++)
{
	System.out.println(ob.get(i));

	}*/
for(String e:ob)
{
	System.out.println(e);
}
	}
}