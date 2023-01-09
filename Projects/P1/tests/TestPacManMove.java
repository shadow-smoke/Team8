import java.io.*;
import java.util.Random;
import junit.framework.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

  /*
  * tesPacManMove should verify that the moves method only returns true if
  * the chose location is one of the possible moves.
   */
  public void testPacManMove() throws FileNotFoundException {
    // new Location(9, 11);
    Location oldLocation = new Location(5, 10);
    Map mp = new Map(20);
    PacMan pacman = new PacMan("pacman", oldLocation, mp);
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

    int rd_loc_index = rn.nextInt(numMoves) + 1;
    pacman.myLoc = possibleMoves.get(rd_loc_index);
    pacman.myMap.move(pacman.myName, pacman.myLoc, Map.Type.PACMAN);

    assertTrue(possibleMoves.contains(pacman.myLoc));
    assertNotSame(oldLocation, pacman.myLoc);
  }
}
