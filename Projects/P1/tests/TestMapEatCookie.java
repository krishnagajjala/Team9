import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase{

	public void testMapEatCookie() throws FileNotFoundException{
		//Creating A Map
		NoFrame noFrame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

		Location location = new Location(15, 35);

		//Creating Players
		Ghost ghost = noFrame.addGhost(new Location(2, 2), "name", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = noFrame.addPacMan(location); //Creates PacMan at location x, y

		Map map = noFrame.getMap();
		assertNull(map.eatCookie("pacman"));

		CookieComponent tok = new CookieComponent(location.x,location.y, 20);
		map.add("tok_x"+location.x+"_y"+location.y, location, tok, Map.Type.COOKIE);
		tok.setLocation(location.x, location.y);

		assertNotNull(map.eatCookie("pacman"));
	}
}
