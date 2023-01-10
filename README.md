# cmsc389T-winter23

Title: PACMAN PROJECT
Group: Nathan Perry, Fernando Gonzales-Vigil, Francesca Bruce, Sukhman Kaur

Image: 

How To Run Code From Command Line:


Code Block:



List of functions: 
Packman.java: 





consume()
This function will call the method eatCookie() in the Map.java class and returns the cookie component if the pacman’s current location or coordinates show that there is a power-cookie there. If there is no power cookie, NULL is returned. I implemented an IF check and used the getLoc method to check what was at the current location of pacman. If it was a cookie, I called eatCookie method and passed in the id, which is the string I created by using the x and y coordinates. Else, I returned null. 

consumeTest()



Ghost.java


attack()
This function controls the ghost attacking the pacman. If the pacman was in range, the ghost attacks the pacman and returns true. If not, it returns false. In order to implement this, I used the is_packman_in_range function to check if it was in range and if it was, I returned true and attacked the packman by calling that function from Map.java. Otherwise, I returned false.

Test:


Map.Java



