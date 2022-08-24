package collection;

import java.util.ArrayList;
import java.util.List;

public class arrylist {

	public static void main(String[] args) {
		//allow duplicate value
		// we can handle by index
		
		List list = new ArrayList ();

	list.add(10);
	list.add(20);
	list.add(30);
	list.add("som");
	list.add('c');
	
	
	list.remove(2);
	
	System.out.println(list.get(2));
	
	
	System.out.println(list);
	}

}
