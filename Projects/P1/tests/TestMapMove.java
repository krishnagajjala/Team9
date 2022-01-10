import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException{
		
		MainFrame frame = new MainFrame();


                PacMan pacman = frame.addPacMan(new Location(9, 11));
                Ghost ghost = frame.addGhost(new Location(10, 11), "Ghostie", Color.red);

                frame.startGame();

		assertTrue(frame.getMap().move("pacman", new Location (9, 12), Map.Type.PACMAN));
		assertFalse(frame.getMap().move("pacman", new Location(9, 12), Map.Type.PACMAN));



	}
}
