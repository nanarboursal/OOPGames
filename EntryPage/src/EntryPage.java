import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EntryPage extends JFrame {

	// JFrame
	static JFrame main;

	// JButton
	static JButton game1, game2, game3;

	// label to display text
	static JLabel label;

	public static void main(String args[]) {

		// JFrame creation
		main = new JFrame("OOP Games :O");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(400, 600);

		// Adding label
		label = new JLabel("Welcome!");

		// Jbutton creation and Action Listeners
		JButton game1 = new JButton("game 1");
		JButton game2 = new JButton("game 2");
		JButton game3 = new JButton("game 3");
		
		game1.setSize(200,200);

		game1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame jf2 = new TestFrame1();
				jf2.setVisible(true);
				jf2.setSize(600, 600);
				jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});

		game2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame jf = new TestFrame2();
				jf.setVisible(true);
				jf.setSize(200, 200);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});

		game3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame jf2 = new TestFrame1();
				jf2.setVisible(true);
				jf2.setSize(200, 200);
				jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});

		game1.setSize(500, 500);
		game1.setVisible(true);

		game2.setSize(500, 500);
		game2.setVisible(true);

		main.add(new MenuPanel(game1, game2, game3));
		main.setLocationRelativeTo(null);
		main.setVisible(true);
	}
}
