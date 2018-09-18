import java.util.HashMap;
import java.util.Map;

public class WizardInventoryApp {

	private static HashMap<Integer,String> inverntory = new HashMap<>();
	
	public static void main(String[] args) {
		System.out.println("The Wizard Inventory Game");
		populateInitialInventory();
		
		String command = "";
		while (!command.equalsIgnoreCase("exit")); {
			displayMenuItems();
			command = Console.getString("Command:  ");
			if (command.equalsIgnoreCase("show"))  {
				//show wizard inventory
				showInventoryItems();
				
			}
			else if (command.equalsIgnoreCase("grab"))  {
				// add an item to inventory
				String newItem = Console.getString("Item Name: ");
				System.out.println(addInventoryItem(newItem));
				
			}
			else if (command.equalsIgnoreCase("edit"))  {
				// edit an item
				int itemNbr = Console.getInt("Item Number:  ");
				System.out.println(editInventoryItem(itemNbr));
				
			}
			else if (command.equalsIgnoreCase("drop"))  {
				// delete and item from inventory
				int itemNbr = Console.getInt("Item Number");
				System.out.println(deleteInventoryItem(itemNbr));
			}
			else if (command.equalsIgnoreCase("menu"))  {
				displayMenuItems(); 
			}
			else if  (!command.equalsIgnoreCase("exit")) {
				//user entered an invalid command
				System.out.println("Invalid command! try again");
			}
			}
	
		System.out.println("Goodbye!");
		
	}

	

	
	public static void displayMenuItems() {
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items\r\n" + 
				"grab - Grab an item\r" + 
				"edit - Edit an item\r" + 
				"drop - Drop an item\r" + 
				"exit - Exit program");
	}
	
	public static void populateInitialInventory()  {
		inverntory.put(1,  "wooden staff");
		inverntory.put(2,  "wizard hat");
		inverntory.put(3,  "clothe shoes");
		
	}
	
	public static void showInventoryItems()  {
		for (Map.Entry item: inventory.entrySet())  {
			System.out.println(item.getKey() + ". "+item.getValue());
		}
	}
	public static String addInventoryItem (String item)  {
		int itemNbr = inventory.size() + 1;
		String msg = "";
		if (itemNbr > 4)  {
			msg = "You cant carry any more items. Drop something first.";
		}
		else {
			inventory.put(itemNbr, item);
			msg = item + " was added.":
		}
		
		return msg;
	}
	public static String editInventoryItem(int nbr)  {
		String value = inventory.get(nbr);
		System.out.println("Item selected: "+value);
		String newValue = Console.getString("Update Item Name?  ");
		inventory.put(nbr, newValue);
		return "Item number " + nbr + " was updated.";
	}
	public static String deleteInventroyItem(int nbr)  {
		String removedItemValue = inventory.remove(nbr);
		return removedItemValue + " was dropped.";
		
		
	}
}