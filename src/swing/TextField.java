package swing;

import javax.swing.*;
import java.awt.*;

public class TextField extends JPanel{
		private JLabel ID = new JLabel("Type ID");
		private JLabel PW = new JLabel("Type Password");
		
		public TextField() {
			Container tf = new Container();
			tf.setLayout(new FlowLayout());
			tf.setBackground(Color.YELLOW);
			
			tf.add(ID);
			tf.add(new JTextField(10));
			tf.add(PW);
			tf.add(new JTextField(10));
			
			setSize(170,200);
			setVisible(true);
		}
}
