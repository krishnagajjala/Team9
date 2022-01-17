import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException{
		
		NoFrame frame = new NoFrame();

        PacMan pacman = frame.addPacMan(new Location(9, 11));
        Ghost ghost = frame.addGhost(new Location(10, 11), "Ghostie", Color.red);

                

		assertTrue(frame.getMap().move("pacman", new Location (9, 12), Map.Type.PACMAN));
		assertFalse(frame.getMap().getLoc( new Location(9, 11)).contains(Map.Type.PACMAN));
		assertTrue(frame.getMap().getLoc(new Location(9, 12)).contains(Map.Type.PACMAN)); 
		assertTrue(frame.getMap().getLoc(new Location(9, 12)).contains(Map.Type.PACMAN));



	}
}
