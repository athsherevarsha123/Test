import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class EmployeeDetail {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("EData.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Employee e=null;
			if(o instanceof Employee)
				e=(Employee) o;
			System.out.println(e.name+" "+e.profile+" "+e.sal+" "+e.comm);
			ois.close();
			}
		catch (IOException | ClassNotFoundException e1){
			e1.printStackTrace();

		}
		
	}
	

}
