

public class Fossil extends Watch{
	@Override
	public void giveWatch(){
		System.out.println("Fossil Watch");
	}
	public static void main(String args[]){
		Fossil f=new Fossil();
		f.giveWatch();
	}

}
