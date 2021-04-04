package gameReal;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class BlockBreakerPanel extends JPanel implements KeyListener{

	
	ArrayList<Block> blocks = new ArrayList<Block>();
	Block paddle = new Block(175,480, 150,25,"paddle.png");
	Block ball = new Block(237, 435,25,25,"ball.png");
	
//	Animation animate;
	BlockBreakerPanel(){
		
		addKeyListener(this);
		setFocusable(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void paintComponent(Graphics g) {
		paddle.draw(g, this);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			new Thread(() -> {
				while(true) {
					update();
//					System.out.println("running");
					try {
						Thread.sleep(10);
					}catch(InterruptedException s) {
					s.printStackTrace();
					}
				}
			}).start();
			

		}
		
	}
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
