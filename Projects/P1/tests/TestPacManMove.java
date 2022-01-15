import junit.framework.*;
import java.awt.Color;
import java.io.*;

import org.xml.sax.ext.Locator2Impl;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
        
	 NoFrame frame = new NoFrame();  
	for(int i = 0; i < 15; i++) {
		for(int j = 0; j < 15; j++) {
			CookieComponent tok = new CookieComponent(i,j,20);
			frame.getMap().add("tok_x"+i+"_y"+j, new Location(i,j), tok, Map.Type.COOKIE);
					  frame.add(tok);
					  tok.setLocation(i, j);  
		}
	}
        PacMan pacman = frame.addPacMan(new Location(9, 11)); 
		pacman.move();
		assertFalse(pacman.myMap.getLoc(new Location(9,11)).contains(Map.Type.PACMAN)); 
	}
}

