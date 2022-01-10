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
		assertNull(map.eatCookie("pacman"));

		CookieComponent tok = new CookieComponent(location.x,location.y,scale);
		map.add("tok_x"+location.x+"_y"+location.y, location, tok, Map.Type.COOKIE);
		add(tok);
		tok.setLocation(location.x, location.y);

		assertNotNull(map.eatCookie("pacman"));

		//Start The Game
		frame.startGame();
	}
}
