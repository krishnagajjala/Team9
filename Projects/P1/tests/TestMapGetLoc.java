import junit.framework.*;
import java.awt.Color;
import java.io.*;


public class TestMapGetLoc {
	
	public void testMapGetLoc() {

	   Mainframe frame = new MainFrame();

	PacMan pacman = frame.addPacMan(new Location(9, 12));

       frame.startGame();

	assertTrue(map.getLoc(new Location (9,12)); 

	}
}
