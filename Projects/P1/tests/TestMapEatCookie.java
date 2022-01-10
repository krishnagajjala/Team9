import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie {
	
	public void testMapEatCookie() {
		//Creating A Map
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
		NoFrame noFrame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Location location = new Location(15, 35);
		
		//Creating Players
		Ghost ghost = frame.addGhost(new Location(2, 2), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(location); //Creates PacMan at location x, y
		
		Map map = frame.getMap();
		if(map.eatCookie("pacman") != null){
			if( (map.getLoc(location)).contains(Map.Type.COOKIE) ){
				assertTrue(true);
			} else {
				assertTrue(false);
			}
		}
		assertTrue(true);
		//Start The Game
		frame.startGame();
	}
}
