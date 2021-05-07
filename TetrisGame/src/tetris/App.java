package tetris;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {

		BlockingQueue queue = new LinkedBlockingQueue<KeyPressedMessage>();

		WindowGame window = new WindowGame(queue);

		Controller controller = new Controller(queue, window);
		controller.runningLoop();

	}

}
