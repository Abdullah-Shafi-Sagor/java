import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class home extends JFrame
{
	private JLabel label;
	private JTextField textfield;
	private JButton button;
	private ImageIcon on;
	
	public home()
	{
		//title
		super("Java N section");
		//label
		label=new JLabel("Enter Your Name");
		label.setBounds(50,50,200,30);
		
		textfield= new JTextField();
		textfield.setBounds(50,90,200,30);
		
		
		add(label);
		add(textfield);
		
		
		
		
		
		//layout,size
		setLayout(null);
		setSize(300,250);  //(width,height)
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		new home();
	}
}