package tetris;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TetrisMain extends Canvas implements Runnable, KeyListener {

	public static final int WIDTH = 400, HEIGHT = 565;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tetris");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null); // puts it in the middle of the screen
		frame.setResizable(false);
		frame.setLayout(null); // leaves positioning up to me
		
		// MENU AND MENU BAR
		JMenuBar bar = new JMenuBar();
		bar.setBounds(0, 0, WIDTH, 25);
		JMenu file = new JMenu("File");
		file.setBounds(0, 0, 45, 24);
		bar.add(file);
		
		
		// MENU ITEMS
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				// Code for new game! eventually
				System.out.println("Starting new game woohoo!");
			}
		});
		
		JMenuItem highScore = new JMenuItem("High Score");
		highScore.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int highscore = 0; // replace with getHighScore method later
				JFrame alert = new JFrame("High Score");
				alert.setSize(200, 150);
				alert.setLayout(null);
				alert.setLocationRelativeTo(null);
				
				JLabel score = new JLabel("HIGH SCORE: "+ highscore);
				score.setBounds(50, 10, 200, 50);
				
				JButton okayButton = new JButton("Okay");
				okayButton.setBounds(50, 80, 100, 30);
				okayButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						alert.dispose();
					}
				});
				
				alert.add(okayButton);
				alert.add(score);
				alert.setResizable(false);
				alert.setVisible(true);
			}
		});
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Closing ...");
				System.exit(0);
			}
		});
		file.add(newGame);
		file.add(highScore);
		file.add(exit);
		
		// TETRIS MAIN
		TetrisMain tm = new TetrisMain();
		tm.setBounds(0, 25, WIDTH, HEIGHT-25); // sets the position
		
		frame.add(tm);
		frame.add(bar);
		frame.setVisible(true);
		tm.start();
	}

	public void start() {
		Thread t = new Thread(this);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}

	public void run() {
		boolean running = true;
		while (running) {
			update();
			BufferStrategy buf = getBufferStrategy();
			if (buf == null) {
				createBufferStrategy(3);
				// made for not having jumpy rendering, screen won't flash
				continue;
			}
			Graphics2D g = (Graphics2D) buf.getDrawGraphics();
			render(g);
			buf.show();
		}
	}

	public void update() {

	}

	public void render(Graphics2D g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.white);
		g.setFont(new Font("Roboto", Font.BOLD, 20));
		g.drawString("Tetris", 170, 50);
	}

	// Called when key is pressed down
	public void keyPressed(KeyEvent e) {

	}

	// Called when you press and release a key
	public void keyTyped(KeyEvent e) {

	}

	// Called when you released a key
	public void keyReleased(KeyEvent e) {

	}

}
