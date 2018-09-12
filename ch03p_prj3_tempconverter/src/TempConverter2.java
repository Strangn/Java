import java.text.NumberFormat;
import java.util.Scanner;

public class TempConverter2 {

	public static void main(String[] args)   {
		System.out.println("Welcome to the Temperature Converter");
		
		Scanner sc = new Scanner(System.in);
		
		String choice ="y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenhiet: ");
			double Fahrenhiet = sc.nextDouble();
			double Celcius = (Fahrenhiet - 32) * 5/9;
			
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(1);
			System.out.println("Degrees in Celcius: " + number.format(Celcius));
			
			System.out.println("Continue? (y/n):  ");
			choice = sc.next();
			System.out.println("Goodbye");
		}
			sc.close();
 		
		}
	
}