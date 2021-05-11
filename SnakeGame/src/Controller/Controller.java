package Controller;

import java.util.concurrent.BlockingQueue;

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
 * Class: Controller.java
 * Purpose: Controls the key events and sets direction of snake accordingly
 */

public class Controller {

	BlockingQueue<KeyDetails> queue;
	Model model;
	GameFrame view;

	public Controller(BlockingQueue<KeyDetails> queue, Model model, GameFrame view) {
<<<<<<< HEAD
=======
import Model.SnakeGame;
=======
import Model.Model;
>>>>>>> finishing touches
import View.GameFrame;

/**
 * 
 * Class: Controller.java
 * Purpose: Controls the key events and sets direction of snake accordingly
 */

public class Controller {

	BlockingQueue<KeyDetails> queue;
	Model model;
	GameFrame view;

<<<<<<< HEAD
	public Controller(BlockingQueue<KeyDetails> queue, SnakeGame model, GameFrame view) {
>>>>>>> Finishes MVC
=======
	public Controller(BlockingQueue<KeyDetails> queue, Model model, GameFrame view) {
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
		this.queue = queue;
		this.model = model;
		this.view = view;
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
	/**
	 * Takes events from queue and sets direction
	 */
	public void mainLoop() {
		while (view.isDisplayable()) {
			KeyDetails event = null;
			
			// Take KeyDetails event from queue
<<<<<<< HEAD
<<<<<<< HEAD
=======
	public void mainLoop() {
		while (view.isDisplayable()) {
			KeyDetails event = null;
>>>>>>> Finishes MVC
=======
>>>>>>> finishing touches
=======
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
			try {
				event = queue.take();
			} catch (InterruptedException exception) {
				// do nothing
			}
			
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
			// Set snake direction
			if(event.getDirection() == 'R') {
				Model.snakemodel.setDirection('R');
			}
			else if(event.getDirection() == 'L') {
				Model.snakemodel.setDirection('L');			
				}
			else if(event.getDirection() == 'U') {
				Model.snakemodel.setDirection('U');			
				}
			else if(event.getDirection() == 'D') {
				Model.snakemodel.setDirection('D');
=======
=======
			// Set snake direction
>>>>>>> finishing touches
=======
			// Set snake direction
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
			if(event.getDirection() == 'R') {
				Model.snakemodel.setDirection('R');
			}
			else if(event.getDirection() == 'L') {
				Model.snakemodel.setDirection('L');			
				}
			else if(event.getDirection() == 'U') {
				Model.snakemodel.setDirection('U');			
				}
			else if(event.getDirection() == 'D') {
<<<<<<< HEAD
<<<<<<< HEAD
				SnakeGame.snakemodel.setDirection('D');
>>>>>>> Finishes MVC
=======
				Model.snakemodel.setDirection('D');
>>>>>>> finishing touches
=======
				Model.snakemodel.setDirection('D');
>>>>>>> 1344c6ce4cc586cdd497bf0cb840403499a6dadc
			}
		}
	}
} // end of class
