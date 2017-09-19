import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CancelWindow extends JFrame implements ActionListener {
	JFrame cancelFrame;
	JButton okButton;
	JLabel cancelLabel;
	
	public CancelWindow(int j) {
		
		switch (j) {
			case 0 :
				cancelFrame = new JFrame("취소");
				cancelFrame.setBounds(400, 250, 300, 200);
				cancelFrame.getContentPane().setLayout(null);
				cancelFrame.setResizable(false);
				cancelFrame.setVisible(true);
				
				cancelLabel = new JLabel();
				cancelLabel.setText("<html>돈이 부족합니다.<br>돈을 투입해주세요.</html>");
				cancelLabel.setBounds(100, 30, 200, 45);
				cancelLabel.setVerticalAlignment(cancelLabel.BOTTOM);
				cancelFrame.getContentPane().add(cancelLabel);
				
				okButton = new JButton("확인");
				okButton.setBounds(110, 100, 80, 25);
				cancelFrame.getContentPane().add(okButton);
				okButton.addActionListener(this);
				break;
				
			case 1 :
				cancelFrame = new JFrame("취소");
				cancelFrame.setBounds(400, 250, 300, 200);
				cancelFrame.getContentPane().setLayout(null);
				cancelFrame.setResizable(false);
				cancelFrame.setVisible(true);
				
				cancelLabel = new JLabel();
				cancelLabel.setText("<html>잔량이 없습니다.<br>죄송합니다.</html>");
				cancelLabel.setBounds(100, 30, 200, 45);
				cancelLabel.setVerticalAlignment(cancelLabel.BOTTOM);
				cancelFrame.getContentPane().add(cancelLabel);
				
				okButton = new JButton("확인");
				okButton.setBounds(110, 100, 80, 25);
				cancelFrame.getContentPane().add(okButton);
				okButton.addActionListener(this);
				break;
				
			case 2 :
				cancelFrame = new JFrame("취소");
				cancelFrame.setBounds(400, 250, 300, 200);
				cancelFrame.getContentPane().setLayout(null);
				cancelFrame.setResizable(false);
				cancelFrame.setVisible(true);
				
				cancelLabel = new JLabel();
				cancelLabel.setText("<html>유효하지 않은 주민번호입니다.</html>");
				cancelLabel.setBounds(100, 30, 200, 45);
				cancelLabel.setVerticalAlignment(cancelLabel.BOTTOM);
				cancelFrame.getContentPane().add(cancelLabel);
				
				okButton = new JButton("확인");
				okButton.setBounds(110, 100, 80, 25);
				cancelFrame.getContentPane().add(okButton);
				okButton.addActionListener(this);
				break;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		cancelFrame.setVisible(false);
	}

}
