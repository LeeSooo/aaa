package Chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class correct_answer extends JFrame implements ActionListener, ItemListener
{
	public correct_answer()
	{
		// 기본 설정 7가지
		setTitle("Java 총 정리");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(800, 300);
		setResizable(true);
		setLayout(new BorderLayout()); 	// JFrame : BorderLayout()
		setVisible(true);				// JPanel : FlowLayout()
	
		// (1. JLabel 생성) ////////////////////////////////////////
				// 1-1. 이미지 레이블 생성
		ImageIcon img = new ImageIcon("images/apple.jpg");
		JLabel imgLb = new JLabel(img);
		add(imgLb);
				
				// 1-2. 문자열 레이블 생성
		JLabel textLb = new JLabel("문자열 레이블");
		add(textLb);
		
				// 1-3. 이미지 + 문자열 레이블 생성
		ImageIcon image = new ImageIcon("images/apple.jpg");
		JLabel lb = new JLabel("hi", image, SwingConstants.CENTER);
		add(lb);
					
		// (2. JButton 생성) ///////////////////////////////////////
		JButton btn = new JButton();
				// (1) 버튼 이미지 삽입
		ImageIcon image1 = new ImageIcon("images/apple.jpg");
		ImageIcon image2 = new ImageIcon("images/apple.jpg");
		ImageIcon image3 = new ImageIcon("images/apple.jpg");
				// (2) 버튼 상태에 따른 이미지 변화(디폴트, 마우스가 올라가 있는 상태, 버튼을 누른 상태)
		btn.setIcon(image1);
		btn.setRolloverIcon(image2);
		btn.setPressedIcon(image3);
				// (3) 버튼 이벤트 처리
		btn.addActionListener(this);
				// (4) 버튼 관련 메소드
		btn.setEnabled(false);
		add(btn);
		
		// *
		// (3. JCheckBox 생성) /////////////////////////////////////
				// (1) 문자열 배열 생성
		String[] strCB = {"사과", "배", "체리"};
				// (2) 체크박스 배열 생성
		JCheckBox[] cb = new JCheckBox[3]; 
				// (3) 체크박스 배열에 문자열 배열 삽입
		for(int i = 0; i < strCB.length; i++)
		{
			cb[i] = new JCheckBox(strCB[i]);
			cb[i].addItemListener(this);
			add(cb[i]);
		}
				
		// (4. JRadioButton 생성)  /////////////////////////////////
				// (1) 문자열 배열 생성
		String[] strbg = {"사과", "배", "체리"};
				// (2) 버튼 그룹 객체 생성
		ButtonGroup group = new ButtonGroup();
				// (3) 라디오버튼 배열 생성
		JRadioButton[] rb = new JRadioButton[3];	
				// (4) 버튼그룹에 라디오버튼 삽입
		for(int i = 0; i < rb.length; i++)
		{
			rb[i] = new JRadioButton(strbg[i]);
			rb[i].addItemListener(this);
			group.add(rb[i]);
			add(rb[i]);
		}
		
		// (5. JTextField 생성)  ///////////////////////////////////
		JTextField tf = new JTextField(5);	
		// 이벤트 처리
		tf.addActionListener(this);
		add(tf);
		
		// (6. JTextArea 생성)  ////////////////////////////////////
		JTextArea ta = new JTextArea(5, 5);
				// 스크롤바 생성
		JScrollPane sp = new JScrollPane(ta, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		add(sp);
		
		// - JTextField와 JTextArea 공통으로 알아야되는 메소드
		// ta.append(tf.getText());	// 정보 삽입 
		// tf.setText("");			// 빈칸 삽입
		// tf.requestFocus();		// 초점 다시 잡아주기?
		// ta.setLineWrap(true); 	// 벽에 닿으면 다음 줄로 이동
		
		// (7. JList<E> 생성)  /////////////////////////////////////
				// (1) 배열 생성 + 배열 초기화
		String[] strlist = {"사과", "배", "체리"};
				// (2) JList<E> 생성
		JList<String> list = new JList<String>(strlist);
		add(list);		
				
		// (8. JComboBox<E> 생성)  ////////////////////////////////
				// (1) 배열 생성 + 배열 초기화
		String[] strcb = {"사과", "배", "체리"};
				// (2) JComboBox<E> 생성
		JComboBox<String> combo = new JComboBox<String>(strcb);
		add(combo);
		
		// - JComboBox<E>가 알아야되는 이벤트리스너 문장
		// JComboBox<String> cb = (JComboBox<String>)e.getSource();
		// int index = cb.getSelectedIndex();
		// imgLabel.setIcon(images[index]);
		
		// (9. JMenuBar 생성)  ////////////////////////////////////
				// (1) 메뉴바 생성
		JMenuBar mb = new JMenuBar();
				// (2) 메뉴 생성
		JMenu menu = new JMenu("메뉴");
				// (3) 메뉴 아이템 생성
		JMenuItem load = new JMenuItem("Load");
		JMenuItem exit = new JMenuItem("Exit");
				// (4) 메뉴 아이템 삽입
		menu.add(load);
		menu.addSeparator();	// 분리선 생성
		menu.add(exit);
				// (5) 메뉴 삽입
		mb.add(menu);
				// (6) 메뉴바 삽입
		setJMenuBar(mb);
		
		// (10. JOptionPane 생성) ///////////////////////////////////////////////////////////
				// (1) 입력 다이얼로그
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
				// (2) 확인 다이얼로그
		int result = JOptionPane.showConfirmDialog(this,"계속 진행하시겠습니까?", "경고", 
				JOptionPane.YES_NO_OPTION);
		if(result == JOptionPane.CLOSED_OPTION) {}
		else if(result == JOptionPane.YES_OPTION) {}
		else {}
				// (3) 메시지 다이얼로그
		JOptionPane.showMessageDialog(this, "조심하세요.", "경고", JOptionPane.ERROR_MESSAGE);
		
		// (11. JToolBar 생성) //////////////////////////////////////////////////////////////
				// (1) JToolBar 생성
		JToolBar toolbar = new JToolBar();
				// (2) 이미지 생성
        ImageIcon iconSave = new ImageIcon("images/save.png");
        ImageIcon iconExit = new ImageIcon("images/exit.png");
        		// (3) 버튼 생성
        JButton btnSave = new JButton(iconSave);
        JButton btnExit = new JButton(iconExit);
        		// (4) 이벤트 생성
        btnSave.addActionListener(this);
        btnExit.addActionListener(this);
        		// (5) JToolBar 삽입
        toolbar.add(btnSave);
        toolbar.addSeparator();	// JToolBar 공간 삽입
        toolbar.add(btnExit);
	}
	
	public static void main(String[] args) 
	{
		new correct_answer();
	}
	
	// - 이벤트 처리 - ////////////////////////////////////////////////////////////////////////
	// 1. 액션 리스너
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object obj = e.getSource();	
	}
	// (중요!!) getText(), setText() => (Alt + Shift + S)
	
	// 		(1) 문자열을 정수형으로 변경하는 방법
	// 			- int i = Integer.parseInt();
	// 		(2) 정수형을 문자열로 변경하는 방법
	//			- (i + "")
	// - 시스템 종료 메소드
	//  System.exit(0);
	
	// 2. 아이템 리스너
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// (1) 체크박스 이벤트 처리
		int state = e.getStateChange();
		if(state == ItemEvent.SELECTED) {}
		// (2) 
		Object obj = e.getItem();
	}
}