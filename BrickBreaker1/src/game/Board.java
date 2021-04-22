package game;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.util.Timer;

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
		
		graphics2D.RenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics2D.RenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

	}
}
