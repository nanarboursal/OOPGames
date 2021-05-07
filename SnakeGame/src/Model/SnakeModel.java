package Model;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
/**
 * 
 * Class: SnakeModel.java
 * Purpose: 
 */

<<<<<<< HEAD
public class SnakeModel {
	
	/**
	 * Numerical values for screen constants 
	 */
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	
=======
=======
>>>>>>> finishing touches
public class SnakeModel {
	
	/**
	 * Numerical values for screen constants 
	 */
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
<<<<<<< HEAD

	// The board is divided into small squares, called units
>>>>>>> Finishes MVC
=======
	
>>>>>>> finishing touches
	static final int UNIT_SIZE = 25;

	static final int GAME_UNITS = (SCREEN_WIDTH * (SCREEN_HEIGHT)) / UNIT_SIZE;
	static final int DELAY = 75;
	
	/**
	 * Arrays for tracking x and y position of snake's body
	 */
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];


<<<<<<< HEAD
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
=======
	/**
	 * Initializing snake parts and running state 
	 */
>>>>>>> finishing touches
	int bodyParts = 4;
	boolean running = false;
	
	/**
	 * Initializing direction
	 */
	KeyDetails keyDetail = new KeyDetails('R');
	char direction = keyDetail.getDirection();
	
<<<<<<< HEAD
>>>>>>> Finishes MVC
=======
	/**
	 * Getter for running
	 * @return running
	 */
>>>>>>> finishing touches
	public boolean getRunning() {
		return running;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Setter for running
	 * @param running
	 */
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public void setRunning (boolean running) {
		this.running = running;
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Getter for bodyParts
	 * @return bodyParts
	 */
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public int getBodyParts() {
		return bodyParts;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Setter for bodyParts
	 * @param bodyParts
	 */
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public void setBodyParts(int bodyParts) {
		this.bodyParts = bodyParts;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Getter for keyDetail
	 * @return keyDetail
	 */
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public KeyDetails getKeyDetail() {
		return this.keyDetail;
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Setter for direction
	 * @param direction
	 */
<<<<<<< HEAD
=======
	
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Getter for x coordinates of snake
	 * @return x[]
	 */
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public int[] getX() {
		return x;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
	/**
	 * Getter for y coordinates of snake
	 * @return y[]
	 */
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
	public int[] getY() {
		return y;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * move() method to move snake body across UNIT_SIZE
	 */
	public void move() {
=======
	
	public void move() {
		System.out.println("move");
>>>>>>> Finishes MVC
=======
	/**
	 * move() method to move snake body across UNIT_SIZE
	 */
	public void move() {
>>>>>>> finishing touches
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
<<<<<<< HEAD
<<<<<<< HEAD
=======
		System.out.println(direction);
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches

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
<<<<<<< HEAD
=======
			System.out.println("innnnnn " + x[0]);
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
			break;
		}
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * checkCollisions() to detect collisions with snake body or walls
	 */
	public void checkCollisions() {
		
=======
	public void checkCollisions() {
		System.out.println("RUNNINGGGG" + running);

>>>>>>> Finishes MVC
=======
	/**
	 * checkCollisions() to detect collisions with snake body or walls
	 */
	public void checkCollisions() {
		
>>>>>>> finishing touches
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
<<<<<<< HEAD
	}
=======

		// If running is false, game over, timer stop

	}

	
>>>>>>> Finishes MVC
=======
	}
>>>>>>> finishing touches
	
}
