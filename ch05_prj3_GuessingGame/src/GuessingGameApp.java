import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")); {
			boolean correctGuess = false;
			int theNumber = generateRandomNumber();
			int counter = 0;
			while (!correctGuess)  {
				int guess= getInt("Enter number", sc, 1, 100);
				counter++; 
				// compare the guess number
				String resp ="";
				if (guess>theNumber) {
					int diff = guess - theNumber;
					if (diff > 10) {
						resp = "Way too high!";
					}
					else {
						resp = "Too high!";
					}
						
					}
				if (guess>theNumber) {
					int diff = guess - theNumber;
					if (diff > 10) {
						resp = "Way too low!";
					}
					else {
						resp = "Too low!";
				}
		
		}
				else { //correct guess
					resp = "You got it in "counter+" tries"; 
					correctGuess = true;
				}
			}
			if (counter <= 3) {
				System.out.println("Great work! You are a mathemetical wizard!");
			}
			else if (counter <7) {
				System.out.println("Not too bad! You've got some potential.");
			}
			else {
				System.out.println("What took you so long? Maybe you should take some lessons.");
			}
			
			
				choice = sc.next();
		System.out.println(generateRandomNumber());
		
	
	
		System.out.println();
		System.out.println("Bye - Come back soon!"); }
			
		}
	
	
	//generate a random # between 1 and 100
	private static int generateRandomNumber()   {
		System.out.println("I'm thinking of a number from 1 to 100.");
		System.out.println("Try to guess it.");
		System.out.println();
		return (int)((Math.random()*100+1));
	}
	
	private static int getInt(String prompt, Scanner scan) {
		System.out.println(prompt);
		int n = 0;
		boolean isValid = false;
		while (!isValid) {
			if (scan.hasNextInt()) {
				isValid = true;
				n = scan.nextInt();
			}
			else {
				System.out.println("Please enter a valid integer.");
			}
		}
		
		return n;
 	}
	private static int getInt(String prompt, Scanner scan,
								int min, int max ) {
			int n = getInt(prompt,scan);
			boolean isValid = false;
			while (!isValid) {
				if (n < min) {
					System.out.println("Number bewlow minimum ("+min+").");
				}
				else if (n > max)  {
					System.out.println("Number aboe maximum ("+max+").");
				}
			}
			return n;
	}
}



