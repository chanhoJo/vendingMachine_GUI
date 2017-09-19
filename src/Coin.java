
public class Coin {
	public int insertedCoin = 0;
	
	public void insertCoin(int j, User user) {
		switch (j) {
			case 1 :
				insertedCoin += 100;
				user.money -= 100;
				break;
			case 2 :
				insertedCoin += 500;
				user.money -= 500;
				break;
			case 3 :
				insertedCoin += 1000;
				user.money -= 1000;
				break;
		}
	}
	
	public void returnCoin(User user) {
		user.money += insertedCoin;
		insertedCoin = 0;
	}
	
	public String viewCoin() {
		return ("<html>현재 : " + insertedCoin + "원<html>");
	}
}
