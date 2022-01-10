import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
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

	public boolean is_pacman_in_range() { 
		Location above = new Location(this.myLoc.x, this.myLoc.y + 1);
		Location below = new Location(this.myLoc.x, this.myLoc.y - 1);
		Location left = new Location(this.myLoc.x - 1, this.myLoc.y);
		Location right = new Location(this.myLoc.x + 1, this.myLoc.y);
		Location upperLeft = new Location(this.myLoc.x - 1, this.myLoc.y + 1);
		Location upperRight = new Location(this.myLoc.x + 1, this.myLoc.y + 1);
		Location lowerLeft = new Location(this.myLoc.x - 1, this.myLoc.y - 1);
		Location lowerRight = new Location(this.myLoc.x + 1, this.myLoc.y - 1);
		
		if(
		(this.myMap.getLoc(above)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(below)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(left)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(right)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(upperLeft)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(upperRight)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(lowerLeft)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(lowerRight)).contains(Map.Type.PACMAN) ||
		(this.myMap.getLoc(this.myLoc)).contains(Map.Type.PACMAN)
		) {
			return true;
		} else {
			return false;
		}

	}

	public boolean attack() {
		return false;
	}
}
