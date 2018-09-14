import java.util.Scanner;

public class TipCalcApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cost of meal: ");
		double cm = sc.nextDouble();
		
		double tp = 0;
		double ir = 0;
		double tot = 0;
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")); {
			System.out.println("Tip: " +ir);
			System.out.println("Total: " +tot);
			ir = cm*tp;
			tot = cm+ir;
		
			System.out.print("continue? (y/n) ");
			choice = sc.next();
		}
		System.out.println("goodbye");
		sc.close();
	}
}
