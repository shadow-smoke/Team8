import java.util.ArrayList;
import java.util.Random;

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
    return null;
  }

  public boolean move() {
    ArrayList<Location> locations = get_valid_moves();
    int numMoves = locations.size();
    Random rn = new Random();

    if (numMoves > 0){
      int rd_loc_index = rn.nextInt(numMoves) + 1;
      myLoc = locations.get(rd_loc_index);
      return true;
    }

    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
