import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OKWindow extends JFrame implements ActionListener {
	JFrame okFrame;
	JLabel textLabel;
	JButton okButton;

	public OKWindow() {
		
		okFrame = new JFrame();
		okFrame.setBounds(500, 450, 300, 200);
		okFrame.getContentPane().setLayout(null);
		okFrame.setResizable(false);
		okFrame.setVisible(true);
		
		textLabel = new JLabel("재고가 늘었습니다.");
		textLabel.setBounds(100, 50, 200, 25);
		okFrame.getContentPane().add(textLabel);
		
		okButton = new JButton("확인");
		okButton.setBounds(110, 100, 80, 25);
		okFrame.getContentPane().add(okButton);
		okButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		okFrame.setVisible(false);
	}
}
