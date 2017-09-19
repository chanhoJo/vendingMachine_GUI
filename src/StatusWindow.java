import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StatusWindow extends JFrame implements ActionListener {
	JFrame statusFrame;
	JLabel statusLabel;
	JButton ManageOkButton, CoinOkButton;
	VendingMachine machine;
	Coin coin;
	
	
	StatusWindow (int distinction, User user, ProductManager manager) {
		statusFrame = new JFrame();
		statusFrame.setBounds(450, 200, 400, 320);
		statusFrame.getContentPane().setLayout(null);
		statusFrame.setResizable(false);
		statusFrame.setVisible(true);
		
		statusLabel = new JLabel();
		statusLabel.setBounds(0, 0, 400, 250);
		statusLabel.setVerticalAlignment(statusLabel.CENTER);
		statusLabel.setOpaque(true);
		statusLabel.setBackground(Color.lightGray);
		statusFrame.getContentPane().add(statusLabel);
		
		ManageOkButton = new JButton("확 인");
		ManageOkButton.setBounds(150, 260, 100, 30);
		statusFrame.getContentPane().add(ManageOkButton);
		ManageOkButton.addActionListener(this);
		user.valCount();
		manager.valCount();
		settingGUI(distinction);
		viewProductCount(distinction, user, manager, null);
	}
	
	StatusWindow (int distinction, Coin coin, VendingMachine machine) {
		this.machine = machine;
		this.coin = coin;
		
		statusFrame = new JFrame();
		statusFrame.setBounds(500, 300, 300, 175);
		statusFrame.getContentPane().setLayout(null);
		statusFrame.setResizable(false);
		statusFrame.setVisible(true);
		
		statusLabel = new JLabel();
		statusLabel.setBounds(0, 0, 300, 100);
		statusLabel.setVerticalAlignment(statusLabel.CENTER);
		statusLabel.setOpaque(true);
		statusLabel.setBackground(Color.lightGray);
		statusFrame.getContentPane().add(statusLabel);
		
		CoinOkButton = new JButton("확 인");
		CoinOkButton.setBounds(100, 110, 100, 30);
		statusFrame.getContentPane().add(CoinOkButton);
		CoinOkButton.addActionListener(this);
		viewProductCount(distinction, null, null, coin);
		settingGUI(distinction);
	}
	
	public void viewProductCount(int j, User user, ProductManager manager, Coin coin) {
		
		switch (j) {
			case 0 :
				statusLabel.setText(user.viewCount());
				break;
			case 1 :
				statusLabel.setText(manager.viewCount());
				break;
			case 2 :
				statusLabel.setText(manager.viewIncome());
				break;
			case 3 :
				statusLabel.setText(coin.viewCoin());
				break;
		}		
	}
	
	public void settingGUI(int j) {
		switch (j) {
			case 0 :
				statusFrame.setTitle("판매 현황");
				break;
			case 1 :
				statusFrame.setTitle("잔량 현황");
				break;
			case 2 :
				statusFrame.setTitle("수입 현황");
				statusLabel.setHorizontalAlignment(statusLabel.CENTER);
				break;
			case 3 :
				statusFrame.setTitle("잔액");
				statusLabel.setHorizontalAlignment(statusLabel.CENTER);
				break;
		}	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ManageOkButton) {
			statusFrame.setVisible(false);
		} else if (e.getSource() == CoinOkButton) {
			machine.coinStatusLabel.setText(coin.viewCoin());
			statusFrame.setVisible(false);
		}
	}
}
