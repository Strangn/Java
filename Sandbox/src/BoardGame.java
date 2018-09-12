
public class BoardGame extends Toy  {
	private String name;
	private int pieces;
	
	
	
	public BoardGame(int id, String code, double price, String name, int pieces) {
		super(id, code, price);
		this.name = name;
		this.pieces = pieces;
	}
	
	public BoardGame(int id, String code, double price) {
		super(id, code, price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	
	@Override
	public String toString() {
		return super.toString() + "BoardGame [name=" + name + ", pieces=" + pieces + "]";
	}
	
}
