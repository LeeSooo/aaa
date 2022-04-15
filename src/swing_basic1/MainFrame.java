package swing_basic1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

	private JButton btn;
	private JTextField tf;
	private JButton btn2;
	private SubFrame sf;

	public MainFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(210, 25);
		setSize(200, 205);
		setLayout(new FlowLayout());
		
		btn = new JButton("Sub 호출");
		btn.addActionListener(this);
		tf = new JTextField(5);
		btn2 = new JButton("값 설정");
		btn2.addActionListener(this);
		
		
		add(btn);
		add(tf);
		add(btn2);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn) {
			sf = new SubFrame("서브 프레임", this); // (중요) sub 생성자로 main프레임 보내는 this
			JButton btn = sf.getBtn3();
			btn.setText("내꺼");
		}
		else if(obj == btn2)
		{
			JTextField tf = sf.getTfResult();
			tf.setText("555");
		}
	}

	public JTextField getTf() {
		return tf;
	}
	
}
