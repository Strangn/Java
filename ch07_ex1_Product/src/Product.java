import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    private double pricenumberformat;

    public Product () {
    	code = "";
    	description = "";
    	price = 0;
    	pricenumberformat = 0;
    }
    
    public Product (String inCode, String inDescription, double inPrice)  {
        code = inCode;
        description = inDescription;
        price = inPrice;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    

    public String getPriceFormatted() {
        NumberFormat number  = NumberFormat.getIntegerInstance();
        return number.format(price);
    }
}