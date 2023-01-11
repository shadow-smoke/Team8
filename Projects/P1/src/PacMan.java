import java.util.ArrayList;
import java.util.Random;
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
          myMap.getLoc(location).contains(Map.Type.EMPTY)) {
        // System.out.println(allLocs.toString());
        output.add(location);
      }
    }

    return output;
    //return allLocs;
  }
 
 public boolean move() {
    ArrayList<Location> locations = get_valid_moves();
    int numMoves = locations.size();
    Random rn = new Random();

    if (numMoves > 0) {
      int rd_loc_index = rn.nextInt(numMoves);
      myLoc = locations.get(rd_loc_index);
      myMap.move(myName, myLoc, Map.Type.GHOST);
      return true;
    }
    return false;
  }
 
 public boolean is_ghost_in_range() {
    if(myMap.getLoc(new Location(myLoc.x+1,myLoc.y)).contains(Map.Type.GHOST)){
      return true;
    }
    if(myMap.getLoc(new Location(myLoc.x,myLoc.y+1)).contains(Map.Type.GHOST)){
      return true;
    }
    if(myMap.getLoc(new Location(myLoc.x-1,myLoc.y)).contains(Map.Type.GHOST)){
      return true;
    }
    if(myMap.getLoc(new Location(myLoc.x,myLoc.y-1)).contains(Map.Type.GHOST)){
      return true;
    }

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
