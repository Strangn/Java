public class PigLatinTranslatorApp {

	public static void main(String[] args) {
		System.out.println("hi");
		String s = Console.getString("enter line: ");
		PigLatinTranslator plt = new PigLatinTranslator(s);
		
		System.out.println(plt.translate());
		System.out.println("bye");
	}

}