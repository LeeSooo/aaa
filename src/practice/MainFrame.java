package practice;

// 콘트롤 + 쉬프트 + 5 : 누르면 정리된다는데 잘 모르겠당!
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 순서 4번, 5번 중요!!
public class MainFrame extends JFrame implements ActionListener 
{
	private JButton btn;							// 2. 버튼 지역변수
	private JTextField tf;							// 2. 텍스트 필드 지역변수
	private JButton btn2;
	private SubFrame sf;

	public MainFrame(String title) 
	{
		// 1. 기본 세팅 (7가지)
		setTitle(title);							//	1. 프레임 제목
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//	1. 프레임 닫기
		setLocation(200, 200);						//	1. 프레임 위치
		setSize(300, 200);							//	1. 프레임 사이즈
		setResizable(false); 						// 	1. 프레임 크기 고정
		setLayout(new FlowLayout());				//	1. 프레임 배치
		
		// 2. 컴포넌트 생성 
		btn = new JButton("Sub 호출");				// 2. 버튼 생성
		tf = new JTextField(5);						// 2. 텍스트 필드 생성	
		add(btn);									// 2. 버튼 추가
		add(tf);									// 2. 텍스트 필드 추가
		
		// 3. 이벤트 생성
		btn.addActionListener(this);
		
		// 5. subFrame 안에 있는 텍스트 필드에 임위적으로 값 집어넣기
		btn2 = new JButton("값 설정");
		btn2.addActionListener(this);
		add(btn2);
		
		// 1. 기본 세팅
		setVisible(true);							//	1. 프레임 화면 보이기
	}
	
	// 3. 이벤트 생성
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object obj = e.getSource();					// 3. 소스 값을 받아서 obj에 저장
		if(obj == btn) 
		{	
			// 4. 버튼을 누르면 서브프레임의 정보를 받아들이기
			sf = new SubFrame("서브프레임", this);		// (중요!!) this
			
			JButton btn = sf.getBtn3();
			btn.setText("내꺼");
		}
		
		// 5. 메인프레임에 있는 버튼2를 누르면, 서브프레임 안에 있는 텍스트 필드에 임위적으로 값 집어넣기
		else if(obj == btn2)
		{
			JTextField tf = sf.getTfResult();
			tf.setText("555");
		}
	}
	
	// 6. 메인프레임에 있는 텍스트 필드 정보를 서브프레임에게 보내준다.
	public JTextField getTf() {
		return tf;
	}
	
}
