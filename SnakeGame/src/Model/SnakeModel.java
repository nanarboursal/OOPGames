package Model;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
/**
 * 
 * Class: SnakeModel.java
 * Purpose: 
 */

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
public class SnakeModel {
	
	/**
	 * Numerical values for screen constants 
	 */
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	
<<<<<<< HEAD
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
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
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
<<<<<<< HEAD
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
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
<<<<<<< HEAD
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
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public boolean getRunning() {
		return running;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Setter for running
	 * @param running
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public void setRunning (boolean running) {
		this.running = running;
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Getter for bodyParts
	 * @return bodyParts
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public int getBodyParts() {
		return bodyParts;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Setter for bodyParts
	 * @param bodyParts
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public void setBodyParts(int bodyParts) {
		this.bodyParts = bodyParts;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Getter for keyDetail
	 * @return keyDetail
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public KeyDetails getKeyDetail() {
		return this.keyDetail;
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Setter for direction
	 * @param direction
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
	
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Getter for x coordinates of snake
	 * @return x[]
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public int[] getX() {
		return x;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Getter for y coordinates of snake
	 * @return y[]
	 */
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public int[] getY() {
		return y;
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * move() method to move snake body across UNIT_SIZE
	 */
	public void move() {
<<<<<<< HEAD
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
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
		System.out.println(direction);
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc

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
<<<<<<< HEAD
=======
			System.out.println("innnnnn " + x[0]);
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
			break;
		}
	}
	
<<<<<<< HEAD
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
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * checkCollisions() to detect collisions with snake body or walls
	 */
	public void checkCollisions() {
		
<<<<<<< HEAD
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
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
<<<<<<< HEAD
	}
=======

		// If running is false, game over, timer stop

	}

	
>>>>>>> Finishes MVC
=======
	}
>>>>>>> finishing touches
=======
	}
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	
}
