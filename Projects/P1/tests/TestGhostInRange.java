import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  // + or - of (x,y) -> means in range
  public void testGhostInRange() throws FileNotFoundException {

    NoFrame frame = new NoFrame();
    Location pLocation = new Location(12, 12);
    Location gLocation = new Location(2, 3);

    PacMan pacman = frame.addPacMan(pLocation);
    Ghost ghost = frame.addGhost(gLocation, "inky", Color.red);
    assertTrue(pacman.is_ghost_in_range() == false);
  }

  public void testGhostInRange2() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Location pLocation = new Location(12, 12);
    Location gLocation = new Location(12, 13);

    PacMan pacman = frame.addPacMan(pLocation);
    Ghost ghost = frame.addGhost(gLocation, "inky", Color.red);
    assertTrue(pacman.is_ghost_in_range());
  }
}

