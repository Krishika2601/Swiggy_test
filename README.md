# Magical Arena Swiggy

This program simulates a magical arena where two players can engage in battles. 
Each player is defined by their health, strength, and attack attributes.

## Running the Code

To run the code, follow these steps:

1. Ensure you have Java installed, I used java version :17 .
2. Open a terminal or eclipse-IDE and navigate to the Project folder.
3. Compile the Java files using the following command:
```java
javac Player.java Arena.java Main.java ArenaTest.java
```
4. For Eclipse: Run the Main.java as Java Application
5. Run the program using the following command:
```java
java Main
```
6. Follow the prompts to input the attributes for Player A and Player B, as well as other parameters such as the number of sides on the dice and the number of rounds to fight.
- The program will display the progress of the battle in the console, including each round's details and the players' remaining health.
- Players attack in turns, with the player with lower health attacking first at the start of each round.
- The battle continues until one of the players' health reaches zero.


## Unit Tests

Unit tests for the Player and Arena classes are included in the `ArenaTest.java` file.

The following tests are covered:

1. **Player Health Reduction**: Tests the functionality of reducing a player's health.
2. **Player Roll Dice**: Tests the functionality of rolling a dice for a player.
3. **Fight**: Tests the outcome of a battle after a specified number of rounds.
4. **Player Death**: Tests the condition of player death when their health reaches zero.
5. **Negative Health**: Tests the behavior when a player's health goes below zero.
6. **Multiple Rounds**: Tests the outcome of a battle after multiple rounds.
7. **Different Dice Sides**: Tests the outcome of a battle with a different number of sides on the dice.
8. **Zero Rounds**: Tests the behavior when zero rounds are specified for a battle.
9. **Zero Health**: Tests the condition of player death when their initial health is zero.
10. **Equal Player Health and Strength**: Tests the outcome of a battle between players with equal initial health and strength.


Run the unit tests using JUnit




