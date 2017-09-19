import java.util.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.SystemColor;

class VendingMachine extends JFrame implements ActionListener {
	
	JFrame mainFrame;
	JLabel cokeLabel, spriteLabel, sportsDrinkLabel, 
           juiceLabel, coffeeLabel, waterLabel, coinStatusLabel, beerLabel,
           logoLabel;
	JPanel porductPlacePanel, fProductLinePanel, sProductLinePanel, ManagePanel;
	JButton cokeButton, spriteButton, sportsDrinkButton, juiceButton, 
	        coffeeButton, waterButton, managerButton, coinButton, beerButton;
	ManagerWindow managerWin;
	ProductWindow productWin;
	InsertCoinWindow InsertCoinWin;
	VendingMachine machine;
	ProductManager manage = new ProductManager();
	User user = new User();
	Coin coin = new Coin();
	
	//기본 틀
	VendingMachine() {
		
		mainFrame = new JFrame("자판기");
		mainFrame.getContentPane().setBackground(Color.RED);
		mainFrame.getContentPane().setForeground(Color.BLACK);
		mainFrame.setBounds(0, 0, 900, 800);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setResizable(false);
		
		/*--- 라벨-----*/		
		cokeLabel = new JLabel() { ImageIcon i = new ImageIcon("img/coke.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		cokeLabel.setBounds(51, 50, 95, 130);
		mainFrame.getContentPane().add(cokeLabel);
		
		spriteLabel = new JLabel() { ImageIcon i = new ImageIcon("img/sprite.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		spriteLabel.setBounds(220, 50, 95, 130);
		mainFrame.getContentPane().add(spriteLabel);
		
		sportsDrinkLabel = new JLabel() { ImageIcon i = new ImageIcon("img/sportsDrink.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		sportsDrinkLabel.setBounds(391, 50, 95, 130);
		mainFrame.getContentPane().add(sportsDrinkLabel);
		
		juiceLabel = new JLabel() { ImageIcon i = new ImageIcon("img/juice.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		juiceLabel.setBounds(571, 50, 95, 130);
		mainFrame.getContentPane().add(juiceLabel);
		
		coffeeLabel = new JLabel() { ImageIcon i = new ImageIcon("img/coffee.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		coffeeLabel.setBounds(51, 268, 95, 130);
		mainFrame.getContentPane().add(coffeeLabel);
		
		waterLabel = new JLabel() { ImageIcon i = new ImageIcon("img/water.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		waterLabel.setBounds(220, 268, 95, 130);
		mainFrame.getContentPane().add(waterLabel);
		
		beerLabel = new JLabel() { ImageIcon i = new ImageIcon("img/beer.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 95, 130, null);
			}
		};
		beerLabel.setBounds(391, 268, 95, 130);
		mainFrame.getContentPane().add(beerLabel);
		
		logoLabel = new JLabel() { ImageIcon i = new ImageIcon("img/logo.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, 745, 130, null);
			}			
		};
		logoLabel.setBounds(80, 468, 745, 130);
		mainFrame.getContentPane().add(logoLabel);
		
		coinStatusLabel = new JLabel();
		coinStatusLabel.setForeground(Color.WHITE);
		coinStatusLabel.setBounds(774, 73, 95, 50);
		coinStatusLabel.setText(coin.viewCoin());
		mainFrame.getContentPane().add(coinStatusLabel);
		
						
		/*--- 버튼-----*/
		cokeButton = new JButton("콜라");
		cokeButton.setBounds(61, 201, 78, 31);
		mainFrame.getContentPane().add(cokeButton);
		cokeButton.addActionListener(this);
		
		spriteButton = new JButton("사이다");
		spriteButton.setBounds(230, 201, 78, 31);
		mainFrame.getContentPane().add(spriteButton);
		spriteButton.addActionListener(this);
		
		sportsDrinkButton = new JButton("이온");
		sportsDrinkButton.setBounds(401, 201, 78, 31);
		mainFrame.getContentPane().add(sportsDrinkButton);
		sportsDrinkButton.addActionListener(this);
		
		juiceButton = new JButton("오렌지");
		juiceButton.setBounds(576, 198, 78, 31);
		mainFrame.getContentPane().add(juiceButton);
		juiceButton.addActionListener(this);
		
		coffeeButton = new JButton("캔 커피");
		coffeeButton.setBounds(61, 408, 78, 31);
		mainFrame.getContentPane().add(coffeeButton);
		coffeeButton.addActionListener(this);
		
		waterButton = new JButton("생수");
		waterButton.setBounds(230, 408, 78, 31);
		mainFrame.getContentPane().add(waterButton);
		waterButton.addActionListener(this);
		
		beerButton = new JButton("맥주");
		beerButton.setBounds(391, 408, 78, 31);
		mainFrame.getContentPane().add(beerButton);
		beerButton.addActionListener(this);
		
		managerButton = new JButton("관리");
		managerButton.setBounds(755, 161, 95, 50);
		mainFrame.getContentPane().add(managerButton);
		managerButton.addActionListener(this);
		
		coinButton = new JButton("동전 투입");
		coinButton.setBounds(755, 242, 95, 50);
		mainFrame.getContentPane().add(coinButton);
		coinButton.addActionListener(this);
		
		
		
		/*--- 패널-----*/
		porductPlacePanel = new JPanel();
		porductPlacePanel.setBackground(Color.DARK_GRAY);
		porductPlacePanel.setBounds(51, 608, 813, 138);
		mainFrame.getContentPane().add(porductPlacePanel);
		
		fProductLinePanel = new JPanel();
		fProductLinePanel.setBounds(26, 27, 681, 161);
		mainFrame.getContentPane().add(fProductLinePanel);
		
		sProductLinePanel = new JPanel();
		sProductLinePanel.setBounds(26, 255, 495, 145);
		mainFrame.getContentPane().add(sProductLinePanel);
		
		ManagePanel = new JPanel();
		ManagePanel.setBackground(Color.DARK_GRAY);
		ManagePanel.setBounds(741, 73, 128, 239);
		mainFrame.getContentPane().add(ManagePanel);
		mainFrame.setVisible(true);
		
		manage.inputProduct();
		manage.valCount();
		user.increaseMoney();		
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == managerButton){
			managerWin = new ManagerWindow(user, manage);			
		} else if (e.getSource() == coinButton) {
			InsertCoinWin = new InsertCoinWindow(user, coin, this);
		} else if (e.getSource() == cokeButton) {
			productWin = new ProductWindow(1, user, manage, coin, this);
		} else if (e.getSource() == spriteButton) {
			productWin = new ProductWindow(2, user, manage, coin, this);
		} else if (e.getSource() == sportsDrinkButton) {
			productWin = new ProductWindow(3, user, manage, coin, this);
		} else if (e.getSource() == juiceButton) {
			productWin = new ProductWindow(4, user, manage, coin, this);
		} else if (e.getSource() == coffeeButton) {
			productWin = new ProductWindow(5, user, manage, coin, this);
		} else if (e.getSource() == waterButton) {
			productWin = new ProductWindow(6, user, manage, coin, this);
		} else if (e.getSource() == beerButton) {
			productWin = new ProductWindow(7, user, manage, coin, this);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine machine = new VendingMachine();
	}
}
