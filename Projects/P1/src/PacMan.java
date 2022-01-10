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
		 ArrayList<Location> validMoves = new ArrayList<Location>();

                //moving right

                if (myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.WALL)) {

                        validMoves.add(myLoc.shift(1,0));
                }

                //moving left

                else if (myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.WALL)) {

                        validMoves.add(myLoc.shift(-1,0));
                }

                //moving up

                else if (myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.WALL)) {

                        validMoves.add(myLoc.shift(0,1));
                }

                //moving down

                else if (myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.WALL)) {

                        validMoves.add(myLoc.shift(0,-1));
                }


                return validMoves;
		
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
