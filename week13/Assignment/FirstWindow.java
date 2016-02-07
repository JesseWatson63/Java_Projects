import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class FirstWindow extends JFrame {
	String s;
	JTextField  textField;
	JLabel label;
	JTextArea textArea;
	int money = 0;
	int balance = 0;
	
	static ArrayList<Integer> deposit = new ArrayList<Integer>();
	
	public FirstWindow() {

		super("Bank Account");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel(new GridBagLayout());
		
		JButton b = new JButton("Deposit");
		JButton c = new JButton("Check Balance");
		
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				money = Integer.parseInt(textField.getText());
				if(money > 0){
				deposit.add(money);
				JOptionPane.showMessageDialog(null, "You deposited " + money + " dollars");
				} else {
				JOptionPane.showMessageDialog(null, "Please enter a Positive amount");
				}
			}
		});
		
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent F) {
			int sum = 0;
			for(int i = 0; i < deposit.size(); i++){
				sum += deposit.get(i);
			}
			label.setText("Your total available balance is :" +String.valueOf(sum));
			}
		});
		p1.add(b);
		p1.add(c);
		
		label = new JLabel();
		textArea = new JTextArea("Enter Dollar Amount");
		textField = new JTextField("$.$$");
			
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(1,1,1,1);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		p3.add(label, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		p3.add(textArea, gbc);
		gbc.gridx = 3;
		gbc.gridy = 3;
		p3.add(textField, gbc);
		
		add(p1, BorderLayout.SOUTH);
		add(p2, BorderLayout.NORTH);	
		add(p3);
	}
}