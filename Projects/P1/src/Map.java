import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map {

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

  public Map(int dim) {
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
    if (!field.containsKey(loc))
      field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // Stores the location and type of object specified in the parameters
    Location objectLocation = locations.get(name);
    JComponent objectComponent = components.get(name);

    // Removes the object "type" from the HashMap corresponding to the object's location
    field.get(objectLocation).remove(type);

    // If there is no object in the designated location, then it can be assumed that the desired object was
    // in the prefaced location.
    if (!field.containsKey(loc)) {
      field.put(loc, new HashSet<Type>());
    }

    field.get(loc).add(type);
    locations.put(name, loc);

    objectComponent.setLocation(loc.x, loc.y);

    return true;
  }

  /*
   * For the given location argument, returns what is currently at the location
   * (Empty, Pacman, Cookie, Ghost, Wall).
   */
  public HashSet<Type> getLoc(Location loc) {
    if (field.containsKey(loc) && field.get(loc) != null && field.get(loc).size() > 0) {
      return field.get(loc);
    } else if (loc.y < 0 || loc.x < 0 || loc.x > dim || loc.y > dim) {
      return wallSet;
    } else if(field.get(loc) != null){
      return emptySet;
    }

    return emptySet;
  }

  /**
   * // When a ghost attacks, ghost.attack() calls Map.attack()
   */
  public boolean attack(String name) {
    // if pacman is attacked, the game is over
    components.remove("pacman");
    Location pacLoc = locations.remove("pacman");
    gameOver = false;
    if (field.get(pacLoc).remove(Map.Type.PACMAN))
      gameOver = true;
    return gameOver;
  }

  public JComponent eatCookie(String name) {
    // update locations, components, field, and cookies
    // the id for a cookie at (10, 1) is tok_x10_y1

    Location cookieLoc = locations.get(name);
    if (getLoc(cookieLoc).contains(Map.Type.COOKIE)) {

       cookies--;
       field.remove(cookieLoc);
        String id = "tok_x" + cookieLoc.y + "_y" + cookieLoc.x;
     
       return components.get(name);
     }
     return null;
    }

  public Location find(String name){
    return locations.get(name);
  }

}
