package controller.eventHandlers;

import model.InvadersModel;
import types.InvadersEventHandler;
import types.InvadersExitException;
import java.util.HashMap;

/**
 * This event handler class is used for handling "exitGame" event.
 */
public class OnExitEvent extends InvadersEventHandler {
	/**
	 * OnExitEvent class constructor.
	 * @param model Invaders' model for this event handler.
	 */
	public OnExitEvent(InvadersModel model) {
		this.model = model;
	}

	/**
	 * Handle "exitGame" event by calling model's {@link InvadersModel#exit()} method.
	 * @param payload payload of event to handle.
	 * @throws InvadersExitException exit exception for notifying controller.
	 */
	public void execute(HashMap<String, String> payload) throws InvadersExitException {
		synchronized (model) {
			model.exit();
		}
		throw new InvadersExitException();
	}
}