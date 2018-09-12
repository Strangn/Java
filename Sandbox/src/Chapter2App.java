import java.util.Scanner;

public class Chapter2App {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an integer");
//		int a = sc.nextInt();
//		System.out.println("Enter another integer");
//		int b = sc.nextInt();
//		
//		double avg = ((double) a+(double) b) / 2;
//		
//		System.out.println("Average = "+avg);
//		
//		// if average is greater tahn 10 say woo-hoo, if not say boo
//		if (avg > 10 ) {
//			System.out.println("Woo-hoo! greater than 10");
//		}
//		else {
//			System.out.println("Boo! not greater than 10. :(");
//		}
		
		
		// get a string from user and test if it equals 'yes'
		System.out.println("Enter 'yes' or 'no'");
		String str = sc.next();
		if (str.equals("yes"))
				System.out.println("User entered 'yes'");
		System.out.println("Goodbye");
		sc.close();
	}

}
