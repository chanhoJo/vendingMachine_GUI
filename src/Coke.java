
public class Coke implements IProduct {
	private String pName = "코카콜라";
	private int price = 700;
	
	@Override
	public String getPName() {
		// TODO Auto-generated method stub
		return this.pName;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
}
