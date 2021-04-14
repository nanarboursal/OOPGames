import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestFrame1 extends JFrame {

	public TestFrame1() {
		setLayout(new FlowLayout());
        add(new JLabel("1st Frame"));
	}
	
}
