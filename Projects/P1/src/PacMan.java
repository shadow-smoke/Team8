import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  private List<Location> history;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
    this.history = new ArrayList<>();
    history.add(loc);
  }

  public ArrayList<Location> get_valid_moves() {
    int x = myLoc.x;
    int y = myLoc.y;

    // get arraylist for all points surrounding current point first
    ArrayList<Location> allLocs = new ArrayList<Location>();
    ArrayList<Location> output = new ArrayList<Location>();
    for (int i = x - 1; i < (x + 2); i++) {
      for (int j = y - 1; j < (y + 2); j++) {
        Location newLoc = new Location(i, j);
        allLocs.add(newLoc);
      }
    }

    for (Location location : allLocs) {
	if (!myMap.getLoc(location).contains(Map.Type.WALL)) {
	    output.add(location);
	}
    }
    return output;
  }

  public boolean move() {
    // Stores the array of valid moves
    ArrayList<Location> locations = get_valid_moves();
    int numMoves = locations.size();
    // Used to move in a random valid direction
    Random rn = new Random();

    // Check if there are any valid moves to make
    if (numMoves > 0) {
      // Get a random number given the number of valid moves
      int rd_loc_index = rn.nextInt(numMoves);
      // Move to that location
      myLoc = locations.get(rd_loc_index);
      myMap.move(myName, myLoc, Map.Type.GHOST);
      return true;
    }
    return false;
  }

  public boolean is_ghost_in_range() {
    if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.GHOST)) {
      return true;
    }
    if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.GHOST)) {
      return true;
    }
    if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.GHOST)) {
      return true;
    }
    if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.GHOST)) {
      return true;
    }

    return false;
  }

  public JComponent consume() {
    if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE)) {
      String id = "tok_x" + myLoc.x + "_y" + myLoc.y;
      return myMap.eatCookie(id);
    } else {
      return null;
    }
  }
}
