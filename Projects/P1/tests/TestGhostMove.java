import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    // dummy data for get_valid_moves
    Location oldLocation = new Location(5, 10);
    Map mp = new Map(20);
    Ghost blinky = new Ghost("blinky", oldLocation, mp);
    ArrayList<Location> possibleMoves = new ArrayList<>();
    possibleMoves.add(new Location(4, 9));
    possibleMoves.add(new Location(4, 10));
    possibleMoves.add(new Location(4, 11));
    possibleMoves.add(new Location(5, 9));
    possibleMoves.add(new Location(5, 11));
    possibleMoves.add(new Location(6, 9));
    possibleMoves.add(new Location(6, 10));
    possibleMoves.add(new Location(6, 11));
    int numMoves = possibleMoves.size();

    // reimplement moves in Test to verify algorithm
    Random rn = new Random();
    int rd_loc_index = rn.nextInt(numMoves);
    blinky.myLoc = possibleMoves.get(rd_loc_index);
    // updating location in map
    blinky.myMap.move(blinky.myName, blinky.myLoc, Map.Type.GHOST);

    assertTrue(possibleMoves.contains(blinky.myLoc));
    assertNotSame(oldLocation, blinky.myLoc);
  }
}
