
public class GradeConverterApp {

	public static void main(String[] args) {
	System.out.println("Welcome to the Letter Grade Converter");
		
		String choice = "y";
				
		while (choice.equalsIgnoreCase("y")) {
			
			// prompt user for numeric grade
			int grade = Console.getInt("Enter Nnumerical grade", 0, 100);
			Grade g = new Grade(grade);
			
			
			// display the letter grade
			System.out.println("Letter grade: "+g.getLetter());
			
			choice = Console.getString("Continue(y/n)? ");
		}
		
		System.out.println("Goodbye");
				
	}

}
