import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
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
		Ghost ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y
		assertFalse(ghost.is_pacman_in_range());
		
		PacMan aboveP = frame.addPacMan(above); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());	
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan belowP = frame.addPacMan(below); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan leftP = frame.addPacMan(left); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan rightP = frame.addPacMan(right); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan upperLeftP = frame.addPacMan(upperLeft); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan upperRightP = frame.addPacMan(upperRight); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan lowerLeftP = frame.addPacMan(lowerLeft); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();
		ghost = frame.addGhost(new Location(x, y), "name", Color.red); //Creates a red ghost named "name" at location x,y

		PacMan lowerRightP = frame.addPacMan(lowerRight); //Creates PacMan at location x, y
		assertTrue(ghost.is_pacman_in_range());
		frame = new MainFrame();

		//alternatively if you don't need the PacMan or Ghost objects in your tests
		frame.initPlayers(); //Creates all of the players

		//Start The Game
		frame.startGame();

	}
}

