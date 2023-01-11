import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {

    //Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(9, 11), "Boo", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(9, 12)); //Creates PacMan at location x, y

    boolean attackSuccessfull = ghost.attack();
    boolean correct = true;

    assertEquals(attackSuccessfull, correct);

  }
  public void testAttack2() throws FileNotFoundException {

    //Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized
    NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(9, 11), "Boo", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(9, 15)); //Creates PacMan at location x, y

    boolean attackSuccessfull = ghost.attack();
    boolean correct = false;

    assertEquals(attackSuccessfull, correct);

  }
}
