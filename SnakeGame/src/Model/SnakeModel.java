package Model;

public class SnakeModel {
	
	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;

	// The board is divided into small squares, called units
	static final int UNIT_SIZE = 25;

	static final int GAME_UNITS = (SCREEN_WIDTH * (SCREEN_HEIGHT)) / UNIT_SIZE;
	static final int DELAY = 75;
	
	/**
	 * Arrays for tracking x and y position of snake's body
	 */
	final int x[] = new int[GAME_UNITS];
	final int y[] = new int[GAME_UNITS];


	int bodyParts = 4;
	
	boolean running = false;
	
	KeyDetails keyDetail = new KeyDetails('R');
	char direction = keyDetail.getDirection();
	
	public boolean getRunning() {
		return running;
	}
	
	public void setRunning (boolean running) {
		this.running = running;
	}

	public int getBodyParts() {
		return bodyParts;
	}
	
	public void setBodyParts(int bodyParts) {
		this.bodyParts = bodyParts;
	}
	
	public KeyDetails getKeyDetail() {
		return this.keyDetail;
	}

	
	public void setDirection(char direction) {
		this.direction = direction;
	}
	
	public int[] getX() {
		return x;
	}
	
	public int[] getY() {
		return y;
	}
	
	
	public void move() {
		System.out.println("move");
		for (int i = bodyParts; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
		System.out.println(direction);

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
			System.out.println("innnnnn " + x[0]);
			break;
		}
	}
	
	public void checkCollisions() {
		System.out.println("RUNNINGGGG" + running);

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

		// If running is false, game over, timer stop

	}

	
	
}
