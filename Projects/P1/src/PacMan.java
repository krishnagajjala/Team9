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
		Location above = new Location(this.myLoc.x, this.myLoc.y + 1);
		Location below = new Location(this.myLoc.x, this.myLoc.y - 1);
		Location left = new Location(this.myLoc.x - 1, this.myLoc.y);
		Location right = new Location(this.myLoc.x + 1, this.myLoc.y);
		Location upperLeft = new Location(this.myLoc.x - 1, this.myLoc.y + 1);
		Location upperRight = new Location(this.myLoc.x + 1, this.myLoc.y + 1);
		Location lowerLeft = new Location(this.myLoc.x - 1, this.myLoc.y - 1);
		Location lowerRight = new Location(this.myLoc.x + 1, this.myLoc.y - 1);

		if(
		(this.myMap.getLoc(above)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(below)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(left)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(right)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(upperLeft)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(upperRight)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(lowerLeft)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(lowerRight)).contains(Map.Type.GHOST) ||
		(this.myMap.getLoc(this.location)).contains(Map.Type.GHOST)
		) {
			return true;
		} else {
			return false;
		}
	}

	public JComponent consume() { 
 		return null;
	}
}
