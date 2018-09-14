public class AreaCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");
		System.out.println();
		
		
		String choice = "y";
		String shapeType = Console.getString("Calculate area of a circle, "
				+ "square, or rectangle? (c/s/r): ");
		while (choice.equalsIgnoreCase("y")) {
			double h = 0.0;
			double w = 0.0;
			double r = 0.0;
			
			Shape s = null;
			switch (shapeType) {
			case "c":
				r = Console.getDouble("Enter radius: ");
				s = new Circle(r);
				break;
			case "s":
				w = Console.getDouble("Enter width: ");
				s = new Square(w);
				break;
			case "r":
				w = Console.getDouble("Enter width: ");
				h = Console.getDouble("Enter height: ");
				s = new Rectangle(w, h);
				break;
			}
			
			Class c = s.getClass();
			System.out.println("The area of the " +c.getName() +" you entered is"
			+s.getArea());
			
			choice = Console.getString("continue: (y/n)? ");
		}
		
		
		
		System.out.println("Goodbye");

	}

}