
public class Fossil1 {
	public static void main(String args[]){
		Watch w=new Watch(){
			@Override
			public void giveWatch(){
				System.out.println("fossil watch");
			}
		};
		w.giveWatch();
	}



}
