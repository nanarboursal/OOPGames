package Controller;

import java.util.concurrent.BlockingQueue;

import Model.KeyDetails;
<<<<<<< HEAD
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
=======
import Model.SnakeGame;
import View.GameFrame;

public class Controller {

	BlockingQueue<KeyDetails> queue;
	SnakeGame model;
	GameFrame view;

	public Controller(BlockingQueue<KeyDetails> queue, SnakeGame model, GameFrame view) {
>>>>>>> Finishes MVC
		this.queue = queue;
		this.model = model;
		this.view = view;
	}

<<<<<<< HEAD
	/**
	 * Takes events from queue and sets direction
	 */
	public void mainLoop() {
		while (view.isDisplayable()) {
			KeyDetails event = null;
			
			// Take KeyDetails event from queue
=======
	public void mainLoop() {
		while (view.isDisplayable()) {
			KeyDetails event = null;
>>>>>>> Finishes MVC
			try {
				event = queue.take();
			} catch (InterruptedException exception) {
				// do nothing
			}
			
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
			if(event.getDirection() == 'R') {
				SnakeGame.snakemodel.setDirection('R');
			}
			else if(event.getDirection() == 'L') {
				SnakeGame.snakemodel.setDirection('L');			
				}
			else if(event.getDirection() == 'U') {
				SnakeGame.snakemodel.setDirection('U');			
				}
			else if(event.getDirection() == 'D') {
				SnakeGame.snakemodel.setDirection('D');
>>>>>>> Finishes MVC
			}
		}
	}
} // end of class
