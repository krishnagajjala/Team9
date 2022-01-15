import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//type: pacman 
		if (type == Map.Type.PACMAN) {
			//updating locations, components, and field
			// PacMan pac = new PacMan("pacman", loc, this);
			locations.put(name, loc);
			components.get(name).setLocation(loc.x, loc.y);
			if(field.get(loc) == null) {
				field.put(loc, new HashSet<Type>());
			}
			field.get(loc).add(Map.Type.PACMAN);
			
			//moving pacman to new location, otherwise returning false

			// if (pac.move()) { 

			// 	// pc.setLocation(loc.x, loc.y);
			// }

			// else {
			// 	// return false; 
			// }
			return true; 
		} 

		//type: ghost 

		else if (type == Map.Type.GHOST) { 
			field.get(locations.get(name)).remove(Map.Type.GHOST);
			locations.put(name, loc);
			components.get(name).setLocation(loc.x, loc.y);
			if(field.get(loc) == null) {
				field.put(loc, new HashSet<Type>());
			}
			field.get(loc).add(Map.Type.GHOST);

			//updating locations, components, and field 
			// Ghost ghost = new Ghost(name, loc, this); 
			// GhostComponent gcomp = new GhostComponent(loc.x, loc.y, 20);
			// add(name, loc, gcomp, Type.GHOST); 

			// //moving ghost to new location, otherwise returning false 

			// if (ghost.move()) { 
			// 	gcomp.setLocation(loc.x, loc.y); 
			// }

			// else { 
			// 	return false; 
			// }
			return true; 
		}

		return false;  
	}
	
     public HashSet<Type> getLoc(Location loc) {

       HashSet<Type> returnValue = field.get(loc);

       return returnValue;

	}

	public boolean attack(String Name) {
		//update gameOver
		gameOver = true;
		return false;
	}
	
	public JComponent eatCookie(String name) {
		if( (getLoc(this.locations.get(name)) != null) && (getLoc(this.locations.get(name))).contains(Map.Type.COOKIE) ){
			Location thisLocation = this.locations.get(name);
			field.get(thisLocation).remove(Map.Type.COOKIE);
			JComponent returnValue = this.components.remove("tok_x"+thisLocation.x+"_y"+thisLocation.y);
			// HashSet<Type> newSet = this.field.get(thisLocation);
			// newSet.remove(Map.Type.COOKIE);
			// this.field.replace(thisLocation, newSet);
			this.cookies++;
			return returnValue;
		}
		return null;
	}
}
