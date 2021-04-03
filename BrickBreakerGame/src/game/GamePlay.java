package game;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePlay extends JPanel {

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
}
