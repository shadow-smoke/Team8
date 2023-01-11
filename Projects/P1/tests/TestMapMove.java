import java.io.*;
import junit.framework.*;
import javax.swing.JComponent;
import java.util.HashMap;
import java.util.HashSet;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {

    // NoFrame frame = new NoFrame();
    // Location loc1 = new Location(10, 10);
    // Location loc2 = new Location(11, 10);

    // HashSet<Type> type = frame.getMap().getLoc(loc2);
    /*
     * NoFrame frame = new NoFrame();
     * Location pLocation = new Location(12, 12);
     * Location gLocation = new Location(2, 3);
     * 
     * PacMan pacman = frame.addPacMan(pLocation);
     * Ghost ghost = frame.addGhost(gLocation, "inky", Color.red);
     * assertTrue(pacman.is_ghost_in_range() == false);
     */

    Map map = new Map(10);
    Location location1 = new Location(2, 2);
    Location location2 = new Location(3, 3);
    JComponent component = new JComponent() {

    };

    map.add("pacman1", location1, component, Map.Type.PACMAN);

    assertTrue(map.move("pacman1", location2, Map.Type.PACMAN));
  }
}
