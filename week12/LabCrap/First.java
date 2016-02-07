import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstGUI extends JFrame{
	public JLabel lblTemp = new JLabel("enter temperature:");
	public JTextField txtTemp = new JTextField(4);
	public JButton btnConvertCF=new JButton("C to F");
	public JButton btnConvertFC=new JButton("F to C");
	public JLabel lblResults = new JLabel("             ");

	public static void main(String args[]) {
		new FirstGUI();
		
	}
	FirstGUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		p2.add(btnConvertCF);
		p2.add(btnConvertFC);
		btnConvertCF.addActionListener(new CtoF());
		btnConvertFC.addActionListener(new ActionListener(){
   	 		public void actionPerformed(ActionEvent e) {
				double c;
				double f;
				try{
					f=Double.parseDouble(txtTemp.getText());
					c=(f*5/9)+32;
					lblResults.setText(c + " degrees centigrade");
				}
				catch (Exception ex){
        				lblResults.setText("invalid input");
				}
   	 		}

		    }
		);
		
		p.setLayout(new BorderLayout());
		p.add(BorderLayout.NORTH,lblTemp);
		p.add(BorderLayout.CENTER,txtTemp);
		p.add(BorderLayout.EAST,p2);

		p.add(BorderLayout.SOUTH,lblResults);
		
		/*
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(lblTemp);
		p.add(txtTemp);
		p.add(p2);

		p.add(lblResults);
		*/

		this.setContentPane(p);
		this.setSize(800, 250);
		setVisible(true);
	}

	public class CtoF implements ActionListener{
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
}