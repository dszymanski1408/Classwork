/**
 * 
 */
package gui.simon;

import gui.components.Visible;

/**
 * @author David Szymanski
 *
 */
public interface ProgressInterfaceDavidS extends Visible {

	void gameOver();
	void setRound(int num);
	void setSequenceSize(int size);
}
