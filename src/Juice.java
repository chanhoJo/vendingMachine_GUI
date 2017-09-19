
public class Juice implements IProduct {
	private String pName = "델몬트 오렌지";
	private int price = 800;
	
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
