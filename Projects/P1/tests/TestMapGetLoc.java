import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {


            MainFrame frame = new MainFrame();

	PacMan pacman = frame.addPacMan(new Location(9, 12));

	assertTrue(pacman.myMap.getLoc(new Location (9,12)).contains(Map.Type.PACMAN)); 


	}
}
