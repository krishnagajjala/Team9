import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.*;


public class TestPacManValidMoves extends TestCase {

        public void testPacManValidMoves() throws FileNotFoundException{
                NoFrame frame = new NoFrame();


                PacMan pacman = frame.addPacMan(new Location(9, 11));
                Ghost ghost = frame.addGhost(new Location(10, 11), "Ghostie", Color.red);

                for(int i = 0; i < 15; i++) {
                        for(int j = 0; j < 15; j++) {
                                CookieComponent tok = new CookieComponent(i,j,20);
                                frame.getMap().add("tok_x"+i+"_y"+j, new Location(i,j), tok, Map.Type.COOKIE);
                                	tok.setLocation(i, j);  
                        }
                }

                ArrayList<Location> validMoves = pacman.get_valid_moves();
                System.out.println(validMoves.size());
                Location loc1 = new Location(9, 12);

                assertTrue(validMoves.contains(loc1));

        }
}


