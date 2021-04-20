package tetris;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	
	public static final int BOARD_WIDTH = 10, BOARD_HEIGHT = 20, BLOCK_SIZE = 30;
	
	private int x = 4, y = 0; // initial spots of the shape
	
	private int normal = 600;
	private int fast = 50;
	private int delayTimeForMovement = normal;
	private long beginTime;

	private int deltaX = 0;
	private boolean collision = false;
	
	private int[][] coords;
	private Board board;
	private Color color;
	
	public Shape(int[][] coords, Board board, Color color)
	{
		this.coords = coords;
		this.board = board;
		this.color = color;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void reset()
	{
		this.x = 4;
		this.y = 0;
		collision = false;
	}
	
	public void update()
	{
		if(collision) {
			// Fill the color for the board
			for(int row = 0; row < coords.length; row++)
			{
				for(int col = 0; col < coords[0].length; col++)
				{
					if(coords[row][col] != 0)
					{
						board.getBoard()[y + row][x + col] = color;
					}
				}
			}
			
			// set current shape 
			board.setCurrentShape();
			
			return;
		}
		
		// check horizontal movement
		if (!((x + deltaX + coords[0].length) > 10) && !((x + deltaX) < 0)) {
			x += deltaX;
		}
		deltaX = 0;

		if (System.currentTimeMillis() - beginTime > delayTimeForMovement) {
			if (!(y + 1 + coords.length > BOARD_HEIGHT)) {
				y++; // moves tetris block to the bottom of the board
			} else {
				collision = true; // collides with the bottom
			}
			beginTime = System.currentTimeMillis();
		}
	}
	
	public void render(Graphics g)
	{
		// draw the Shape
		for (int row = 0; row < coords.length; row++) {
			for (int col = 0; col < coords[0].length; col++) {
				if (coords[row][col] != 0) {
					g.setColor(color);
					g.fillRect(col * BLOCK_SIZE + x * BLOCK_SIZE, row * BLOCK_SIZE + y * BLOCK_SIZE, BLOCK_SIZE,
							BLOCK_SIZE);
				}
			}
		}
	}
	
	public void speedUp()
	{
		delayTimeForMovement = fast;
	}
	
	public void speedDown()
	{
		delayTimeForMovement = normal;
	}
	
	public void moveRight()
	{
		deltaX = 1;
	}
	
	public void moveLeft()
	{
		deltaX = -1;
	}

}
