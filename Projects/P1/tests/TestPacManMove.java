import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
        
       MainFrame frame = new MainFrame();      

        Pac pacman = frame.addPacMan(new Location(9, 11)); 

	pacman.move(); 

	assertFalse(pacman.myMap.getLoc(new Location(9, 11)).contains(Map.Type.PACMAN)); 

  }

 }

