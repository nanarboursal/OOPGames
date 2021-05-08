import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import Controller.Controller;
import Model.KeyDetails;
<<<<<<< HEAD
import Model.Model;
import View.GameFrame;

/**
 * 
 * Class: App.java
 * Purpose: Contains main() to start the snake game project. Creates the MVC components.
 */

=======
import Model.SnakeGame;
import View.GameFrame;

>>>>>>> Finishes MVC
public class App {

	public static void main(String[] args) {

		BlockingQueue<KeyDetails> queue = new LinkedBlockingQueue<>();

<<<<<<< HEAD
		Model model = new Model();
=======
		SnakeGame model = new SnakeGame();
>>>>>>> Finishes MVC
		GameFrame view = new GameFrame(queue, model.applemodel, model.snakemodel);
		Controller controller = new Controller(queue, model, view);
		controller.mainLoop();
	}
}
