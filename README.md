# cmsc389T-winter23

# PACMAN PROJECT 1

### Team 8

* Nathan Perry
* Fernando Gonzales-Vigil
* Francesca Bruce
* Sukhman Kaur

Image: 

![PacMan Screenshot](https://github.com/cmsc389T-winter23/Team8/blob/main/Projects/P1/src/assets/screenshot.png)

How To Run Code From Command Line:

`javac -cp "src/" src/*.java`
`java -cp "src/" StartMenu`

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

get_valid_moves()
This function creates an array list of all possible points that a Pacman could go. It then iterates through this list and removes ones that are not null and that the Map.Type is a Wall.

### **Ghost.java**

move()
The method calls get_valid_moves() for all possible valid locations and picks one of those  at
random, updates the location in map an returns true. If there's no valid moves it returns false.

attack()
This function controls the ghost attacking the pacman. If the pacman was in range, the ghost attacks the pacman and returns true. If not, it returns false. In order to implement this, I used the is_packman_in_range function to check if it was in range and if it was, I returned true and attacked the packman by calling that function from Map.java. Otherwise, I returned false.

is_pacman_in_range()
This method checks and returns true if a Ghost’s surroundings has Pacman within its range to attack. The range is identified as if Pacman is up, down, left or right of the Ghost.

get_valid_moves()
This function creates an array list of all possible points that a Ghost could go. It than iterates through this list and removes ones that are not null and that the Map.Type is a Wall.

### **Map.Java**

attack(String name)
This method assumes that its going to be called by Ghost.attack() so if it's called it changes the state of gameOver to true and return true;

getLoc()
This method return what the is in the current location. It can return Empty, Pacman, Cookie, Ghost, Wall.

move()
This function gets the location and component based off of the name of the item and then removes it from the field. It then checks to see if the field contains a key with the location passed as a parameter, if it does not contain a key it creates a new HashSet of Type type that is passed in. It then adds the type to the location in the field and puts the name, location pair into the class wide location object. I then set the location of the component to the location x and y values and then return true.

eatCookie()
This method is made so the pacman actually consumed the cookie if the location of itself and the cookie are the same. I wrote it so I remove the cookie from the hashmaps: components and field by using the name passed into the parameter. I also updated the locations hashmap to show the location as NULL. After, I incremented the number of cookies eaten and returned the cookie component. If it was not in the map, I returned NULL. 


### **Tests**

TestPacManMove()
This test creates a dummy list of valid locations and test that it will return true when it picks one.

TestPacmanInRange()
This test checks the is_pacman_in_range method as it checks for a valid range where Pacman is in the left, right , up or down of a Ghost. There is also another test when there is no Pacman within range of a Ghost.

TestGhostMove()
This test creates a dummy list of valid locations for ghost and test that it will return true when it picks one.

TestGhostInRange()
This test checks the is_ghost_in_range method as it checks for a valid range where the Ghost is in the left, right , up or down of Pacman. There is also another test when there is no Ghost within range of Pacman.

TestAttack()
This test checks to see if pacman is in range and attacks and then returns true or false based on if the pacman is in range. The first test checks for returning true since pacman location is only one away from ghost and false for the second test since it's location is further. 

TestConsume()
I tested the method by creating a map, pacman, and cookie component. I set the locations for both the pacman and cookie component to the same thing and called consume and checked if it returned null or not. I did a second test to have the locations of cookie and pacman to be different and checked if the function returned null.


TestMapEatCookie()
This test was written to check if the cookie was actually eaten, i.e removed from components and field. If it was, then the return was not NULL. Once it is removed the function should return NULL so I added a second check to make sure it returned NULL. 

TestMapAttack()
This test verifies that the state of gameOver is change before and after it is called.

TestMapGetLoc()
This test checks if the correct  item is being returned given a specified location. 


TestPacManValidMoves()
I create a new map and Pacman. I then store the return value of pacman.get_valid_moves() as an arraylist and then create an array list of all the possible directions the ghost would be able to go. I assert true if these lists match.

TestGhostValidMoves()
I create a new map and ghost. I then store the return value of ghost.get_valid_moves() as an array list and then create an array list of all the possible directions the ghost would be able to go. I assert true if these lists match.

TestMapMove()
I create a new map and locations. I add a new Pacman object to the map and then assert true that map.move works on the Pacman object.


