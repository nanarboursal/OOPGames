package Model;

import java.util.Random;
import Model.*;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
/**
 * 
 * Class: AppleModel.java
 * Purpose: Keep track of apple coordinations, apple generation and collisions
 */

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
public class AppleModel {

	/**
	 * Initializing the apple variables
	 */
	int applesEaten = 0;
	int appleX = 0;
	int appleY = 0;

<<<<<<< HEAD
=======
=======
>>>>>>> finishing touches
public class AppleModel {

	/**
	 * Initializing the apple variables
	 */
	int applesEaten = 0;
	int appleX = 0;
	int appleY = 0;
<<<<<<< HEAD
	
>>>>>>> Finishes MVC
=======

>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	Random random = new Random();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 *  The board is divided into small squares, called units
	 */
	static final int UNIT_SIZE = 25;
	
	/**
	 * Applying Singleton design pattern
	 * Only one AppleModel object at a time
	 */
	private static AppleModel instance = new AppleModel();

	/**
	 * private constructor for fulfilling Singleton
	 */
	private AppleModel() {
	}

	/**
	 * getInstance() to obtain single object of AppleModel 
	 * @return instance
	 */
	public static AppleModel getInstance() {
		return instance;
	}

	/**
	 * Getter for number of apples eaten
	 * @return applesEaten
	 */
	public int getApples() {
		return applesEaten;
	}

	/**
	 * Getter for apple x coordinate
	 * @return appleX
	 */
	public int getAppleX() {
		return appleX;
	}

	/**
	 * Getter for apple y coordinate
	 * @return appleY
	 */
	public int getAppleY() {
		return appleY;
	}

	/**
	 * Creates new apple at a randomly generated coordinate
	 */
	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) ((SCREEN_HEIGHT - 8) / UNIT_SIZE)) * UNIT_SIZE;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param bodyParts
	 * 
	 * Checks if snake head ate apple, and increases body parts and score accordingly
	 */
<<<<<<< HEAD
=======
	// The board is divided into small squares, called units
=======
	/**
	 *  The board is divided into small squares, called units
	 */
>>>>>>> finishing touches
	static final int UNIT_SIZE = 25;
	
	/**
	 * Applying Singleton design pattern
	 * Only one AppleModel object at a time
	 */
	private static AppleModel instance = new AppleModel();

	/**
	 * private constructor for fulfilling Singleton
	 */
	private AppleModel() {
	}

	/**
	 * getInstance() to obtain single object of AppleModel 
	 * @return instance
	 */
	public static AppleModel getInstance() {
		return instance;
	}

	/**
	 * Getter for number of apples eaten
	 * @return applesEaten
	 */
	public int getApples() {
		return applesEaten;
	}

	/**
	 * Getter for apple x coordinate
	 * @return appleX
	 */
	public int getAppleX() {
		return appleX;
	}

	/**
	 * Getter for apple y coordinate
	 * @return appleY
	 */
	public int getAppleY() {
		return appleY;
	}

	/**
	 * Creates new apple at a randomly generated coordinate
	 */
	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) ((SCREEN_HEIGHT - 8) / UNIT_SIZE)) * UNIT_SIZE;
	}
<<<<<<< HEAD
	
>>>>>>> Finishes MVC
=======

	/**
	 * 
	 * @param x
	 * @param y
	 * @param bodyParts
	 * 
	 * Checks if snake head ate apple, and increases body parts and score accordingly
	 */
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	public void checkApple(int[] x, int[] y, int bodyParts) {

		// Examine coordinates of snake and apple
		if ((x[0] == appleX) && (y[0] == appleY)) { // GET x y FROM SNAKE MODEL
			// If apple eaten, increment variables
			applesEaten++;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
			Model.snakemodel.setBodyParts(++bodyParts);
			newApple();
		}
	}

=======
			Model.SnakeGame.snakemodel.setBodyParts(++bodyParts);
			newApple();
		}
	}
	
>>>>>>> Finishes MVC
=======
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
			Model.snakemodel.setBodyParts(++bodyParts);
			newApple();
		}
	}

<<<<<<< HEAD
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
}
