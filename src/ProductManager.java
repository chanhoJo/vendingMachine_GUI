import java.util.Vector;

import javax.swing.JFrame;

public class ProductManager implements Counter {
	Vector<IProduct> productArr = new Vector<IProduct>();	//제품 잔량배열
	int increaseAmount; //증가 변수
	int cokeCount = 0;
	int spriteCount = 0;
	int sportsDrinkCount = 0;
	int juiceCount = 0;
	int coffeeCount = 0;
	int waterCount = 0;
	int beerCount = 0;
	int income = 0; //수입
	
	public void inputProduct() {
		for (int i = 0; i < 70; i++) {
			if (i < 10) {
				productArr.addElement(new Coke());
			} else if (i > 9 && i < 20) {
				productArr.addElement(new Sprite());
			} else if (i > 19 && i < 30) {
				productArr.addElement(new SportsDrink());
			} else if (i > 29 && i < 40) {
				productArr.addElement(new Juice());
			} else if (i > 39 && i < 50) {
				productArr.addElement(new Coffee());
			} else if (i > 49 && i < 60) {
				productArr.addElement(new Water());
			} else if (i > 59 && i < 70) {
				productArr.addElement(new Beer());
			}
		}
	}
		
	public void drawCoke(User user, Coin coin) {
		Coke coke = new Coke();
		user.userArr.addElement(coke);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Coke) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += coke.getPrice();
		coin.insertedCoin -= coke.getPrice();
		this.valCount();
	}
	
	public void drawSprite(User user, Coin coin) {
		Sprite sprite = new Sprite();
		user.userArr.addElement(sprite);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Sprite) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += sprite.getPrice();
		coin.insertedCoin -= sprite.getPrice();
		this.valCount();
	}
	
	public void drawSportsDrink(User user, Coin coin) {
		SportsDrink sportsDrink = new SportsDrink();
		user.userArr.addElement(sportsDrink);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof SportsDrink) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += sportsDrink.getPrice();
		coin.insertedCoin -= sportsDrink.getPrice();
		this.valCount();
	}

	public void drawJuice(User user, Coin coin) {
		Juice juice = new Juice();
		user.userArr.addElement(juice);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Juice) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += juice.getPrice();
		coin.insertedCoin -= juice.getPrice();
		this.valCount();
	}

	public void drawCoffee(User user, Coin coin) {
		Coffee coffee = new Coffee();
		user.userArr.addElement(coffee);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Coffee) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += coffee.getPrice();
		coin.insertedCoin -= coffee.getPrice();
		this.valCount();
	}
	
	public void drawWater(User user, Coin coin) {
		Water water = new Water();
		user.userArr.addElement(water);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Water) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += water.getPrice();
		coin.insertedCoin -= water.getPrice();
		this.valCount();
	}
	
	public void drawBeer(User user, Coin coin) {
		Beer beer = new Beer();
		user.userArr.addElement(beer);
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Beer) {
				productArr.removeElementAt(i);
				break;
			} 
		}
		income += beer.getPrice();
		coin.insertedCoin -= beer.getPrice();
		this.valCount();
	}
	
	public void increaseCoke() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new Coke());
		}
		this.valCount();
	}
	
	public void increaseSprite() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new Sprite());
		}
		this.valCount();
	}
	
	public void increaseSportsDrink() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new SportsDrink());
		}
		this.valCount();
	}

	public void increaseJuice() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new Juice());
		}
		this.valCount();
	}

	public void increaseCoffee() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new Coffee());
		}
		this.valCount();
	}
	
	public void increaseWater() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new Water());
		}
		this.valCount();
	}
	
	public void increaseBeer() {
		for (int i = 0; i < increaseAmount; i++) {
			productArr.addElement(new Beer());
		}
		this.valCount();
	}
	
	public void valCount() {
		
		int cokeCount = 0;
		int spriteCount = 0;
		int sportsDrinkCount = 0;
		int juiceCount = 0;
		int coffeeCount = 0;
		int waterCount = 0;
		int beerCount = 0;
		
		for (int i = 0; i < productArr.size(); i++) {
			if (productArr.elementAt(i) instanceof Coke) {
				cokeCount++;
			} else if (productArr.elementAt(i) instanceof Sprite) {
				spriteCount++;
 			} else if (productArr.elementAt(i) instanceof SportsDrink) {
 				sportsDrinkCount++;
			} else if (productArr.elementAt(i) instanceof Juice) {
				juiceCount++;
			} else if (productArr.elementAt(i) instanceof Coffee) {
				coffeeCount++;
			} else if (productArr.elementAt(i) instanceof Water) {
				waterCount++;
			} else if (productArr.elementAt(i) instanceof Beer) {
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
	
	public String viewCount() {
		return ("<html>콜라 : " + cokeCount + "개<br><br>" + 
				"사이다 : " + spriteCount + "개<br><br>" +
				"이온음료 : " + sportsDrinkCount + "개<br><br>" +
				"쥬스 : " + juiceCount + "개<br><br>" +
				"커피 : " + coffeeCount + "개<br><br>" +
				"물 : " + waterCount + "개<br><br>" + 
				"맥주 : " + beerCount + "개</html>");
	}
	
	public String viewIncome() {
		return ("<html>현재 수입은 : " + income + "원 입니다.</html>");
	}
}