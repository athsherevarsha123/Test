import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ArraylistSerialized implements Serializable{
		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		public static void main(String[] args) throws Exception {
			List<String> lst=new ArrayList<String>();
			lst.add("Ankur");
			lst.add("Alia");
			lst.add("dinga");
			lst.add("xyz");
			lst.add("abc");
			lst.add("Rani");
			
			FileOutputStream fos = new FileOutputStream("A1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(lst);
			oos.close();
			System.out.println("App End");
			
			
		}


}
