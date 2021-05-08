package Model;

public class KeyDetails {
	
	/**
	 * char direction
	 */

	char direction = 'R';
	
	/**
	 * 
	 * @param direction
	 */
	public KeyDetails(char direction) {	
		this.direction = direction;
	}
	
	public char getDirection() {
		return direction;
	}
	
	public void setDirection(char direction) {
		this.direction = direction;
	}

}
