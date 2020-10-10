
public class MethodChainningDemo {
	public static void main(String[] args) {
		Integer i=250006;
		System.out.println(i.getClass());
		System.out.println(i.toString().getClass());
		i.toString().substring(0).subSequence(0, 1);
		
	}

}
