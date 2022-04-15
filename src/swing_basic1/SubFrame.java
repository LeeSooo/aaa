package swing_basic1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SubFrame extends JFrame implements ActionListener {
	private JPanel panelCenter;
	private JPanel panelSouth;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfResult;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	private MainFrame mainFrame;	// (중요) 서브프레임에 메인프레임 저장
	
	public SubFrame(String title, MainFrame mainFrame) {
		this.mainFrame = mainFrame;		// (중요) 매인프레임의 정보를 받고 서브프레임에 저장하는 방법
		mainFrame.setTitle("이건 내꺼~"); // (중요)메인프레임 설정을 생성자를 통해서 할 수 있음.
		setTitle(title);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400, 25);
		setSize(300, 200);
		setLayout(new BorderLayout());
		
		setPanelCenter();
		setPanelSouth();
		
		setVisible(true);
	}

	private void setPanelCenter() {
		panelCenter = new JPanel();
		//panelCenter.setBackground(Color.RED);
		tf1 = new JTextField("5", 5);
		tf2 = new JTextField("10", 5);
		tfResult = new JTextField(5);
		tfResult.setEditable(false); /////////
		
		panelCenter.add(tf1);
		panelCenter.add(tf2);
		panelCenter.add(tfResult);
		
		add(panelCenter,BorderLayout.CENTER);
	}

	private void setPanelSouth() {
		panelSouth = new JPanel();
		//panelSouth.setBackground(Color.BLUE);
		
		btn1 = new JButton("계산");
		btn1.addActionListener(this);
		btn2 = new JButton("전송");
		btn3 = new JButton("닫기");
		
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		panelSouth.add(btn3);
		
		add(panelSouth,BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn1) {
			int result = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
			tfResult.setText(result+"");
		}
		else if(obj == btn2)
		{
			JTextField tf = mainFrame.getTf();
			tf.setText(tfResult.getText());
			mainFrame.setTitle("ABC~"); 
		}
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JTextField getTfResult() {
		return tfResult;
	}
	
	
	
}
