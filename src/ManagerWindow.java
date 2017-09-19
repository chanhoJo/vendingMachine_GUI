import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ManagerWindow extends JFrame implements ActionListener {
	JFrame managerFrame;
	//증가 버튼, 뽑힌 물품 현황 버튼, 남은 물품현황
	JButton increaseButton, drawStatusButton, remainStatusButton, incomeStatusButton;
	JComboBox combo;
	JLabel textJabel;
	TextField amount;
	ProductManager manager;
	User user;
	
	public ManagerWindow(User user, ProductManager manager) {
		this.manager = manager;
		this.user = user;
		
		managerFrame = new JFrame("관리");
		managerFrame.setBounds(400, 250, 500, 300);
		managerFrame.getContentPane().setLayout(null);
		managerFrame.setResizable(false);
		managerFrame.setVisible(true);
		
		combo = new JComboBox();
		combo.setBounds(50, 200, 100, 25);
		combo.addItem("콜라");
		combo.addItem("사이다");
		combo.addItem("이온음료");
		combo.addItem("쥬스");
		combo.addItem("커피");
		combo.addItem("물");
		combo.addItem("맥주");
		managerFrame.getContentPane().add(combo);
		
		amount = new TextField();
		amount.setBounds(200, 200, 100, 25);
		managerFrame.getContentPane().add(amount);
		
		increaseButton = new JButton("증가");
		increaseButton.setBounds(350, 200, 80, 25);
		managerFrame.getContentPane().add(increaseButton);
		increaseButton.addActionListener(this);
		
		drawStatusButton = new JButton("제품 판매 현황");
		drawStatusButton.setBounds(40, 50, 130, 100);
		managerFrame.getContentPane().add(drawStatusButton);
		drawStatusButton.addActionListener(this);
		
		remainStatusButton = new JButton("제품 잔량 현황");
		remainStatusButton.setBounds(170, 50, 130, 100);
		managerFrame.getContentPane().add(remainStatusButton);
		remainStatusButton.addActionListener(this);
		
		incomeStatusButton = new JButton("수입 현황");
		incomeStatusButton.setBounds(300, 50, 130, 100);
		managerFrame.getContentPane().add(incomeStatusButton);
		incomeStatusButton.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == increaseButton) {
			OKWindow ok = new OKWindow();
			//제품 증가변수에 TextField의 값을 전달
			manager.increaseAmount = Integer.parseInt(amount.getText());
			
			if (combo.getSelectedItem() == "콜라") {
				manager.increaseCoke();
				
			} else if (combo.getSelectedItem() == "사이다") {
				manager.increaseSprite();
				
			} else if (combo.getSelectedItem() == "이온음료") {
				manager.increaseSportsDrink();
				
			} else if (combo.getSelectedItem() == "쥬스") {
				manager.increaseJuice();
				
			} else if (combo.getSelectedItem() == "커피") {
				manager.increaseCoffee();
				
			} else if (combo.getSelectedItem() == "물") {
				manager.increaseWater();
				
			} else if (combo.getSelectedItem() == "맥주") {
				manager.increaseBeer();
			}
		} else if (e.getSource() == drawStatusButton) {
			StatusWindow status = new StatusWindow(0, user, manager);
		} else if (e.getSource() == remainStatusButton) {
			StatusWindow status = new StatusWindow(1, user, manager);
		} else if (e.getSource() == incomeStatusButton) {
			StatusWindow status = new StatusWindow(2, user, manager);
		}
	}
}
