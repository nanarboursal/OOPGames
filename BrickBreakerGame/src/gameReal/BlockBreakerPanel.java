package gameReal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class BlockBreakerPanel extends JPanel implements KeyListener{

	
	BlockBreakerPanel(){
		Block paddle = new Block(175,480, 150,25,"paddle.png");
		
		addKeyListener(this);
		setFocusable(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
