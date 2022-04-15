package swing;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JPanel {
	private JLabel la = new JLabel("좋아하는 프로그램");
	public CheckBox() {
		Container cb = new Container();
		cb.setLayout(new FlowLayout());
		cb.setBackground(Color.GREEN);
		
		JCheckBox jp = new JCheckBox("Java 프로그램");
		JCheckBox cp = new JCheckBox("C++ 프로그램");
		
		cb.add(la);
		cb.add(jp);
		cb.add(cp);
		
		setSize(170,200);
		setVisible(true);
	}
}
