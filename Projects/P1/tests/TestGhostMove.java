import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{

       NoFrame frame = new NoFrame();
       Location l = new Location(9, 11);
       Ghost ghost = frame.addGhost(l, "ghost", Color.red);

        for(int i = 0; i < 15; i++) {
                for(int j = 0; j < 15; j++) {
                        CookieComponent tok = new CookieComponent(i,j,20);
                        frame.getMap().add("tok_x"+i+"_y"+j, new Location(i,j), tok, Map.Type.COOKIE);
                        	tok.setLocation(i, j);
                }
        }


       assertTrue(ghost.myMap.getLoc(l).contains(Map.Type.GHOST));
       System.out.println(ghost.move());
       assertFalse(ghost.myMap.getLoc(new Location(9, 11)).contains(Map.Type.GHOST));
	
	}


}
