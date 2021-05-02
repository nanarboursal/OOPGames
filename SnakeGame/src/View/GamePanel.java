package View;
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> creating basic MVC structure
=======

>>>>>>> fixing model
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
<<<<<<< HEAD
import Model.AppleModel;
import Model.KeyDetails;
import Model.SnakeModel;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 * 
 * Class: GamePanel.java
 * Purpose: Extends JPanel. Creates the game's panel, incorporating components like snake and apple 
 *
 */
public class GamePanel extends JPanel implements ActionListener {

	/**
	 * Numerical values for screen constants 
	 */
	
=======
import Controller.MyKeyAdapter;
import java.util.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener {

>>>>>>> creating basic MVC structure
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;

	// The board is divided into small squares, called units
	static final int UNIT_SIZE = 25;

<<<<<<< HEAD
<<<<<<< HEAD
	static final int GAME_UNITS = (SCREEN_WIDTH * (SCREEN_HEIGHT)) / UNIT_SIZE;
	static final int DELAY = 75;
	
	/**
	 * KeyAdapter to keep track of keys pressed
	 */
	MyKeyAdapter adapter = new MyKeyAdapter();
=======
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
=======
	static final int GAME_UNITS = (SCREEN_WIDTH * (SCREEN_HEIGHT)) / UNIT_SIZE;
>>>>>>> fixing model
	static final int DELAY = 75;

	/**
	 * Arrays for tracking x and y position of snake's body
	 */
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];

	int bodyParts = 6;

	int applesEaten = 0;
	int appleX = 0;
	int appleY = 0;

	MyKeyAdapter adapter = new MyKeyAdapter();
	public char direction = adapter.direction;
	boolean running = false;
>>>>>>> creating basic MVC structure

	Timer timer;
	Random random;

	JPanel scorePanel = new JPanel();
	JLabel scorelabel = new JLabel();
	/**
<<<<<<< HEAD
	 * UI elements and model objects
	 */
	JPanel scorePanel = new JPanel();
	JLabel scorelabel = new JLabel();
	
	AppleModel applemodel;
	SnakeModel snakemodel = new SnakeModel();
	BlockingQueue<KeyDetails> queue;
	KeyDetails keyDetail;
	
	boolean running = snakemodel.getRunning();
	char direction;

	/**
	 * 
	 * @param queue
	 * @param applemodel
	 * @param snakemodel
	 * 
	 * Constructor to initialize all models and queue
	 * Also sets the basic JPanel settings
	 */
	public GamePanel(BlockingQueue<KeyDetails> queue, AppleModel applemodel, SnakeModel snakemodel) {
		this.queue = queue;
		this.applemodel = applemodel;
		this.snakemodel = snakemodel;
		
		keyDetail = snakemodel.getKeyDetail();
		direction = keyDetail.getDirection();
		
		random = new Random();
		
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(adapter);
		startGame();
	}

	/**
	 * Starts game by setting "running" to true and starting timer
	 */
	public void startGame() {
		applemodel.newApple();
		snakemodel.setRunning(true);
=======
	 * Constructor
	 */
	public GamePanel() {

		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(adapter);

		startGame();
	}

	public void startGame() {
		newApple();
		running = true;
>>>>>>> creating basic MVC structure

		// Initialize timer with DELAY value and this keyword
		// because this class implements ActionListener
		timer = new Timer(DELAY, this);
		timer.start();
//		scorelabel.setText("score: " + applesEaten);
//		scorePanel.add(scorelabel);
//		scorePanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT-550));
//		this.add(scorePanel);
	}

<<<<<<< HEAD
	/**
	 * Paint component based on state of variable "running"
	 */
	public void paintComponent(Graphics g) {
		running = snakemodel.getRunning();
=======
	public void paintComponent(Graphics g) {
>>>>>>> creating basic MVC structure
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		if (running) {
<<<<<<< HEAD
			
			// Create grids
=======
>>>>>>> creating basic MVC structure
			for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
				g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
			}

			// Draw an apple
<<<<<<< HEAD
			g.setColor(Color.green);
			g.fillOval(applemodel.getAppleX(), applemodel.getAppleY(), UNIT_SIZE, UNIT_SIZE);

			// Draw the Snake body
			for (int i = 0; i < snakemodel.getBodyParts(); i++) {
				// Just snake head
				if (i == 0) {
					g.setColor(Color.orange);
					g.fillRect(snakemodel.getX()[i], snakemodel.getY()[i], UNIT_SIZE, UNIT_SIZE);
				}
				// Paint body
				else {
					g.setColor(new Color(45, 180, 0));
					g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
					g.fillRect(snakemodel.getX()[i], snakemodel.getY()[i], UNIT_SIZE, UNIT_SIZE);
=======
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

			// Draw the Snake body
			for (int i = 0; i < bodyParts; i++) {
				// Just snake head
				if (i == 0) {
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				} else {
					g.setColor(new Color(45, 180, 0));
					g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
>>>>>>> creating basic MVC structure
				}

			}
			g.setColor(Color.red);
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
<<<<<<< HEAD
			String text = "score: " + applemodel.getApples();
			g.drawString(text, (SCREEN_WIDTH - metrics.stringWidth(text)) / 2, g.getFont().getSize());

		} 
		// If running = false, game over
		else {
=======
			String text = "score: " + applesEaten;
			g.drawString(text, (SCREEN_WIDTH - metrics.stringWidth(text)) / 2, g.getFont().getSize());

		} else {
>>>>>>> creating basic MVC structure
			gameOver(g);
		}
	}
	
	public int getApples() {
		return applesEaten;
	}

<<<<<<< HEAD
	/**
	 * Game over when running is false
	 * Displays screen with score and game over sign
	 * @param g
	 */
=======
	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) ((SCREEN_HEIGHT-8)/ UNIT_SIZE)) * UNIT_SIZE;
	}

