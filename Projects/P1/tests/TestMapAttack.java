import java.io.FileNotFoundException;
import junit.framework.*;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    PacMan pac = frame.addPacMan(new Location(1,1));
    assertFalse(map.isGameOver());
    map.attack("blinky");
    assertTrue(map.isGameOver());
  }
}
