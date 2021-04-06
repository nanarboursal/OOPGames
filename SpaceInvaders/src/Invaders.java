
import model.InvadersModel;
import view.InvadersView;
import controller.InvadersController;

/**
 * Invaders, a java Space Invaders clone, made using MVC.
 * @author Maciej Bogusz {@literal "<M.Bogusz@stud.elka.pw.edu.pl>"}
 * @version 0.1.2
 */
public class Invaders {
	/**
	 * Main Invaders' method. Initializes components of application and starts the machinery.
	 * @param args array of arguments, internally ignored.
	 */
	public static void main(String[] args) {
		InvadersModel model = new InvadersModel();
		InvadersController controller = new InvadersController(model);
		InvadersView view = new InvadersView(controller);

		// Start the whole machinery
		model.addObserver(view);
		view.initialize();
		controller.start();
	}
}