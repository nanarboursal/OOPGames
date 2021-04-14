import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestFrame2 extends JFrame{

	public TestFrame2() {
		setLayout(new FlowLayout());
        add(new JLabel("2nd Frame"));
	}
	
}
