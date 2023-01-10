import java.io.*;
import java.awt.*;
import junit.framework.*;
import java.util.*;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    Map myMap = new Map(20);
    Location location = new Location(9, 11);
    PacMan pacman = new PacMan("pacman1", location, myMap);
    ArrayList<Location> testValidMoves = new ArrayList<Location>();
    testValidMoves = pacman.get_valid_moves();

    // {(8, 10), (8, 11), (8, 12), (9, 10), (9, 11), (9, 12), (10, 10), (10, 11),
    // (10, 12)}
    ArrayList<Location> correctAnswers = new ArrayList<Location>();
    correctAnswers.add(new Location(8, 10));
    correctAnswers.add(new Location(8, 11));
    correctAnswers.add(new Location(8, 12));

    correctAnswers.add(new Location(9, 10));
    correctAnswers.add(new Location(9, 11));
    correctAnswers.add(new Location(9, 12));

    correctAnswers.add(new Location(10, 10));
    correctAnswers.add(new Location(10, 11));
    correctAnswers.add(new Location(10, 12));

    // System.out.println("correct answers: " + correctAnswers.toString());
    // System.out.println("output answers: " + testValidMoves.toString());

    // for (Location element : correctAnswers) {
    // System.out.println(element.x + ", " + element.y);
    // }

    // System.out.println("outputValues: ");

    // for (Location element : testValidMoves) {
    // System.out.println(element.x + ", " + element.y);
    // }

    System.out.println(testValidMoves);
    assertEquals(testValidMoves, correctAnswers);

    // Creating A Map
    // MainFrame frame = new MainFrame(); // Creates A New Map With Walls and Tokens
    // Initialized
    // NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens w/o
    // a Display

    // Creating Players
    // Ghost ghost2 = frame.addGhost(new Location(5, 5), "name", Color.red); //
    // Creates a red ghost named "name" at
    // location // x,y
    // PacMan pacman2 = frame.addPacMan(new Location(6, 6)); // Creates PacMan at
    // location x, y
    // System.out.println(pacman2.get_valid_moves());
  }

}
