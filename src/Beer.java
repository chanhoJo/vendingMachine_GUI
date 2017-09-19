
public class Beer implements IProduct {
	private String pName = "아사히";
	private int price = 2000;
	
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
