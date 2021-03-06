import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException{
		// MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		//Creating Players

		PacMan pacman = frame.addPacMan(new Location(1, 1));
		Ghost ghost = frame.addGhost(new Location(1, 2), "Bonnie", Color.red);
		Ghost ghost1 = frame.addGhost(new Location(1, 6), "Clyde", Color.blue);
		assertTrue(ghost.attack());	
		assertTrue(frame.getMap().isGameOver());	
	}
}
