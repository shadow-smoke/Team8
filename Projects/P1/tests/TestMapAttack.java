import java.io.FileNotFoundException;
import junit.framework.*;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    Map mp = new Map(20);
    assertFalse(mp.isGameOver());
    mp.attack("blinky");
    assertTrue(mp.isGameOver());
  }
}
