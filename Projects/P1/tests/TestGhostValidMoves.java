import junit.framework.*;
import java.awt.Color;
import java.io.*; 

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() {
		MainFrame frame = new MainFrame();
		
		PacMan pacman = frame.addPacMan(new Location(9, 11));
                Ghost ghost = frame.addGhost(new Location(10, 11), "Ghostie", Color.red);
                
		frame.startGame();

		validMoves = pacman.get_valid_moves();

		boolean same = false; 

		ArrayList<Location> vals = new ArrayList<Integer>();
		
		Location loc1 = new Location(9, 12); 
		vals.add(loc1);
		Location loc2 = new Location(9, 10); 
                vals.add(loc2);
                Location loc3 = new Location(10, 11);
		vals.add(loc3); 
		Location loc4 = new Location(8,11);
		vals.add(loc4);
                
               
		
		if (validMoves.contains(loc1) && validMoves.contains(loc2) && validMoves.contains(loc3) && validMoves.contains(loc4)) same = true; 

		assertTrue(same == true);
		assertFalse(same == false);
	}
}
