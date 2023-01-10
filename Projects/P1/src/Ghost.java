import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
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
      // if (myMap.getLoc(location) != null &&
      // myMap.getLoc(location).contains(Map.Type.EMPTY)) {
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

    // return output;
    return allLocs;

  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
