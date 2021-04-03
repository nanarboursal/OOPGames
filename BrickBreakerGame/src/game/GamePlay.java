package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel implements ActionListener, KeyListener{

	private boolean play = false;
	private int totalBricks = 21;
	private Timer timer;
	private int delay = 5;
	private int ballposX = 120;
	private int ballposY = 350;
	private int ballXdir = -1;
	private int ballYdir = -3;
	private int playerX = 350;
	
	public GamePlay() {
		//defining constructor
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(true);
		
		timer = new Timer(delay, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		//in built method
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
		
		//set border
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(0, 3, 3, 592);
		g.fillRect(691, 3, 3, 592);
		
		//bounce pad
		g.setColor(Color.cyan);
		g.fillRect(playerX, 550, 100, 8);
		
		//ball
		g.setColor(Color.red);
		g.fillOval(ballposX, ballposY, 20,20);
		
	}

	private void moveLeft() {
		playerX -=20;
	}
	
	private void moveRight() {
		playerX += 20;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
//			if(playerX <=0) {
//				playerX = 0;
//			}else {	
//				moveLeft();
//			}
			moveLeft();
		} 
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(playerX >=600) {
				playerX = 600;
			}else {	
				moveRight();
			}
		}
		
		repaint();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
}
