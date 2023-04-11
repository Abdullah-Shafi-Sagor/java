import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Scanner;

public class login extends JFrame implements ActionListener {
    private JLabel label1;
    private JLabel label2;
    private JTextField textfield1;
    private JTextField textfield2;
    private JButton button;
	private FileReader reader;

    public login() {
        //title
        super("Java N section");
        //label1
        label1 = new JLabel("Enter Your Name:");
        label1.setBounds(50, 50, 200, 30);
        textfield1 = new JTextField();
        textfield1.setBounds(200, 50, 200, 30);

        //label2
        label2 = new JLabel("Enter Your Email:");
        label2.setBounds(50, 90, 200, 30);
        textfield2 = new JTextField();
        textfield2.setBounds(200, 90, 200, 30);

        button = new JButton("LogIn");
        button.setBounds(200, 150, 100, 30);
        button.addActionListener(this);

        add(label1);
        add(textfield1);
        add(label2);
        add(textfield2);
        add(button);

        //layout,size
        setLayout(null);
        setSize(600, 650); //(width,height)
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
         String name=textfield1.getText();
		  String email=textfield2.getText();
		  String user="Name:"+name+",Email:"+email; // Name:ss,Email:aa
		  BufferedReader bfreader=null;
		   String line;
		   int count=0;
			 try
			 {
				reader=new FileReader("SignUp.txt");
				bfreader=new BufferedReader(reader);
				while((line=bfreader.readLine())!=null)
				{
					if(line.equals(user))
					{
						count++;
					}	
				}
				
				if(count==1)
				{
					new home();
				}
				else
				{
					JOptionPane.showMessageDialog(this,"Enter Correct ID & Pass");
				}
				
			 }
			 catch(IOException ex)
			 {
				 JOptionPane.showMessageDialog(this,"Error");
			 }
		 }
         else
		 {
			 JOptionPane.showMessageDialog(this,"empty");
		 }

		 
        }
    

    public static void main(String[] args) {
        new login();
    }
}
