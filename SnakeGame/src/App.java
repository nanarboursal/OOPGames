import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import Controller.Controller;
import Model.KeyDetails;
import Model.SnakeGame;
import View.GameFrame;

public class App {

	public static void main(String[] args) {

		BlockingQueue<KeyDetails> queue = new LinkedBlockingQueue<>();

		SnakeGame model = new SnakeGame();
		GameFrame view = new GameFrame(queue, model.applemodel, model.snakemodel);
		Controller controller = new Controller(queue, model, view);
		controller.mainLoop();
	}
}
