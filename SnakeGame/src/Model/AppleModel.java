package Model;

import java.util.Random;
import Model.*;

public class AppleModel {
	
	int applesEaten = 0;
	int appleX = 0;
	int appleY = 0;
	
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	Random random = new Random();

	// The board is divided into small squares, called units
	static final int UNIT_SIZE = 25;

	public int getApples() {
		return applesEaten;
	}
	
	public int getAppleX() {
		return appleX;
	}
	
	public int getAppleY() {
		return appleY;
	}
	
	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) ((SCREEN_HEIGHT-8)/ UNIT_SIZE)) * UNIT_SIZE;
	}
	
	public void checkApple(int[] x, int[] y, int bodyParts) {

		// Examine coordinates of snake and apple
		if ((x[0] == appleX) && (y[0] == appleY)) { // GET x y FROM SNAKE MODEL
			// If apple eaten, increment variables
			applesEaten++;
			Model.SnakeGame.snakemodel.setBodyParts(++bodyParts);
			newApple();
		}
	}
	
}
