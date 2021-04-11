package types;

import java.util.HashMap;

/**
 * Invaders game's universal event class.
 */
public class InvadersEvent {
	/**
	 * Event type
	 */
	public String type;
	
	/**
	 * Event's payload, containing additional information for controller/event handler
	 */
	public HashMap<String, String> payload;

	/**
	 * Constructor of InvadersEvent class.
	 * @param type of the event.
	 */
	public InvadersEvent(String type) {
		this.type = type;
		this.payload = new HashMap<String, String>();
	}
}