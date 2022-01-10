import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

     public void testGhostMove() throws FileNotFoundException{
	
       MainFrame frame = new MainFrame();

         Ghost ghost = frame.addGhost(new Location(9, 11), "ghost", Color.red);
        
        assertFalse(ghost.myMap.getLoc(new Location(9, 11)).contains(Map.Type.GHOST));
	
	}


]
