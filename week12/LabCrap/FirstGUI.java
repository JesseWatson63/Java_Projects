import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstGUI extends JFrame implements ActionListener{
	public JLabel lblTemp = new JLabel("enter temperature in centigrade:");
	public JTextField txtTemp = new JTextField(4);
	public JButton btnConvert=new JButton("Convert");
	public JLabel lblResults = new JLabel("             ");

	public static void main(String args[]) {
		new FirstGUI();
		
	}
	FirstGUI() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		btnConvert.addActionListener(this);
		p.add(lblTemp);
		p.add(txtTemp);
		p.add(btnConvert);
		p.add(lblResults);
		this.getContentPane().add (p);
		this.setSize(800, 100);
		
	}

    public void actionPerformed(ActionEvent e) {
	double c;
	double f;
	try{
		c=Double.parseDouble(txtTemp.getText());
		f=c*9/5+32;
		lblResults.setText(f + " degrees fahrenheit");
	}
	catch (Exception ex){
        		lblResults.setText("invalid input");
	}
    }
}