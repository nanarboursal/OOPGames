package game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import javax.swing.JPanel;

public class Board extends JPanel{
	private Timer timer;
	private String message = "GAME OVER";
	private Ball ball;
	private Paddle paddle;
	private Brick[] bricks;
	private boolean playingGame = true;
	
	public Board() {
		initializeBoard();
	}
	
	private void initializeBoard() {
		addKeyListener(new TAdapter());
		setFocusable(true);
		setPreferredSize(new Dimension(Constants.WIDTH, Constants.HEIGHT));
		gameInitialize();
	}
	
	private void gameInitialize() {
		bricks = new Brick[Constants.NUM_BRICKS];
		
		ball = new Ball();
		paddle = new Paddle();
		
		int k = 0;
		
		for (int i = 0; i <5; i++) {
			for (int j=0; j<6; j++) {
				bricks[k] = new Brick(j*40+30, i*10+50);
				k++;
			}
		}
		
		timer = new Timer(Constants.PERIOD, new GameCycle());
        timer.start();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(getGraphics());
		var graphics2D = (Graphics2D)g;
		
		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		
		if(playingGame) {
			drawObjects(graphics2D);
		}else {
			finishGame(graphics2D);
		}
		
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void drawObjects(Graphics2D graphics2D) {
		graphics2D.drawImage(ball.getImage(), ball.getX(), ball.getY(), ball.getImageHeight(), ball.getImageHeight(), this);
		graphics2D.drawImage(paddle.getImage(), paddle.getX(), paddle.getY(), paddle.getImageWidth(), paddle.getImageHeight(),this);
		
		for(int i = 0; i<Constants.NUM_BRICKS; i++) {
			if(!bricks[i].isDestroy()) {
				graphics2D.drawImage(bricks[i].getImage(), bricks[i].getX(), bricks[i].getY(), bricks[i].getImageWidth(),bricks[i].getImageHeight(), this);
				
			}
		}
	}
	
	private void finishGame(Graphics graphics2D) {
		var font = new Font("Verdana", Font.BOLD, 18);
		FontMetrics fontMetrics = this.getFontMetrics(getFont());
		
		graphics2D.setColor(Color.black);
		graphics2D.setFont(font);
		graphics2D.drawString(message, (Constants.WIDTH -  fontMetrics.stringWidth(message))/2, Constants.WIDTH/2);
		
	}
	
	private class TAdapter extends KeyAdapter{
		public void keyReleased(KeyEvent e) {
			paddle.keyReleased(e);
		}
		
		public void keyPressed(KeyEvent e) {
			paddle.keyPressed(e);
		}
	}
	
	private class GameCycle implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			doGameCycle();
			
		}	
	}
	
	private void doGameCycle() {
		ball.move();
		paddle.move();
		checkCollision();
		repaint();
	}
	
	public void stopGame() {
		playingGame = false;
		timer.stop();
	}
	
	private void checkCollision() {
		if(ball.getRectangle().getMaxY() >Constants.BOTTOM_EDGE) {
			stopGame();
		}
		for (int i = 0, j=0; i < Constants.NUM_BRICKS; i++) {
			if(bricks[i].isDestroy()) {
				j++;
			}
		if(j == Constants.NUM_BRICKS) {
			message = "Congratulations, you won!";
			stopGame();
		}
			
		}
		
		if((ball.getRectangle().intersects(paddle.getRectangle()))) {
			int paddleLPos = (int) paddle.getRectangle().getMinX();
			int ballLPos = (int) ball.getRectangle().getMinX();
			
			int first = paddleLPos +8;
			int second = paddleLPos +16;
			int third = paddleLPos+24;
			int fourth = paddleLPos +32;
			
			if(ballLPos <first) {
				ball.setXDirection(-1);
				ball.setYDirection(-1);
			}
			
			if(ballLPos >= first && ballLPos < second) {
				ball.setXDirection(-1);
				ball.setYDirection(-1*ball.getYDirection());
			}
			 if (ballLPos >= second && ballLPos < third) {

	                ball.setXDirection(0);
	                ball.setYDirection(-1);
	            }

	            if (ballLPos >= third && ballLPos < fourth) {

	                ball.setXDirection(1);
	                ball.setYDirection(-1 * ball.getYDirection());
	            }

	            if (ballLPos > fourth) {

	                ball.setXDirection(1);
	                ball.setYDirection(-1);
	            }
	            for (int i = 0; i < Constants.NUM_BRICKS; i++) {

	                if ((ball.getRectangle()).intersects(bricks[i].getRectangle())) {

	                    int ballLeft = (int) ball.getRectangle().getMinX();
	                    int ballHeight = (int) ball.getRectangle().getHeight();
	                    int ballWidth = (int) ball.getRectangle().getWidth();
	                    int ballTop = (int) ball.getRectangle().getMinY();

	                    var pointRight = new Point(ballLeft + ballWidth + 1, ballTop);
	                    var pointLeft = new Point(ballLeft - 1, ballTop);
	                    var pointTop = new Point(ballLeft, ballTop - 1);
	                    var pointBottom = new Point(ballLeft, ballTop + ballHeight + 1);

	                    if (!bricks[i].isDestroy()) {

	                        if (bricks[i].getRectangle().contains(pointRight)) {

	                            ball.setXDirection(-1);
	                        } else if (bricks[i].getRectangle().contains(pointLeft)) {

	                            ball.setXDirection(1);
	                        }

	                        if (bricks[i].getRectangle().contains(pointTop)) {

	                            ball.setYDirection(1);
	                        } else if (bricks[i].getRectangle().contains(pointBottom)) {

	                            ball.setYDirection(-1);
	                        }

	                        bricks[i].setDestroy(true);
	                    }
	                }
		}
		
	}
	}
}
