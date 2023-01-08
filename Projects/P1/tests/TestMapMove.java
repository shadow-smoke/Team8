import java.io.*;
import junit.framework.*;
import javax.swing.JComponent;
import java.util.HashMap;
import java.util.HashSet;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    Map map = new Map(10);
    Location location1 = new Location(2, 2);
    Location location2 = new Location(3, 3);
    JComponent component = new JComponent() {

    };

    map.add("pacman1", location1, component, Map.Type.PACMAN);

    assertTrue(map.move("pacman1", location2, Map.Type.PACMAN));
  }
}
