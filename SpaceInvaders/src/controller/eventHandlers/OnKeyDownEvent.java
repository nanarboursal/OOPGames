package controller.eventHandlers;

import model.InvadersModel;
import types.InvadersEventHandler;
import java.util.HashMap;

/**
 * This event handler class is used for handling "keyDown" event.
 */
public class OnKeyDownEvent extends InvadersEventHandler {
	/**
	 * OnKeyDownEvent class constructor.
	 * @param model Invaders' model for this event handler.
	 */
	public OnKeyDownEvent(InvadersModel model) {
		this.model = model;
	}

	/**
	 * Handle "keyDown" event by calling model's {@link InvadersModel#setKeyDown(int)} method.
	 * @param payload payload of event to handle, should contain Integer on "keyCode" field.
	 */
	public void execute(HashMap<String, String> payload) {
		int keyCode = Integer.parseInt(payload.get("keyCode"));

		// Ignore extended keymap buttons and deduplicate
		if(keyCode > 255 || model.getKeyState(keyCode)) {
			return;
		}

		synchronized (model) {
			model.setKeyDown(keyCode);
		}
	}
}