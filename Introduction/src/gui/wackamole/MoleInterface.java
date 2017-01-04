package gui.wackamole;

import gui.components.Action;
import gui.components.Clickable;

/**
 * @author Student 6
 *
 */

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);

	void setAction(Action action);

}
