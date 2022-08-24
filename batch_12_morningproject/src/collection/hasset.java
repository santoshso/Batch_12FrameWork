package collection;

import java.util.HashSet;
import java.util.Set;

public class hasset {

	public static void main(String[] args) {
		
    Set set = new HashSet()	;
    
    set.add(10);
    set.add("som");
    set.add(30);
    set.add(40);
    set.add(30);

    set.remove("som");
    System.out.println(set);
    
    
    System.out.println(set.contains(30));
    System.out.println(set.size());
    System.out.println(set.isEmpty());
}
}