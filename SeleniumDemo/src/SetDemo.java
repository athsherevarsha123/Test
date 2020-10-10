import java.util.HashSet;
import java.util.Set;


public class SetDemo {
	public static void main(String[] args){
		Set<String> s=new HashSet<>();
		s.add("Arshika");
		s.add("Arti");
		s.add("oggi");
		s.add("pogo");
		s.add("Alia");
		
		for(String val:s){
			System.out.println(val);
		}
	}
	

}
