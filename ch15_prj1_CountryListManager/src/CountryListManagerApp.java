import java.io.Console;
import java.util.List;

public class CountryListManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Country List Manager Application");
		
		CountryIO cio = new CountryIO();
		String command = "";
		while (!command.equalsIgnoreCase("3"))  {
			displayCommandMenu();
			command = Console.getString("Enter menu #:  ");
			if (command.equals("1"))  {
				// list countries
				List<Country> countries = cio.getAll();
				if (countries==null ||countries.size()==0)  {
					System.out.println("countries file doesn't exist. Please add a country");
				}
				for (Country c: countries)  {
					System.out.println(c);
				}
				
				System.out.println();
			}
			else if (command.equals("2"))  {
				//add country
				int id = Console.getInt("Enter country id:  ");
				String code = Console.getstring("Enter country code:  ");
				String name = Console.getString("Enter country name:  ");
				Country c = new Country(id, code, name);				
				if (cio.add(c))  {
					System.out.println("This country has been saved");
				
				}
				else {
					System.out.println("Error adding country");
				}
			}
			else if (!command.equals("3"))  {
				// invalid command 
				System.out.println("Invalid command. Please try again.");
			}
		}
		
		
		System.out.println("Goodbye!");
	}
	
	private static void displayCommandMenu()  {
		System.out.println("COMMAND MENU\n"  +
					"1 - List countries\n"  +
					"2 - Add a country\n"  +
					"3 - Exit\n");
	}
	
		
}
