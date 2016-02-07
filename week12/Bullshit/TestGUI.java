import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestGUI extends JFrame implements ActionListener{

		
	public JLabel lblPlayer1 = new JLabel("Enter PLayer 1 Name");
	public JTextField txtPlayer1 = new JTextField(15);
	public JLabel lblPlayer2 = new JLabel ("Enter Player 2 Name:");
	public JTextField txtPlayer2 = new JTextField(15);
	public JButton btnGame=new JButton("ADD PLAYERS");
	public JButton btnRPS = new JButton("GET RPS");
	public JLabel lblDisplayPlayer1 = new JLabel("             ");
	public JLabel lblDisplayPlayer2 = new JLabel("             ");
	
	public JLabel lblDisplayRPSPlayer1 = new JLabel("          ");
	
	public static void main(String args[]) {
		new TestGUI();
	}

	public TestGUI() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		btnGame.addActionListener(this);
		btnRPS.addActionListener(this);
		p.add(lblPlayer1);
		p.add(lblPlayer2);
		p.add(txtPlayer1);
		p.add(txtPlayer2);
		p.add(btnGame);
		p.add(btnRPS);
		p.add(lblDisplayPlayer1);
		p.add(lblDisplayPlayer2);
		
		p.add(lblDisplayRPSPlayer1);
		
		
		this.getContentPane().add (p);
		this.setSize(800, 800);
		this.setVisible(true);		
	}
	


    public void actionPerformed(ActionEvent e) {
		
		
		String stringPlayer1 = " " ;
		stringPlayer1 = txtPlayer1.getText();
		lblDisplayPlayer1.setText("Player one is " + stringPlayer1);
		
		String stringPlayer2 = " " ;
		stringPlayer2 = txtPlayer2.getText();
		lblDisplayPlayer2.setText("Player two is " + stringPlayer2);
	
	}
	
}