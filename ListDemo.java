package exceptiondemos;
import java.util.*;
public class ListDemo {
	
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		names.add("A1");
		names.add("Z2");
		names.add("F3");
		names.add("B4");
		 
		System.out.println(names);
		Iterator <String> i = names.iterator();
		
		while(i.hasNext()) {
			String str = i.next();
			System.out.println(str);
		}
		
		
	}

}
