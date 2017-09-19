
public class Coffee implements IProduct {
	private String pName = "조지아";
	private int price = 1000;
	
	@Override
	public String getPName() {
		return this.pName;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
}
