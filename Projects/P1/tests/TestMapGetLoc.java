import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc() throws FileNotFoundException{

	   NoFrame frame = new NoFrame();

	PacMan pacman = frame.addPacMan(new Location(9, 12));


	assertTrue(pacman.myMap.getLoc(new Location (9,12)).contains(Map.Type.PACMAN)); 

	}
}
