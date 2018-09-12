import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            BigDecimal miles = new BigDecimal( sc.next() );
            
            System.out.print("Enter gallons of gas used: ");
            BigDecimal gallons = new BigDecimal( sc.next() );
            
            BigDecimal mpg = miles.divide(gallons, 2, RoundingMode.HALF_UP);
            NumberFormat mpg2 = NumberFormat.getNumberInstance();
            mpg2.setMaximumFractionDigits(2);
            String mpgString = mpg2.format(mpg);
            System.out.println("Miles per gallon is " + mpgString + ".");
            System.out.println(); 
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
