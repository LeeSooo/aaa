package cc;

import javax.swing.*;
import java.awt.*;

public class CC extends JFrame 
{
	private JLabel ID = new JLabel("Type ID");			// TextField()에 사용될 JLabel
	private JLabel PW = new JLabel("Type Password");	// TextField()에 사용될 JLabel
	private JLabel la = new JLabel("좋아하는 프로그램");		// CheckBox()에 사용될 JLabel
	
	// JFrame (최상위 컨테이너)
	public CC() 
	{
		setTitle("Container & Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel bt = Button();
		c.setLayout(new FlowLayout());
		
		c.add(bt);
		setSize(305,225);
		setResizable(false);
		setVisible(true);
	}
	
	// JPanel (ID, PW)
	public JPanel TextField() 
	{
		JPanel tf = new JPanel();
		tf.setLayout(new FlowLayout(FlowLayout.CENTER));
		tf.setBackground(Color.YELLOW);
		
		tf.add(ID);
		tf.add(new JTextField(10));
		tf.add(PW);
		tf.add(new JTextField(10));
		tf.setPreferredSize(new Dimension(130,140));
		
		return tf;
	}
	
	// JPanel (좋아하는 프로그램)
	public JPanel CheckBox()
	{
		JPanel cb = new JPanel();
		
		cb.setLayout(new FlowLayout(FlowLayout.CENTER));
		cb.setBackground(Color.GREEN);
		
		JCheckBox jp = new JCheckBox("Java 프로그램");
		JCheckBox cp = new JCheckBox("C++ 프로그램");
			
		cb.add(la);
		cb.add(jp);
		cb.add(cp);
		cb.setPreferredSize(new Dimension(130,140));
		
		return cb;
	}
	
	// JPanel (OK버튼)
	public JPanel Button() 
	{
		JPanel cb = CheckBox();
		JPanel tf = TextField();
		JPanel bt = new JPanel();
		
		bt.setLayout(new FlowLayout());
		bt.setBackground(Color.GRAY);
		bt.add(tf);
		bt.add(cb);
		bt.add(new JButton("OK"));
		bt.setPreferredSize(new Dimension(290,200));
		return bt;
	}
	
	public static void main(String[] args) 
	{
		new CC();
	}

}