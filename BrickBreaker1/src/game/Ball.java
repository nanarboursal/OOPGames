package game;
import javax.swing.ImageIcon;

public class Ball extends Sprite{
	private int moveX;
	private int moveY;
	
	public Ball() {
		initializeBall();
	}
	
	private void initializeBall() {
		moveX = 1;
		moveY = -1;
		
		loadImage();
		getImageDimensions();
		resetBallState();
		
	}
	
	private void loadImage() {
		var ballImage = new ImageIcon("src/images/ball.png");
		image = ballImage.getImage();
	}

	void move() {
		x += moveX;
		y += moveY;
		
		if(x == 0) {
			setXDirection(1);
		}
		
		if(x == Constants.WIDTH - imageWidth) {
			setXDirection(-1);
		}
		
		if(y == 0) {
			setYDirection(1);
		}
	}
	
	private void resetBallState() {
		x = Constants.BALL_X;
		y = Constants.BALL_Y;
	}
	
	void setXDirection(int x) {
		moveX = x;
	}
	
	void setYDirection(int y) {
		moveY = y;
	}
	
	int getYDirection() {
		return moveY;
	}
}
