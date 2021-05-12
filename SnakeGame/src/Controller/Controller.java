package Controller;

import java.util.concurrent.BlockingQueue;

import Model.KeyDetails;
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
		this.queue = queue;
		this.model = model;
		this.view = view;
		System.out.println("in controller const");

	}


	/**
	 * Takes events from queue and sets direction
	 */
	public void mainLoop() {
		while (view.isDisplayable()) {
			KeyDetails event = null;
			System.out.println("queue" + queue);

			try {
				event = queue.take();
				System.out.println("event" + event);
			} catch (InterruptedException exception) {
				// do nothing
			}
			
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
			}
		}
	}
} // end of class