	public void move() {
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}

		// Switch case for all possible directions
		// Moving the 0th elements which represent the head
		switch (direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
		
		this.direction = adapter.direction;
	}

	public void checkApple() {

		// Examine coordinates of snake and apple
		if ((x[0] == appleX) && (y[0] == appleY)) {
			// If apple eaten, increment variables
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}

	public void checkCollisions() {

		// Checks if head collides with body
		for (int i = bodyParts; i > 0; i--) {
			if ((x[0] == x[i]) && (y[0] == y[i])) {
				running = false; // trigger game over
			}
		}

		// Checks if head touches left border
		if (x[0] < 0) {
			running = false;
		}

		// Checks if head touches right border
		if (x[0] > SCREEN_WIDTH) {
			running = false;
		}

		// Checks if head touches top border
		if (y[0] < 0) {
			running = false;
		}

		// Checks if head touches top border
		if (y[0] > SCREEN_HEIGHT) {
			running = false;
		}

		// If running is false, game over, timer stop
		if (!running) {
			timer.stop();
		}

	}

>>>>>>> creating basic MVC structure
	public void gameOver(Graphics g) {
		// Game over text to be displayed
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 75));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
<<<<<<< HEAD
<<<<<<< HEAD

		// Positioning string to be at the center of the screen
		String text = "GAME OVER x_x";
		g.drawString(text, (SCREEN_WIDTH - metrics1.stringWidth(text)) / 2, SCREEN_HEIGHT / 2);

		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		String score_text = "score: " + applemodel.getApples();
		g.drawString(score_text, (SCREEN_WIDTH - metrics2.stringWidth(score_text)) / 2, g.getFont().getSize());

	}

	/**
	 * Invoked when an action is performed
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// if running = true, go through the series of methods
		if (running) {
			snakemodel.move();
			applemodel.checkApple(snakemodel.getX(), snakemodel.getY(), snakemodel.getBodyParts());
			snakemodel.checkCollisions();
			running = snakemodel.getRunning();
		}
		// else repaint()
		repaint();
	}

	/**
	 * Class for KeyAdapter
	 *
	 */
	
	public class MyKeyAdapter extends KeyAdapter {

		/**
		 * Invoked when a key is pressed
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			queue.clear();
			// To avoid snake from making a 180 degree turn into itself,
			// case statements to prevent that and only then change direction variable
			switch (e.getKeyCode()) { // getKeyCode() returns corresponding numerical value of key pressed
			case KeyEvent.VK_LEFT:
				if (direction != 'R') {
					direction = 'L';
					keyDetail.setDirection(direction);
					try {
						queue.put(keyDetail);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				break;
			case KeyEvent.VK_RIGHT:
				if (direction != 'L') {
					direction = 'R';
					keyDetail.setDirection(direction);
					try {
						queue.put(keyDetail);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				break;
			case KeyEvent.VK_UP:
				if (direction != 'D') {
					direction = 'U';
					keyDetail.setDirection(direction);
					try {
						queue.put(keyDetail);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				break;
			case KeyEvent.VK_DOWN:
				if (direction != 'U') {
					direction = 'D';
					keyDetail.setDirection(direction);
					try {
						queue.put(keyDetail);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				break;
			}
		}
	}
} // end of class
=======
		
=======

>>>>>>> fixing model
		// Positioning string to be at the center of the screen
		String text = "GAME OVER x_x";
		g.drawString(text, (SCREEN_WIDTH - metrics1.stringWidth(text)) / 2, SCREEN_HEIGHT / 2);

		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		String score_text = "score: " + applesEaten;
		g.drawString(score_text, (SCREEN_WIDTH - metrics2.stringWidth(score_text)) / 2, g.getFont().getSize());

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();
	}

//	public class MyKeyAdapter extends KeyAdapter {
//
//		@Override
//		public void keyPressed(KeyEvent e) {
//
//			// To avoid snake from making a 180 degree turn into itself,
//			// case statements to prevent that and only then change direction variable
//			switch (e.getKeyCode()) { // getKeyCode() returns corresponding numerical value of key pressed
//			case KeyEvent.VK_LEFT:
//				if (direction != 'R') {
//					direction = 'L';
//				}
//				break;
//			case KeyEvent.VK_RIGHT:
//				if (direction != 'L') {
//					direction = 'R';
//				}
//				break;
//			case KeyEvent.VK_UP:
//				if (direction != 'D') {
//					direction = 'U';
//				}
//				break;
//			case KeyEvent.VK_DOWN:
//				if (direction != 'U') {
//					System.out.println("down key");
//					direction = 'D';
//				}
//				break;
//			}
//		}
//	}
}
>>>>>>> creating basic MVC structure
