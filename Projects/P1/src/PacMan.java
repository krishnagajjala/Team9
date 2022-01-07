import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() {
		// check if map has cookie type in the set for that position 
		if(this.myMap.getLoc(this.myLoc).contains(Map.Type.COOKIE)) {
		  return myMap.eatCookie(this.myName);
		} else {
		  return null;      
		}
	  }
}
