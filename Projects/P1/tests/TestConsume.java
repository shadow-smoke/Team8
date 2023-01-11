import java.io.*;

import javax.accessibility.AccessibleText;

import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    
    // Location locate = new Location(9, 12);
    // Map area = new Map(20);
    // PacMan pacman = new PacMan("pacman", locate, area);
    // int row = 9;
    // int col = 12;
    // Location cookieLoc = new Location(9, 12);
    // CookieComponent cookie = new CookieComponent(9, 12, 20);

    // area.add("tok_x" + row + "_y" + col, cookieLoc, cookie, Map.Type.COOKIE);

    //System.out.println(pacman.consume());
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    PacMan pac = frame.addPacMan(new Location(1,1));
    assertTrue(pac.consume() != null);


  }
  public void testConsume2() throws FileNotFoundException {
    
    Location locate = new Location(9, 12);
    Map area = new Map(20);
    PacMan pacman = new PacMan("pacman", locate, area);
    int row = 9;
    int col = 11;
    Location cookieLoc = new Location(9, 11);
    CookieComponent cookie = new CookieComponent(9, 11, 20);

    area.add("tok_x" + row + "_y" + col, cookieLoc, cookie, Map.Type.COOKIE);
          
    
    assertTrue(pacman.consume() == null);


  }



}
