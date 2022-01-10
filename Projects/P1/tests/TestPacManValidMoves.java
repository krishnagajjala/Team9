import junit.framework.*;
import java.awt.Color;
import java.io.*;
import Collections; 

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() {
		
		NoFrame nf = new NoFrame(); 
		ArrayList<Location> vals = new ArrayList<Integer>(); 
		vals.add((9, 12));
		vals.add((9, 10));
		vals.add((10, 11));
		vals.add((8,11));
		Collections.sort(vals)
		PacMan pacman = nf.addPacMan(new Location(9, 11));

		assertTrue(Collections.sort(pacman.get_valid_moves).equals(vals);	

	}
}
