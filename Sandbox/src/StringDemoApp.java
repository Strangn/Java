
public class StringDemoApp  {
	
	public static void main(String[] args)  {
		String code = "java";
		System.out.println("size is "+code.length());
		
		String name = "Mr. Freddy Mercury";
		int n1 = name.indexOf(" ");
		int n2 = name.indexOf(" ", n1+1);
		System.out.println(n1 + " " + n2);
	
		int n3 = name.indexOf("Fred");
		System.out.println("n3");
	}
	
	
}