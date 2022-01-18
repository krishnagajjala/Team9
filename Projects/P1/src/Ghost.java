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

		ArrayList<Location> validMoves = new ArrayList<Location>();

                //moving right

				if (myMap.getLoc(myLoc.shift(1, 0)) != null && !myMap.getLoc(myLoc.shift(1, 0)).contains(Map.Type.WALL)) {

					validMoves.add(myLoc.shift(1,0));
			}

			//moving left

			if (myMap.getLoc(myLoc.shift(-1, 0)) != null && !myMap.getLoc(myLoc.shift(-1, 0)).contains(Map.Type.WALL)) {

					validMoves.add(myLoc.shift(-1,0));
			}

			//moving up

			if (myMap.getLoc(myLoc.shift(0, 1)) != null && !myMap.getLoc(myLoc.shift(0, 1)).contains(Map.Type.WALL)) {

					validMoves.add(myLoc.shift(0,1));
			}

			//moving down

			if (myMap.getLoc(myLoc.shift(0, -1)) != null && !myMap.getLoc(myLoc.shift(0, -1)).contains(Map.Type.WALL)) {

					validMoves.add(myLoc.shift(0,-1));
			}


			return validMoves;
        }

	public boolean move(){
    ArrayList<Location> validPositions = this.get_valid_moves();
    if(validPositions.isEmpty()){
      return false;
    }else{
      myLoc = validPositions.get((int) (Math.random() * validPositions.size()));
	  myMap.move(myName, myLoc, Map.Type.GHOST);
      return true;
    }

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
		( (this.myMap.getLoc(above) != null) && (this.myMap.getLoc(above)).contains(Map.Type.PACMAN) ) ||
		( (this.myMap.getLoc(below) != null) && (this.myMap.getLoc(below)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(left) != null) && (this.myMap.getLoc(left)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(right) != null) && (this.myMap.getLoc(right)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(upperLeft) != null) && (this.myMap.getLoc(upperLeft)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(upperRight) != null) && (this.myMap.getLoc(upperRight)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(lowerLeft) != null) && (this.myMap.getLoc(lowerLeft)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(lowerRight) != null) && (this.myMap.getLoc(lowerRight)).contains(Map.Type.PACMAN) )||
		( (this.myMap.getLoc(this.myLoc) != null) && (this.myMap.getLoc(this.myLoc)).contains(Map.Type.PACMAN) )
		) {
			return true;
		} else {
			return false;
		}
	}

	public boolean attack() {
		if (this.is_pacman_in_range()){
			this.myMap.attack(myName);
			// return true;
			return true;
		} 
		return false;
		// if(move()) {
		// 	return this.myMap.getCookies() != 0;
		// }
		// return true;
	}
}
