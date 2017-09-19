import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumberCheck implements ActionListener {


	int [] userNumber = new int[13];
	int [] checkNum = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
	int sum = 0;
	String str;
	JFrame checkFrame;
	JLabel textLabel;
	JButton checkButton;
	TextField checkField;
	CancelWindow cancel;
	ProductWindow window;
	ProductManager manager;
	Sound sound = new Sound();
	Coin coin;
	User user;
	
	public NumberCheck(ProductWindow window, User user, ProductManager manager, Coin coin) {
		this.window = window;
		this.coin = coin;
		this.manager = manager;
		this.user = user;
	}
	
	public void numberCheck() {		
		checkFrame = new JFrame("주민번호 확인");
		checkFrame.setBounds(500, 450, 300, 200);
		checkFrame.getContentPane().setLayout(null);
		checkFrame.setResizable(false);
		checkFrame.setVisible(true);
		
		textLabel = new JLabel();
		textLabel.setText("주민번호를 입력해주세요.");
		textLabel.setBounds(70, 38, 158, 40);
		checkFrame.getContentPane().add(textLabel);
		
		checkField = new TextField();
		checkField.setBounds(23, 102, 158, 25);
		checkFrame.getContentPane().add(checkField);
		
		checkButton = new JButton("확인");
		checkButton.setBounds(202, 102, 80, 25);
		checkFrame.getContentPane().add(checkButton);
		checkButton.addActionListener(this);
		
	}
	
	public boolean numberChecking() {
		
		for (int i = 0; i < 13; i++) {
			char value = str.charAt(i);
			userNumber[i] = Character.getNumericValue(value);
		}
		
		for (int i = 0; i < 6; i++) {
            sum += userNumber[i] * checkNum[i];
        }
        for (int i = 6; i < 12; i++ ) {
            sum += userNumber[i] * checkNum[i];
        }
		
        if ( ( 11 - (sum % 11) ) % 10  == userNumber[12] ) {
        	if (userNumber[1] <= 7 && (userNumber[0] <= 9 && userNumber[0] >= 3)) {
        		return true;        		
        	} else {
        		return false;
        	}
        } else {
        	return false;
        }
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		checkFrame.setVisible(false);
		str = checkField.getText();		
		if (numberChecking() == true) {
			sound.playSound(1);
			manager.drawBeer(user, coin);
			window.productFrame.setTitle("맥주");
			textLabel = new JLabel("맥주가 나왔습니다!!!");
			textLabel.setBounds(100, 50, 200, 25);
			window.productFrame.getContentPane().add(textLabel);
			window.productFrame.setVisible(true);
		} else {
			cancel = new CancelWindow(2);
		}
		
	}
}
