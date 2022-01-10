import junit.framework.*;
import java.awt.Color;
import java.io.*; 
import java.util.*;


public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		
		PacMan pacman = frame.addPacMan(new Location(9, 11));
    	Ghost ghost = frame.addGhost(new Location(10, 11), "Ghostie", Color.red);
                
		ArrayList<Location> validMoves = ghost.get_valid_moves();

		boolean same = false; 
		ArrayList<Location> vals = new ArrayList<Location>();
		
		Location loc1 = new Location(9, 11); 
		vals.add(loc1);
                
        
		assertTrue(validMoves.contains(loc1));
	}
}
