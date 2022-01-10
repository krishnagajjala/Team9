import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		//Creating A Map
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		NoFrame noFrame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		int x = 25;
		int y = 25;

		Location above = new Location(this.myLoc.x, this.myLoc.y + 1);
		Location below = new Location(this.myLoc.x, this.myLoc.y - 1);
		Location left = new Location(this.myLoc.x - 1, this.myLoc.y);
		Location right = new Location(this.myLoc.x + 1, this.myLoc.y);
		Location upperLeft = new Location(this.myLoc.x - 1, this.myLoc.y + 1);
		Location upperRight = new Location(this.myLoc.x + 1, this.myLoc.y + 1);
		Location lowerLeft = new Location(this.myLoc.x - 1, this.myLoc.y - 1);
		Location lowerRight = new Location(this.myLoc.x + 1, this.myLoc.y - 1);

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(x, y));
		assertFalse(pacman.is_ghost_in_range());
		
		Ghost aboveP = frame.addGhost(above, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());	
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost belowP = frame.addGhost(below, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost leftP = frame.addGhost(left, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost rightP = frame.addGhost(right, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost upperLeftP = frame.addGhost(upperLeft, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost upperRightP = frame.addGhost(upperRight, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost lowerLeftP = frame.addGhost(lowerLeft, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();
		pacman = frame.addPacMan(new Location(x, y));

		Ghost lowerRightP = frame.addGhost(lowerRight, "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertTrue(pacman.is_ghost_in_range());
		frame = new MainFrame();

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();
	}
}
