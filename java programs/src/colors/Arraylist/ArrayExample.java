package colors.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls=new ArrayList<String>();
ls.add("red");
ls.add("green");
ls.add("blue");
ls.add("pink");
ls.add("white");
System.out.println(ls);
Collections.sort(ls);
System.out.println("after sorting");
System.out.println(ls);
System.out.println("The element at index 3 in the arraylist :");
System.out.println(ls.get(3));
System.out.println(" ");
for(String element:ls)
{
	System.out.println(element);
}
ls.remove(2);
System.out.println("After removing");
System.out.println(ls);
	System.out.println(" "); 
	int index1 = ls.indexOf("red");
    int index2 = ls.indexOf("brown");
    if(index1 == -1)
       System.out.println("The  red colour is not in the ArrayList");
    else
       System.out.println("The red colour is in the ArrayList at index " + index1);
    if(index2 == -1)
       System.out.println("The brown colour is not in the ArrayList");
    else
       System.out.println("The brown colour is in the ArrayList at index " + index2);
	}
}
