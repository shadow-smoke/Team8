import java.io.*;
import junit.framework.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

  /*
   * pacman is between walls so theres no valid moves,
   * therefore move should be false since it cannot move
   */
  /*public void testPacManMove() throws FileNotFoundException {
    //NoFrame frame = new NoFrame();
    Map map = new Map(30);
    Location one = new Location(1, 1);
    Location two = new Location(2, 1);
    Location three = new Location(1, 2);
    Location four = new Location(3, 2);
    Location five = new Location(1, 3);
    Location six = new Location(2, 3);
    Location seven = new Location(3, 3);
    map.add("pacman", new Location(2,2), new PacManComponent(2,2, 1), Map.Type.PACMAN);
    WallComponent wc1 = new WallComponent(1, 1, 1);
    WallComponent wc2 = new WallComponent(2, 1, 1);
    WallComponent wc3 = new WallComponent(1, 2, 1);
    WallComponent wc4 = new WallComponent(3, 2, 1);
    WallComponent wc5 = new WallComponent(1, 3, 1);
    WallComponent wc6 = new WallComponent(2, 3, 1);
    WallComponent wc7 = new WallComponent(3, 3, 1);
    map.add("wall1", one, wc1, Map.Type.WALL);
    map.add("wall2", two, wc2, Map.Type.WALL);
    map.add("wall3", three, wc3, Map.Type.WALL);
    map.add("wall4", four, wc4, Map.Type.WALL);
    map.add("wall5", five, wc5, Map.Type.WALL);
    map.add("wall6", six, wc6, Map.Type.WALL);
    map.add("wall7", seven, wc7, Map.Type.WALL);

    PacMan pm = new PacMan("pacman",new Location(2,2),map);
    ArrayList<Location> noMoves = pm.get_valid_moves();
    System.out.println("Size is : " + noMoves.size());
    assertFalse(pm.move());

  }*/

  public void testPacManMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    PacMan pac = frame.addPacMan(new Location(2, 2));
    Location oldLoc = map.find(pac.myName);
    pac.move();
    Location newLoc = map.find(pac.myName);
    Location other = map.find(pac.myName);

    assertNotSame(oldLoc, newLoc);
    assertSame(newLoc, other);
  }

}
