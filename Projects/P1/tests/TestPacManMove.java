import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
        
	 Mainframe frame = new MainFrame();  
     
       frame.startGame();   
        Pac pacman = frame.addPacMac(new Location(9, 11)); 

	assertTrue(pacman.MyLoc(9,12)); 

	}
}
