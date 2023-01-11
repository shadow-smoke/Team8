import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    // Location locate = new Location(9, 12);
    // Map area = new Map(20);
    // PacMan pacman = new PacMan("pacman", locate, area);
    // int row = 9;
    // int col = 11;
    // Location cookieLoc = new Location(9, 11);
    // CookieComponent cookie = new CookieComponent(9, 11, 20);
    // String id = "tok_x9_y11";

    // area.add(id, cookieLoc, cookie, Map.Type.COOKIE);
 
    // cookie.setLocation(9, 11);

    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    PacMan pac = frame.addPacMan(new Location(1,1));

    
    assertTrue(map.eatCookie(pac.myName) != null);
    assertTrue(map.eatCookie(pac.myName) == null);
  }
}
