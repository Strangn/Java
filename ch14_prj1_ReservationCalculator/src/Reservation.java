import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	public static final double PRICEPERNIGHT = 145.00;
	
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	
//get and sets are the methods. need to add values
	public LocalDate getarrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}
	public static String getPricepernightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String ppNight = currency.format(PRICEPERNIGHT);
		return ppNight;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate = dtf.format(arrivalDate);
		return formattedDate;
	}
	
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate = dtf.format(departureDate);
		return formattedDate;
	}
	
	public int getNumberOfNights() {
		long numberOfNights = ChronoUnit.DAYS.between(arrivalDate, departureDate);
		return (int) numberOfNights;
	}
	public double getTotalPrice() {
		double totalPrice = getNumberOfNights() * PRICEPERNIGHT;
		return totalPrice;
	}
	public String getTotalPriceFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String totalPriceFormatted = currency.format(getTotalPrice());
		return totalPriceFormatted;
	}

	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + "]";
	}
	
}
