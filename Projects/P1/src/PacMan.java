import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
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
      // if (myMap.getLoc(location) != null &&
      // !myMap.getLoc(location).contains(Map.Type.WALL)) {
      // output.add(location);
      // }

      // if any of surrounding points are a wall remove from ArrayList we are
      // returning
      if (myMap.getLoc(location) != null &&
          myMap.getLoc(location).contains(Map.Type.WALL)) {
        // System.out.println(allLocs.toString());
        allLocs.remove(location);
      }
    }

    return allLocs;
    // return output;

  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    if(myMap.getLoc(myLoc).contains(Map.Type.COOKIE)){
      //String id = "tok_x" + myLoc.x + "_y" + myLoc.y;
      return myMap.eatCookie(myName);
    } else{
        return null;
    }
   }
}