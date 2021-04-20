package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements KeyListener {

	private static int FPS = 60; // frames per second
	private static int delay = FPS / 1000;

	public static final int BOARD_WIDTH = 10, BOARD_HEIGHT = 20, BLOCK_SIZE = 30;
	private Timer looper;
	private Color[][] board = new Color[BOARD_HEIGHT][BOARD_WIDTH];

	private Shape[] shapes = new Shape[7];
	private Color[] colors = { Color.decode("#ed1c24"), Color.decode("#ff7f27"), Color.decode("#fff200"),
			Color.decode("#22b14c"), Color.decode("#00a2e8"), Color.decode("#a349a4"), Color.decode("#3f48cc") };
	
	private Shape currentShape;

	public Board() {

		shapes[0] = new Shape(new int[][] { { 1, 1, 1, 1 } // I shape;
		}, this, colors[0]);

		shapes[1] = new Shape(new int[][] { { 1, 1, 1 }, { 0, 1, 0 }, // T shape;
		}, this, colors[1]);

		shapes[2] = new Shape(new int[][] { { 1, 1, 1 }, { 1, 0, 0 }, // L shape;
		}, this, colors[2]);

		shapes[3] = new Shape(new int[][] { { 1, 1, 1 }, { 0, 0, 1 }, // J shape;
		}, this, colors[3]);

		shapes[4] = new Shape(new int[][] { { 0, 1, 1 }, { 1, 1, 0 }, // S shape;
		}, this, colors[4]);

		shapes[5] = new Shape(new int[][] { { 1, 1, 0 }, { 0, 1, 1 }, // Z shape;
		}, this, colors[5]);

		shapes[6] = new Shape(new int[][] { { 1, 1 }, { 1, 1 }, // O shape;
		}, this, colors[6]);
		
		currentShape = shapes[0];

		looper = new Timer(delay, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
				repaint(); // paintComponent gets called again
			}
		});
		looper.start();
	}

	private void update() {
		currentShape.update();
	}
	
	public void setCurrentShape()
	{
		currentShape = shapes[1];
		currentShape.reset();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// makes window background black
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());

		currentShape.render(g);
		
		
		for(int row = 0; row < board.length; row++)
		{
			for(int col = 0; col < board[row].length; col++)
			{
				if(board[row][col] != null)
				{
					g.setColor(board[row][col]);
					g.fillRect(col * BLOCK_SIZE, row * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
				}
			}
		}

		// draw the Board
		g.setColor(Color.white);
		for (int row = 0; row < BOARD_HEIGHT; row++) {
			g.drawLine(0, BLOCK_SIZE * row, BLOCK_SIZE * BOARD_WIDTH, BLOCK_SIZE * row);
		}

		for (int col = 0; col <= BOARD_WIDTH; col++) {
			g.drawLine(col * BLOCK_SIZE, 0, col * BLOCK_SIZE, BLOCK_SIZE * BOARD_HEIGHT);
		}

	}
	
	public Color[][] getBoard()
	{
		return this.board;
	}
	

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			currentShape.speedUp();
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			currentShape.moveRight();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			currentShape.moveLeft();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			currentShape.speedDown();
		}
	}

}
