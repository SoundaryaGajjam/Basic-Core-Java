package hashcode;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ItrDemo {
	public static void main(String[] args) {
		List l=new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
	ListIterator lit=  l.listIterator();
	
	while (lit.hasNext())
	{
		
	
		System.out.println(l.get(0));
	}
	}
	
		/*System.out.println(lit.hasPrevious());
		
		while (lit.hasNext())
		{
			lit.next();
		}
	while(lit.hasPrevious()){
		
		System.out.println(lit.previous());
	}
	
	}*/
}
