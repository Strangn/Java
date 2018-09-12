import java.util.Scanner;

public class ch04ConsoleMethodsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the ConsoleMethodsApp");
		Scanner sc = new Scanner(System.in);
		
		
		int a = promptForInt("Enter # a:  ",sc);
		int b = promptForInt("Enter # b:  ",sc);
		int c = promptForInt("Enter # c:  ",sc);
		
		System.out.println("#s entered:  "+a+",  "+b+", "+c);
		System.out.println("Goodbye");
		sc.close();
	}
	
	private static int promptForInt(String prompt, Scanner s) {
		System.out.println(prompt);
		int n = s.nextInt();
		return n;
	}
}
