import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class ch15FileDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello!");
			// create folders in folders depending on how far you go
		String dirString = "c:/test/test2/test3";
		String dirString2 = "products.txt";
		Path dirPath = Paths.get(dirString);
		Path dirPath2 = Paths.get(dirString2);
		if (Files.notExists(dirPath)) {
			System.out.println(dirPath+ "created");
			Files.createDirectories(dirPath);
		}
		else {
			System.out.println("dir already exists");
		}
		if (Files.notExists(dirPath2)) {
			System.out.println(dirPath2+ "created");
			Files.createDirectories(dirPath2);
		}
		else {
			System.out.println("dir2 already exists");
		}
		System.out.println("Goodbye!"); 
	}
	

}
