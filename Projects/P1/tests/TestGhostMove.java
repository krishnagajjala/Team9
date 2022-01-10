import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{

       MainFrame frame = new MainFrame();
       Location l = new Location(9, 11);
       Ghost ghost = frame.addGhost(l, "ghost", Color.red);

       assertTrue(ghost.myMap.getLoc(l).contains(Map.Type.GHOST));
       ghost.move();
       assertFalse(ghost.myMap.getLoc(new Location(9, 11)).contains(Map.Type.GHOST));
	
	}


}
