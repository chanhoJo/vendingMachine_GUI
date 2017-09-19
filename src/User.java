import java.util.Vector;

public class User implements Counter {
	Vector userArr = new Vector();	
	int cokeCount = 0;
	int spriteCount = 0;
	int sportsDrinkCount = 0;
	int juiceCount = 0;
	int coffeeCount = 0;
	int waterCount = 0;
	int beerCount = 0;
	int money = 0;
	
	public void valCount() {
		
		int cokeCount = 0;
		int spriteCount = 0;
		int sportsDrinkCount = 0;
		int juiceCount = 0;
		int coffeeCount = 0;
		int waterCount = 0;
		int beerCount = 0;
		
		for (int i = 0; i < userArr.size(); i++) {
			if (userArr.elementAt(i) instanceof Coke) {
				cokeCount++;
			} else if (userArr.elementAt(i) instanceof Sprite) {
				spriteCount++;
 			} else if (userArr.elementAt(i) instanceof SportsDrink) {
 				sportsDrinkCount++;
			} else if (userArr.elementAt(i) instanceof Juice) {
				juiceCount++;
			} else if (userArr.elementAt(i) instanceof Coffee) {
				coffeeCount++;
			} else if (userArr.elementAt(i) instanceof Water) {
				waterCount++;
			} else if (userArr.elementAt(i) instanceof Beer) {
				beerCount++;
			}
		}
		
		this.cokeCount = cokeCount;
		this.spriteCount = spriteCount;
		this.sportsDrinkCount = sportsDrinkCount;
		this.juiceCount = juiceCount;
		this.coffeeCount = coffeeCount;
		this.waterCount = waterCount;	
		this.beerCount = beerCount;
	}
	
	//현황 출력
	public String viewCount() {
		return ("<html>콜라 : " + cokeCount + "개<br><br>" + 
				"사이다 : " + spriteCount + "개<br><br>" +
				"이온음료 : " + sportsDrinkCount + "개<br><br>" +
				"쥬스 : " + juiceCount + "개<br><br>" +
				"커피 : " + coffeeCount + "개<br><br>" +
				"물 : " + waterCount + "개<br><br>" + 
				"맥주 : " + beerCount + "개</html>");
	}
	
	//사용자 소지금 증가 쓰레드
	public void increaseMoney(){
		while(true){			
			money += 10000;
			System.out.println(money);
			try { 
				Thread.sleep(10000);
			} catch (InterruptedException e) {}
			
		}
	}
}