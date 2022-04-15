package Chapter10;

import java.awt.*;
import javax.swing.*;

public class chapter10 extends JFrame 
{
	JLabel one = new JLabel("1. 이미지 레이블"); 	JLabel two = new JLabel("2, 문자열 레이블");	JLabel three = new JLabel("3. 이미지 + 문자열 레이블");
	JLabel four = new JLabel("4. 버튼"); 			JLabel five = new JLabel("5. 체크박스"); 		JLabel six = new JLabel("6. 라디오버튼"); 
	JLabel seven = new JLabel("7. 텍스트필드"); 	JLabel eghit = new JLabel("8. 텍스트에리어");	JLabel nine = new JLabel("9. 리스트");
	JLabel ten = new JLabel("10. 콤보박스");
	
	public chapter10()
	{
		setTitle("Chapter10 총 정리");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 300);
		setSize(800, 400);
		setLayout(new FlowLayout());
		setResizable(true);
		
// (1. JLabel 생성) //////////////////////////////////////////////////////////////////
		
		// 1-1. 이미지 레이블 생성
		add(one);
		ImageIcon image = new ImageIcon("images/apple.jpg");
		JLabel imgLabel  = new JLabel(image);
		add(imgLabel);
		
		// 1-2. 문자열 레이블 생성
		add(two);
		JLabel textLabel = new JLabel("안녕");
		add(textLabel);
		
		// 1-3. 이미지 + 문자열 레이블 생성
		add(three);
		ImageIcon image1 = new ImageIcon("images/apple.jpg");
		JLabel label = new JLabel("hi", image1, SwingConstants.CENTER);
		add(label);
		
// (2. JButton 생성) //////////////////////////////////////////////////////////////////
		add(four);
		JButton btn = new JButton();
		
		// 버튼 상태에 따른 이미지 변화
		btn.setIcon(image);
		btn.setRolloverIcon(image);
		btn.setPressedIcon(image);
		add(btn);
		
// (3. JCheckBox 생성) //////////////////////////////////////////////////////////////////
		// 아이템 이벤트 처리
		add(five);
		JCheckBox cb = new JCheckBox();
		
		// 체크박스 선택 상태
		cb.setSelected(true);
		
		// 체크박스 배열 처리
		JCheckBox[] ch = new JCheckBox[3];
		String[] names = {"사과", "배", "체리"};
		for(int i = 0; i<ch.length; i++)
		{
			ch[i] = new JCheckBox(names[i]);
			ch[i].addItemListener(null);
			add(ch[i]);
		}
		
// (4. JRadioButton 생성)  //////////////////////////////////////////////////////////////////
		// 아이템 이벤트 처리
		add(six);
		ButtonGroup group = new ButtonGroup();
		JRadioButton[] radio = new JRadioButton[3];
		for(int i = 0; i < radio.length; i++)
		{
			radio[i] = new JRadioButton();
			group.add(radio[i]);
			add(radio[i]);
		}
		
// (5. JTextField 생성)  //////////////////////////////////////////////////////////////////
		add(seven);
		JTextField tf = new JTextField(5);
		add(tf);
		
// (6. JTextArea 생성)  //////////////////////////////////////////////////////////////////
		add(eghit);
		JTextArea ta = new JTextArea(3, 5);
		JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(sp);
		
// (7. JList<E> 생성)  //////////////////////////////////////////////////////////////////
		add(nine);
		String[] str = {"가", "나", "다"};
		JList<String> list = new JList<String>(str);
		add(list);
		
// (8. JComboBox<E> 생성)  //////////////////////////////////////////////////////////////////
		add(ten);
		JComboBox<String> combo = new JComboBox<String>(str);
		add(combo);
		
// (9. JMenuBar 생성)  //////////////////////////////////////////////////////////////////
				// 메뉴바 생성
		JMenuBar mb = new JMenuBar();
				// 메뉴 생성
		JMenu menu = new JMenu("메뉴");
				// 메뉴 아이템 생성
		JMenuItem load = new JMenuItem("Load");
		JMenuItem exit = new JMenuItem("Exit");
				// 메뉴 아이템 삽입
		menu.add(load);
		menu.addSeparator();
		menu.add(exit);
				// 메뉴 삽입
		mb.add(menu);
				// 메뉴바 삽입
		setJMenuBar(mb);
		
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new chapter10();
	}

}
