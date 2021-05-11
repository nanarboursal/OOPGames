import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import Controller.Controller;
import Model.KeyDetails;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
import Model.Model;
import View.GameFrame;

/**
 * 
 * Class: App.java
 * Purpose: Contains main() to start the snake game project. Creates the MVC components.
 */

<<<<<<< HEAD
=======
import Model.SnakeGame;
import View.GameFrame;

>>>>>>> Finishes MVC
=======
import Model.Model;
import View.GameFrame;

/**
 * 
 * Class: App.java
 * Purpose: Contains main() to start the snake game project. Creates the MVC components.
 */

>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
public class App {

	public static void main(String[] args) {

		BlockingQueue<KeyDetails> queue = new LinkedBlockingQueue<>();

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		Model model = new Model();
=======
		SnakeGame model = new SnakeGame();
>>>>>>> Finishes MVC
=======
		Model model = new Model();
>>>>>>> finishing touches
=======
		Model model = new Model();
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
		GameFrame view = new GameFrame(queue, model.applemodel, model.snakemodel);
		Controller controller = new Controller(queue, model, view);
		controller.mainLoop();
	}
}
