//package Controller;
//
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//import View.GamePanel;
//
//public class MyKeyAdapter extends KeyAdapter {
//	
//	public char direction = 'R';
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//
//		// To avoid snake from making a 180 degree turn into itself,
//		// case statements to prevent that and only then change direction var
//		switch (e.getKeyCode()) { // getKeyCode() returns corresponding numerical value of key pressed
//		case KeyEvent.VK_LEFT:
//			if (direction != 'R') {
//				direction = 'L';
//			}
//			break;
//		case KeyEvent.VK_RIGHT:
//			if (direction != 'L') {
//				direction = 'R';
//			}
//			break;
//		case KeyEvent.VK_UP:
//			if (direction != 'D') {
//				direction = 'U';
//			}
//			break;
//		case KeyEvent.VK_DOWN:
//			if (direction != 'U') {
//				direction = 'D';
//			}
//			break;
//		}
//	}
//}
