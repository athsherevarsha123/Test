import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CollectionDemo {
	public static void main(String args[]) {
		Set<Object> s=new HashSet<>();
		s.add("Ankur");
		s.add(25);
		s.add(false);
		s.add(6.5);

		List<Object> lst=new ArrayList<>(s);
		for(Object val:lst){
			System.out.println(val);
	
		}
		System.out.println("Extra:" +lst.get(2).getClass());
		System.err.println("===============================================");
		List<Object> lst1= new ArrayList<>();
		lst1.addAll(s);
		
		for(Object val:lst1){
			System.out.println(val);
	
		}
		
	}



}
