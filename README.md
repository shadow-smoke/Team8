# cmsc389T-winter23

# **PACMAN PROJECT 1

### Team 8** 

_* Nathan Perry
* Fernando Gonzales-Vigil
* Francesca Bruce
* Sukhman Kaur_

Image: 

How To Run Code From Command Line:


Code Block:


List of functions: 

### **PacMan.java** 

move()
The method calls get_valid_moves() for all possible valid locations and picks one of those  at 
random, updates the location in map an returns true. If there's no valid moves it returns false.

consume()
This function will call the method eatCookie() in the Map.java class and returns the cookie component 
if the pacman’s current location or coordinates show that there is a power-cookie there. 
If there is no power cookie, NULL is returned. I implemented an IF check and used the getLoc method 
to check what was at the current location of pacman. If it was a cookie, I called eatCookie method 
and passed in the id, which is the string I created by using the x and y coordinates. 
Else, I returned null.

is_ghost_in_range()
This method checks and returns true if Pacman’s surroundings has any Ghost within its range to attack. The range is identified as if the Ghost is up, down, left or right of Pacman.


### **Ghost.java**

move()
The method calls get_valid_moves() for all possible valid locations and picks one of those  at
random, updates the location in map an returns true. If there's no valid moves it returns false.

attack()
This function controls the ghost attacking the pacman. If the pacman was in range, the ghost attacks the pacman and returns true. If not, it returns false. In order to implement this, I used the is_packman_in_range function to check if it was in range and if it was, I returned true and attacked the packman by calling that function from Map.java. Otherwise, I returned false.

is_pacman_in_range()
This method checks and returns true if a Ghost’s surroundings has Pacman within its range to attack. The range is identified as if the ghost is up, down, left or right of the Ghost.


### **Map.Java**

attack(String name)
This method assumes that its going to be called by Ghost.attack() so if it's called it changes the state of gameOver to true and return true;

getLoc()
This method return what the is in the current location. It can return Empty, Pacman, Cookie, Ghost, Wall.


### **Tests**

TestPacManMove()
This test creates a dummy list of valid locations and test that it will return true when it picks one.

TestPacmanInRange()
This test checks the is_pacman_in_range method as it checks for a valid range where Pacman is in the left, right , up or down of a Ghost. There is also another test when there is no Pacman within range of a Ghost.

TestGhostMove()
This test creates a dummy list of valid locations for ghost and test that it will return true when it picks one.

TestGhostInRange()
This test checks the is_ghost_in_range method as it checks for a valid range where the Ghost is in the left, right , up or down of Pacman. There is also another test when there is no Ghost within range of Pacman.

TestConsume()

TestMapAttack()
This test verifies that the state of gameOver is change before and after it is called.

TestMapGetLoc()
This test checks if the correct  item is being returned given a specified location. 




