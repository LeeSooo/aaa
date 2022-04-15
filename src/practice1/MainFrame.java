package practice1;

import java.awt.FlowLayout;

import javax.swing.*;

public class MainFrame extends JFrame
{
	public MainFrame() 
	{
		setTitle("메인 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(300, 150);
		setResizable(false);
		setLayout(new FlowLayout());
		
		
		
		setVisible(true);
	}
}
