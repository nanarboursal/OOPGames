package game;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Paddle extends Sprite {

	private int dirX;

	public Paddle() {
		initializePaddle();
	}

	private void initializePaddle() {
		loadImage();
		getImageDimensions();

		resetState();
	}

	private void loadImage() {
		var paddleImage = new ImageIcon("src/images/paddle.png");
		image = paddleImage.getImage();
	}

	void move() {
		x += dirX;

		if (x <= 0) {
			x = 0;
		}

		if (x >= Constants.WIDTH - imageWidth) {
			x = Constants.WIDTH - imageWidth;
		}
	}

	void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dirX = -1;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dirX = 1;
		}
	}

	void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dirX = 0;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dirX = 0;
		}
	}

	
	private void resetState() {
		
		x= Constants.PADDLE_X;
		y = Constants.PADDLE_Y;
	}
}
