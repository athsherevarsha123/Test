import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class StudentDetail {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("sdata.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Student s=null;
			if(o instanceof Student)
				s=(Student) o;
			System.out.println(s.name+" "+s.dept+" "+s.per);
			ois.close();
			}
		catch (IOException | ClassNotFoundException e1){
			e1.printStackTrace();

		}
		
	}


}
