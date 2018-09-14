
public class Rectangle extends Square {

	protected double height ;
	
	
	public Rectangle(double width, double height) {
		super(width);
		this.height = height;
	}

	public void  setHeight (double height)  {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width*height;
			
	}
 

}
