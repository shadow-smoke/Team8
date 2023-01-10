import java.io.*;
import java.awt.Color;
import junit.*;
import junit.framework.*;

public class TestPacManInRange extends TestCase {
  //+ or - of (x,y) -> means in range
  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame= new NoFrame();
    Location pLocation = new Location(6,6);
    Location gLocation = new Location(1,12);
    PacMan p = frame.addPacMan(pLocation);
    Ghost g = frame.addGhost(gLocation,"inky", Color.red);
    assertTrue(p.is_ghost_in_range() == false);
  }

  public void testPacManInRange2() throws FileNotFoundException {
    NoFrame frame= new NoFrame();
    Location pLocation = new Location(9,9);
    Location gLocation = new Location(9,10);
    PacMan p = frame.addPacMan(pLocation);
    Ghost g =frame.addGhost(gLocation,"inky", Color.red);
    assertTrue(p.is_ghost_in_range());
  }
}