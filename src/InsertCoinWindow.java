import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InsertCoinWindow extends JFrame implements ActionListener {
	
	JFrame insertCoinFrame;
	JButton oneHundButton, fiveHundButton, oneThosButton, returnButton, okButton;
	StatusWindow status;
	User user;
	Coin coin;
	Sound sound = new Sound();
	VendingMachine machine;
	
	public InsertCoinWindow(User user, Coin coin, VendingMachine machine) {
		this.user = user;
		this.coin = coin;
		this.machine = machine;
		
		insertCoinFrame = new JFrame("동전 투입");
		insertCoinFrame.setBounds(450, 200, 420, 250);
		insertCoinFrame.getContentPane().setLayout(null);
		insertCoinFrame.setResizable(false);
		insertCoinFrame.setVisible(true);
		
		oneHundButton = new JButton();
		oneHundButton = new JButton("<html>100원<br>투입");
		oneHundButton.setBounds(35, 50, 85, 100);
		insertCoinFrame.getContentPane().add(oneHundButton);
		oneHundButton.addActionListener(this);
		
		fiveHundButton = new JButton();
		fiveHundButton = new JButton("<html>500원<br>투입");
		fiveHundButton.setBounds(120, 50, 85, 100);
		insertCoinFrame.getContentPane().add(fiveHundButton);
		fiveHundButton.addActionListener(this);
		
		oneThosButton = new JButton();
		oneThosButton = new JButton("<html>1000원<br>투입");
		oneThosButton.setBounds(205, 50, 85, 100);
		insertCoinFrame.getContentPane().add(oneThosButton);
		oneThosButton.addActionListener(this);
		
		returnButton = new JButton();
		returnButton = new JButton("반환");
		returnButton.setBounds(290, 50, 85, 100);
		insertCoinFrame.getContentPane().add(returnButton);
		returnButton.addActionListener(this);
		
		okButton = new JButton("확 인");
		okButton.setBounds(160, 180, 100, 30);
		insertCoinFrame.getContentPane().add(okButton);
		okButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == oneHundButton) {
			sound.playSound(0);
			coin.insertCoin(1, user);
			status = new StatusWindow(3, coin, machine);
		} else if (e.getSource() == fiveHundButton) {
			sound.playSound(0);
			coin.insertCoin(2, user);
			status = new StatusWindow(3, coin, machine);
		} else if (e.getSource() == oneThosButton) {
			coin.insertCoin(3, user);
			status = new StatusWindow(3, coin, machine);
		} else if (e.getSource() == returnButton) {
			sound.playSound(0);
			coin.returnCoin(user);
			status = new StatusWindow(3, coin, machine);
		} else if (e.getSource() == okButton) {
			insertCoinFrame.setVisible(false);
			
		}
	}
}
