import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();

    frame.addPacMan(new Location(10,10));
    frame.addGhost(new Location(4,5), "clyde", Color.blue);
    
    assertTrue(map.getLoc(new Location(10,10)).contains(Map.Type.PACMAN)); 
    assertTrue(map.getLoc(new Location(4,5)).contains(Map.Type.GHOST)); 
    assertTrue(map.getLoc(new Location(4,5)).contains(Map.Type.EMPTY) == false); 
    assertTrue(map.getLoc(new Location(20,40)).contains(Map.Type.WALL)); 
    assertTrue(map.getLoc(new Location(1,1)).contains(Map.Type.COOKIE)); 

  }
}
