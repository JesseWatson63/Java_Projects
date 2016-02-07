import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;

public class SimpleCalc {

    JFrame guiFrame;
    JPanel buttonPanel;
    JTextField numberCalc;
    int calcOperation = 0;
    int currentCalc;
    
    //Note: Typically the main method will be in a
    //separate class. As this is a simple one class
    //example it's all in the one class.
    public static void main(String[] args) {
     
         //Use the event dispatch thread for Swing components
         EventQueue.invokeLater(new Runnable()
         {
             
            @Override
             public void run()
             {
                 
                 new SimpleCalc();         
             }
         });
              
    }
    
    public SimpleCalc()
    {
        guiFrame = new JFrame();
        
        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Simple Calculator");
        guiFrame.setSize(300,300);
      
        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);
        
        numberCalc = new JTextField();
        numberCalc.setHorizontalAlignment(JTextField.RIGHT);
        numberCalc.setEditable(false);
        
        guiFrame.add(numberCalc, BorderLayout.NORTH);
        
        buttonPanel = new JPanel();
               
        //Make a Grid that has three rows and four columns
        buttonPanel.setLayout(new GridLayout(4,3));   
        guiFrame.add(buttonPanel, BorderLayout.CENTER);
        
        //Add the number buttons
        for (int i=1;i<10;i++)
        {
            addButton(buttonPanel, String.valueOf(i));
        }

        //Add the operation buttons
        JButton addButton = new JButton("+");
        addButton.setActionCommand("+");
        
        JButton subButton = new JButton("-");
        subButton.setActionCommand("-");
        
        JButton equalsButton = new JButton("=");
        equalsButton.setActionCommand("=");
        
        
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(equalsButton);
        guiFrame.setVisible(true);  
    }
    
    //All the buttons are following the same pattern
    //so create them all in one place.
    private void addButton(Container parent, String name)
    {
        JButton but = new JButton(name);
        but.setActionCommand(name);
        parent.add(but);
    }
    
}