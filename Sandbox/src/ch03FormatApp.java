import java.text.NumberFormat;

public class ch03FormatApp {

	public static void main(String[] args) {
		double price = 11.575;
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Formatted price = "+cf.format(price));
		
		double majority = .505;
		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println("Formatted percent = " + pf.format(majority));

	}
	

}
