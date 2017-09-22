import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab9 extends JFrame {
	private JMenuBar menuBar = new JMenuBar();

	private JMenu  menu1 = new JMenu ("Gallons/Liters");
	private JMenuItem subMenu1 = new JMenuItem("Litters to Gallons");
	private JMenuItem subMenu2 = new JMenuItem("Gallons to liters");

	private JMenu menu2 = new JMenu("Pounds/Kilograms");
	private JMenuItem subMenu3 = new JMenuItem ("Pounds to kilograms");
	private JMenuItem subMenu4 = new JMenuItem("Kilograms to pounds");

	private JTextField text1 = new JTextField ("0");
	private JTextField text2 = new JTextField ("0");
	private JLabel label1 = new JLabel();
	private JLabel label2 = new JLabel();

	public Lab9() { 

		this.setLayout(null);
		this.setSize(600,300);
		this.setLocation(400,40);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 15);

		this.setJMenuBar(menuBar);
		menuBar.add(menu1);
		menuBar.add(menu2);


		menu1.setMnemonic(KeyEvent.VK_M);
		menu1.add(subMenu1);
		menu1.add(subMenu2);

		menu2.setMnemonic(KeyEvent.VK_C);
		menu2.add(subMenu3);
		menu2.add(subMenu4);

		text1.setSize(200,40 );
		text1.setLocation(90, 100);
		text1.setVisible(true);
		text1.setBackground(Color.white);
		text1.setForeground(Color.black);
		this.add(text1); 
		text1.setFont(font);


		label1.setSize(300,40 );
		label1.setLocation(90, 150);
		label1.setVisible(true); 
		this.add(label1); 
		label1.setFont(font);

		text2.setSize(200,40 );
		text2.setLocation(320, 100);
		text2.setVisible(true);
		text2.setForeground(Color.black);
		this.add(text2);
		text2.setFont(font);
		text2.setEditable(false);


		label2.setSize(300,40 );
		label2.setLocation(320, 150);
		label2.setVisible(true);
		this.add(label2);
		label2.setFont(font);


		ButtonListener ears1 = new ButtonListener(); 
		subMenu1.addActionListener(ears1); 

		ButtonListener2 ears2 = new ButtonListener2(); 
		subMenu2.addActionListener(ears2); 

		ButtonListener3 ears3 = new ButtonListener3(); 
		subMenu3.addActionListener(ears3); 

		ButtonListener4 ears4 = new ButtonListener4(); 
		subMenu4.addActionListener(ears4); 

		KListener lsnr = new KListener();
		text1.addKeyListener(lsnr);
	}

	public class KListener implements KeyListener {
		public void keyPressed(KeyEvent arg0) {
		}

		public void keyReleased(KeyEvent arg0) {
		}

		public void keyTyped(KeyEvent arg0) {
			label1.setText("");
			label2.setText("");
		}

	}


	public class ButtonListener implements ActionListener {   	
		public void actionPerformed(ActionEvent arg0) {
			try{
				String st = text1.getText();
				double x = Double.parseDouble( st );  

				if (x >=0){
					x=x*0.264172052;
					text2.setText(""+x);
					label1.setText("Liters");
					label2.setText("Gallons");
					label1.setForeground(Color.black);
				} else {
					label1.setText("No Negative Numbers");
					label1.setForeground(Color.red);

				}


			}catch(NumberFormatException e){
				label1.setText("Enter a Number");
				label1.setForeground(Color.red);
			}
		}

	}
	public class ButtonListener2 implements ActionListener {   	
		public void actionPerformed(ActionEvent arg0) {
			try{
				String st =text1.getText();
				double x = Double.parseDouble( st );
				if(x>=0){
					x = x *3.7854118;
					text2.setText(""+x);
					label1.setText("Gallons");
					label2.setText("Liters");
					label1.setForeground(Color.black);
				} else {
					label1.setText("No Negative Numbers");
					label1.setForeground(Color.red);

				}
			}catch(NumberFormatException e){
				label1.setText("Enter a Number");
				label1.setForeground(Color.red);
			}
		}
	}
	public class ButtonListener3 implements ActionListener {   	
		public void actionPerformed(ActionEvent arg0) {
			try{
				String st = text1.getText();
				double x = Double.parseDouble( st ); 

				if(x>=0){
					x=x*0.45359237;
					text2.setText(""+x);
					label1.setText("Pounds");
					label2.setText("Kilograms");
					label1.setForeground(Color.black);
				} else {
					label1.setText("No Negative Numbers");
					label1.setForeground(Color.red);

				}
			}catch(NumberFormatException e){
				label1.setText("Enter a Number");
				label1.setForeground(Color.red);
			}
		}
	}
	public class ButtonListener4 implements ActionListener {   	
		public void actionPerformed(ActionEvent arg0) {
			try{
				String st = text1.getText();
				double x = Double.parseDouble( st );   

				if(x>=0){
					x=x*2.2046226218487757;
					text2.setText(""+x);
					label1.setText("Kilograms");
					label2.setText("Pounds");
					label1.setForeground(Color.black);
				} else {
					label1.setText("No Negative Numbers");
					label1.setForeground(Color.red);

				}
			}catch(NumberFormatException e){
				label1.setText("Enter a Number");
				label1.setForeground(Color.red);
			}
		}
	}
}




