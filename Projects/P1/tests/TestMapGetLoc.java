import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    Location pLocation = new Location(12,12);
    Location gLocation = new Location(10,9);
    frame.addPacMan(pLocation);
    frame.addGhost(gLocation,"binky", Color.red);
    Map map = frame.getMap();


    assertTrue(map.getLoc(pLocation).contains(contains(Map.Type.PACMAN)));
    assertTrue(map.getLoc(gLocation).contains(contains(Map.Type.GHOST)));


    assertTrue(map.getLoc(new Location(1,2)).contains(contains(Map.Type.EMPTY)));
    assertTrue(map.getLoc(new Location(12,4)).contains(contains(Map.Type.EMPTY)));

    assertTrue(map.getLoc(new Location(0,0)).contains(contains(Map.Type.WALL)));
  }
}
