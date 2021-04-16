package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements KeyListener{
	
	private static int FPS = 60; // frames per second
	private static int delay = FPS / 1000;
	
	public static final int BOARD_WIDTH = 10, BOARD_HEIGHT = 20, BLOCK_SIZE = 30;
	private Timer looper;
	private Color[][] board = new Color[BOARD_WIDTH][BOARD_HEIGHT];
	
	private Color[][] shape = {
			{Color.red, Color.red, Color.red},
			{null, Color.red, null}
	};
	
	private int x = 4, y = 0; // initial spots of the shape
	
	private int normal = 600;
	private int fast = 50;
	private int delayTimeForMovement  = normal;
	private long beginTime;

	public Board() {
		looper = new Timer(delay, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(System.currentTimeMillis() - beginTime > delayTimeForMovement)
				{					
					y++; // moves tetris block to the bottom of the board
					beginTime = System.currentTimeMillis();
				}
				repaint(); // paintComponent gets called again
			}
		});
		looper.start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//makes window background black
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		// draw the Shape
		for(int row = 0; row < shape.length; row++)
		{
			for(int col = 0; col < shape[0].length; col++)
			{
				if(shape[row][col] != null) {
					g.setColor(shape[row][col]);
					g.fillRect(col * BLOCK_SIZE + x * BLOCK_SIZE, row * BLOCK_SIZE + y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
				}
			}
		}
		
		// draw the Board
		g.setColor(Color.white);
		for(int row = 0; row < BOARD_HEIGHT; row++)
		{
			g.drawLine(0, BLOCK_SIZE * row, BLOCK_SIZE * BOARD_WIDTH, BLOCK_SIZE * row);
		}
		
		for(int col = 0; col <= BOARD_WIDTH; col++)
		{
			g.drawLine(col * BLOCK_SIZE, 0, col * BLOCK_SIZE, BLOCK_SIZE * BOARD_HEIGHT);
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			delayTimeForMovement = fast;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			delayTimeForMovement = normal;
		}
	}

}
