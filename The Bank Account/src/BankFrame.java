import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankFrame extends JFrame {

	
	public BankFrame() {
		
		JMenuBar menubar = new JMenuBar();
		
		JPanel overall = new  JPanel();
		CardLayout cl = new CardLayout();
		
		overall.setLayout(cl);
		//Savings
		JPanel savings = new JPanel();
		savings.add(new JLabel("This is Savings"));
		JButton buttonS= new JButton("Button Checking");
		savings.add(buttonS);
		
		JTextField saveText = new JTextField();
		savings.add(saveText);
		
		
		
		//Checking
		JPanel checkings = new JPanel();
		checkings.add(new JLabel("This is Checking"));
		JButton buttonC= new JButton("Button Savings");
		checkings.add(buttonC);
	
		JTextField checkText = new JTextField();
		checkings.add(checkText);
		
		overall.add(savings,"Panel Savings");
		overall.add(checkings,"Panel Checkings");
		cl.show(overall, "Panel Savings");
		
		setBounds(100,100,600,500);
		add(overall);
		setVisible(true);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		buttonS.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			cl.show(overall, "Panel Checkings");	
			}
		});
		
		
buttonC.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			cl.show(overall, "Panel Savings");	
			}
		});






	}
	public static void main(String[] args) {
		new BankFrame();
	}
}
