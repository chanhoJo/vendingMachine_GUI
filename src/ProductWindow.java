import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProductWindow extends JFrame implements ActionListener {
	public boolean judage = false;
	CancelWindow cancel;
	JFrame productFrame;
	JLabel textLabel;
	JButton okButton;
	int productArrayIndex = 0;
	int kind; //종류
	Coke coke = new Coke();
	Sprite sprite = new Sprite();
	SportsDrink sportsDrink = new SportsDrink();
	Juice juice = new Juice();
	Coffee coffee = new Coffee();
	Water water = new Water();
	Beer beer = new Beer();
	Coin coin;
	VendingMachine machine;
	Sound sound = new Sound();
	
	//GUI 생성
	public ProductWindow(int kind, User user, ProductManager manager, Coin coin, VendingMachine machine) {
		this.kind = kind;
		this.coin = coin;
		this.machine = machine;
		
		
		productFrame = new JFrame();
		productFrame.setBounds(400, 250, 300, 200);
		productFrame.getContentPane().setLayout(null);
		productFrame.setResizable(false);
		productExpression(user, manager, coin);
		
		okButton = new JButton("확인");
		okButton.setBounds(110, 100, 80, 25);
		productFrame.getContentPane().add(okButton);
		okButton.addActionListener(this);
	}
	
	//각 음료수객체에 따른 출력
	public void productExpression(User user, ProductManager manager, Coin coin) {
		
		switch(this.kind) {
		case 1 :
			if (coin.insertedCoin >= coke.getPrice()) {
				if (manager.cokeCount != 0) {
					sound.playSound(1);
					manager.drawCoke(user, coin);
					productFrame.setTitle("콜라");
					textLabel = new JLabel("콜라가 나왔습니다!!!");
					textLabel.setBounds(100, 50, 200, 25);
					productFrame.getContentPane().add(textLabel);
					productFrame.setVisible(true);
				} else {
					cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;
		case 2 :
			if (coin.insertedCoin >= sprite.getPrice()) {
				if (manager.spriteCount != 0) {
					sound.playSound(1);
					manager.drawSprite(user, coin);
					productFrame.setTitle("사이다");
					textLabel = new JLabel("사이다가 나왔습니다!!!");
					textLabel.setBounds(100, 50, 200, 25);
					productFrame.getContentPane().add(textLabel);
					productFrame.setVisible(true);
				} else {
					cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;
		case 3 :
			if (coin.insertedCoin >= sportsDrink.getPrice()) {
				if (manager.sportsDrinkCount != 0) {
					sound.playSound(1);
					manager.drawSportsDrink(user, coin);
					productFrame.setTitle("이온음료");
					textLabel = new JLabel("이온음료가 나왔습니다!!!");
					textLabel.setBounds(100, 50, 200, 25);
					productFrame.getContentPane().add(textLabel);
					productFrame.setVisible(true);
				} else {
					cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;
		case 4 :
			if (coin.insertedCoin >= juice.getPrice()) {
				if (manager.juiceCount != 0) {
					sound.playSound(1);
					manager.drawJuice(user, coin);
					productFrame.setTitle("쥬스");
					textLabel = new JLabel("쥬스가 나왔습니다!!!");
					textLabel.setBounds(100, 50, 200, 25);
					productFrame.getContentPane().add(textLabel);
					productFrame.setVisible(true);
				} else {
					cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;
		case 5 :
			if (coin.insertedCoin >= coffee.getPrice()) {
				if (manager.coffeeCount != 0) {
					sound.playSound(1);
					manager.drawCoffee(user, coin);
					productFrame.setTitle("커피");
					textLabel = new JLabel("커피가 나왔습니다!!!");
					textLabel.setBounds(100, 50, 200, 25);
					productFrame.getContentPane().add(textLabel);
					productFrame.setVisible(true);
				} else {
					cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;
		case 6 :
			if (coin.insertedCoin >= water.getPrice()) {
				if (manager.waterCount != 0) {
					sound.playSound(1);
					manager.drawWater(user, coin);
					productFrame.setTitle("물");
					textLabel = new JLabel("물이 나왔습니다!!!");
					textLabel.setBounds(100, 50, 200, 25);
					productFrame.getContentPane().add(textLabel);
					productFrame.setVisible(true);
				} else {
					cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;

		case 7 :
			if (coin.insertedCoin >= beer.getPrice()) {
				if (manager.beerCount != 0) {
					NumberCheck check = new NumberCheck(this, user, manager, coin);
					check.numberCheck();
				} else {
				cancel = new CancelWindow(1);
				}
			} else {
				cancel = new CancelWindow(0);
			}
			break;
		}
	}
	
	public void windowOut() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		productFrame.setVisible(false);
		machine.coinStatusLabel.setText(coin.viewCoin());
	}
}
