import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import junit.framework.*;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    Ghost g = frame.addGhost(new Location(2, 2), "blinky", Color.red);
    Location oldLoc = map.find(g.myName);
    g.move();
    Location newLoc = map.find(g.myName);
    Location other = map.find(g.myName);

    assertNotSame(oldLoc, newLoc);
    assertSame(newLoc, other);
  }
}
