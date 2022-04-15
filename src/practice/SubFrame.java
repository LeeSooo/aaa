package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 순서 6번부터 8번 중요함!!
public class SubFrame extends JFrame implements ActionListener 
{
	// 2. 패널 생성
	private JPanel panelCenter;						
	private JPanel panelSouth;
	
	// 3. 컴포넌트 생성
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfResult;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	// 8. 메인프레임의 정보를 서브프레임이 가져와서 수정하기
	private MainFrame mainFrame;

	public SubFrame(String title, MainFrame mainFrame) 					// (프레임의 기본 레이아웃은 BorderLayout!!)
	{
		// 8. 메인프레임의 정보를 서브프레임이 가져와서 수정하기
		this.mainFrame = mainFrame;
		mainFrame.setTitle("이건 내꺼~");
		
		// 1. 기본 세팅
		setTitle(title);							//	1. 프레임 제목
		//setDefaultCloseOperation(EXIT_ON_CLOSE);	//	1. 프레임 닫기 (서브 프레임은 쓰지 않는 게 좋음)
		setLocation(400, 200);						//	1. 프레임 위치
		setSize(300, 150);							//	1. 프레임 사이즈
		setResizable(false); 						// 	1. 프레임 크기 고정
		setLayout(new BorderLayout());				//	1. 프레임 배치
		
		// 2. 패널 세팅 (밑에 메서드부터 생성하기!!)
		setPanelCenter();
		setPanelSouth();
		
		// 1. 기본 세팅
		setVisible(true);							//	1. 프레임 화면 보이기
	}

	// 2. 패널 세팅									 	(패널의 기본 레이아웃은 FlowLayout!!)
	private void setPanelCenter() 
	{
		panelCenter = new JPanel();
		// panelCenter.setBackground(Color.RED);
		
		// 3. 컴포넌트 생성
		tf1 = new JTextField("5", 5);
		tf2 = new JTextField("5", 5);
		tfResult = new JTextField(5);
		
		// 4. 컨포넌트 패널에 삽입
		panelCenter.add(tf1);
		panelCenter.add(tf2);
		panelCenter.add(tfResult);
		
		// 2. 패널 세팅
		add(panelCenter, BorderLayout.CENTER);
	}

	// 2. 패널 세팅
	private void setPanelSouth()
	{
		panelSouth = new JPanel();
		// panelSouth.setBackground(Color.BLUE);
		
		// 3. 컴포넌트 생성
		btn1 = new JButton("계산");
		btn2 = new JButton("전송");
		btn3 = new JButton("닫기");
		
		// 4. 컨포넌트 패널에 삽입
		panelSouth.add(btn1);
		panelSouth.add(btn2);
		panelSouth.add(btn3);
		
		// 5. 버튼에 이벤트 생성
		btn1.addActionListener(this);
		
		// 2. 패널 세팅
		add(panelSouth, BorderLayout.SOUTH);
	}

	// 5. 버튼에 이벤트 생성
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object obj = e.getSource();
		
		// 6. 계산버튼을 누르면 계산 결과(tf1 + tf2)가 tfResult라는 텍스트 필드에 저장					(!!!!!! 중요 !!!!!!)
		// 	  (중요!!) getText(), setText()
		
		// (1) 문자열을 정수형으로 변경하는 방법
		// 		- int i = Integer.parseInt();
		// (2) 정수형을 문자열로 변경하는 방법
		// 		- (i + "")
		
		if(obj == btn1)
		{
			int result = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
			tfResult.setText(result + "");
		}
		
		// 8. 서브프레임의 버튼2를 누르면 메인프레임의 정보를 가져와서 수정하기
		if (obj == btn2)
		{
			mainFrame.setTitle("ABC");
			JTextField tt = mainFrame.getTf();
			tt.setText(tfResult.getText());
		}
	}
	
	// 7. get(), set() 설정 (Alt + Shift + S)
	public JButton getBtn3() {
		return btn3;
	}
	public JTextField getTfResult() {
		return tfResult;
	}
}
