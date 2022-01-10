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

		if (type == Type.PACMAN) {
			
			//updating locations, components, and field
			PacMan pac = new PacMan("pacman", loc, this);
			PacManComponent pc = new PacManComponent(loc.x, loc.y, 20);
			add(name, loc, pc, Type.PACMAN);
			
			//moving pacman to new location, otherwise returning false

			if (pac.move()) { 

				pc.setLocation(loc.x, loc.y);
			}

			else {
				return false; 
			}


		} 

		//type: ghost 

		else if (type == Type.GHOST) { 

			//updating locations, components, and field 
			Ghost ghost = new Ghost(name, loc, this); 
			GhostComponent gcomp = new GhostComponent(loc.x, loc.y, 20);
			add(name, loc, gcomp, Type.GHOST); 

			//moving ghost to new location, otherwise returning false 

			if (ghost.move()) { 
				gcomp.setLocation(loc.x, loc.y); 
			}

			else { 
				return false; 
			}
		}

		return true; 
	}
	
     public HashSet<Type> getLoc(Location loc) {

       HashSet<Type> returnValue = field.get(loc);

       return returnValue;

	}

	public boolean attack(String Name) {
		//update gameOver
		gameOver = true;
		return true;
	}
	
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
		//the id for a cookie at (10, 1) is tok_x10_y1
		return null;
	}
}
