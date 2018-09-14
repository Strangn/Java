import java.util.Scanner;
 

public class DiceRollerApp {
		
	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n): ");
		String choice = sc.next();
		System.out.println();
		
		int a =0;
		int b=0;
		
		
		while (choice.equalsIgnoreCase("y")) {
			a=0;
			b=0;
			
			a = rollOfTheDice();
			b= rollOfTheDice(); 
			if (a == 1 && b == 1) {
				System.out.print("Die 1: " +a +"\n");
				System.out.print("Die 2: " +b +"\n");
				System.out.println("Snake eyes!");
				System.out.print("Roll Again? (y/n): ");
				choice = sc.next();
				System.out.println();
			} else if (a==6 && b==6) {
				System.out.print("Die 1: " +a +"\n");
				System.out.print("Die 2: " +b +"\n");
				System.out.println("Boxcars!");
				System.out.print("Roll Again? (y/n): " +"\n");
				choice = sc.next();
				System.out.println();
			} else {
				System.out.print("Die 1: " +a +"\n");
				System.out.print("Die 2: " +b +"\n"); 
				System.out.print("Roll Again? (y/n): ");
				choice = sc.next();
				System.out.println();
				}
		}  
		
				System.out.println("goodbye");
				sc.close();
		


	}
	
	public static int rollOfTheDice() {
		 return (int) (Math.random() * 6 + 1);
		}

	
}

