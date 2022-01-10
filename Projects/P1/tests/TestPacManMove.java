import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
        
	 MainFrame frame = new MainFrame();  
     
       frame.startGame();   
        Pac pacman = frame.addPacMan(new Location(9, 11)); 

	assertTrue(pacman.myLoc(9,12)); 

	}
}
