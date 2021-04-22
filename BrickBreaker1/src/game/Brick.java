package game;
import javax.swing.ImageIcon;

public class Brick extends Sprite{

	private boolean destroy;
	
	public Brick(int x, int y) {
		initializeBrick(x,y);
	}
	
	private void initializeBrick(int x, int y) {
		this.x = x;
		this.y = y;
		
		destroy = false;
		loadImage(); 
		getImageDimensions();
	}
	
	private void loadImage() {
		var brickI = new ImageIcon("src/images/brick.png");
		image = brickI.getImage();
	}
	
	boolean isDestroy() {
		return destroy;
	}
	
	void setDestroy(boolean val) {
		destroy = val;
	}
}
