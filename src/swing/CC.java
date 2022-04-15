package swing;

import javax.swing.*;
import java.awt.*;

public class CC extends JFrame 
{
	public CC() 
	{
		setTitle("Container & Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GRAY);
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("OK"));
		setSize(400, 410);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		CC cc = new CC();
		
	}

}
