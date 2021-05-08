package Model;

<<<<<<< HEAD
/**
 * 
 * Class: SnakeModel.java
 * Purpose: 
 */

public class SnakeModel {
	
	/**
	 * Numerical values for screen constants 
	 */
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	
=======
public class SnakeModel {
	
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;

	// The board is divided into small squares, called units
>>>>>>> Finishes MVC
	static final int UNIT_SIZE = 25;

	static final int GAME_UNITS = (SCREEN_WIDTH * (SCREEN_HEIGHT)) / UNIT_SIZE;
	static final int DELAY = 75;
	
	/**
	 * Arrays for tracking x and y position of snake's body
	 */
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];


<<<<<<< HEAD
	/**
	 * Initializing snake parts and running state 
	 */
	int bodyParts = 4;
	boolean running = false;
	
	/**
	 * Initializing direction
	 */
	KeyDetails keyDetail = new KeyDetails('R');
	char direction = keyDetail.getDirection();
	
	/**
	 * Getter for running
	 * @return running
	 */
=======
	int bodyParts = 4;
	
	boolean running = false;
	
	KeyDetails keyDetail = new KeyDetails('R');
	char direction = keyDetail.getDirection();
	
>>>>>>> Finishes MVC
	public boolean getRunning() {
		return running;
	}
	
<<<<<<< HEAD
	/**
	 * Setter for running
	 * @param running
	 */
=======
>>>>>>> Finishes MVC
	public void setRunning (boolean running) {
		this.running = running;
	}

<<<<<<< HEAD
	/**
	 * Getter for bodyParts
	 * @return bodyParts
	 */
=======
>>>>>>> Finishes MVC
	public int getBodyParts() {
		return bodyParts;
	}
	
<<<<<<< HEAD
	/**
	 * Setter for bodyParts
	 * @param bodyParts
	 */
=======
>>>>>>> Finishes MVC
	public void setBodyParts(int bodyParts) {
		this.bodyParts = bodyParts;
	}
	
<<<<<<< HEAD
	/**
	 * Getter for keyDetail
	 * @return keyDetail
	 */
=======
>>>>>>> Finishes MVC
	public KeyDetails getKeyDetail() {
		return this.keyDetail;
	}

<<<<<<< HEAD
	/**
	 * Setter for direction
	 * @param direction
	 */
=======
	
>>>>>>> Finishes MVC
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
<<<<<<< HEAD
	/**
	 * Getter for x coordinates of snake
	 * @return x[]
	 */
=======
>>>>>>> Finishes MVC
	public int[] getX() {
		return x;
	}
	
<<<<<<< HEAD
	/**
	 * Getter for y coordinates of snake
	 * @return y[]
	 */
=======
>>>>>>> Finishes MVC
	public int[] getY() {
		return y;
	}
	
<<<<<<< HEAD
	/**
	 * move() method to move snake body across UNIT_SIZE
	 */
	public void move() {
=======
	
	public void move() {
		System.out.println("move");
>>>>>>> Finishes MVC
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
<<<<<<< HEAD
=======
		System.out.println(direction);
>>>>>>> Finishes MVC

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
<<<<<<< HEAD
=======
			System.out.println("innnnnn " + x[0]);
>>>>>>> Finishes MVC
			break;
		}
	}
	
<<<<<<< HEAD
	/**
	 * checkCollisions() to detect collisions with snake body or walls
	 */
	public void checkCollisions() {
		
=======
	public void checkCollisions() {
		System.out.println("RUNNINGGGG" + running);

>>>>>>> Finishes MVC
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
<<<<<<< HEAD
	}
=======

		// If running is false, game over, timer stop

	}

	
>>>>>>> Finishes MVC
	
}
