package swiggy_Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void testPlayerHealthReduction() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        playerA.reduceHealth(20);
        assertEquals(30, playerA.getHealth());
        playerB.reduceHealth(50);
        assertEquals(50, playerB.getHealth());
    }

    @Test
    public void testPlayerRollDice() {
        Player playerA = new Player(50, 5, 10);
        int result = playerA.rollDice(6);
        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB, 6);
        arena.fight(1); 
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testPlayerDeath() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        playerA.reduceHealth(60);
        assertFalse(playerA.isAlive());
        playerB.reduceHealth(150);
        assertFalse(playerB.isAlive());
    }

    @Test
    public void testNegativeHealth() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        playerA.reduceHealth(70);
        assertEquals(0, playerA.getHealth());
        playerB.reduceHealth(150);
        assertEquals(0, playerB.getHealth());
    }

    @Test
    public void testMultipleRounds() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB, 6);
        arena.fight(3); 
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testDifferentDiceSides() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB, 10);
        arena.fight(1); 
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testZeroRounds() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB, 6);
        arena.fight(0); 
        assertTrue(playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testZeroHealth() {
        Player playerA = new Player(0, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB, 6);
        arena.fight(1); 
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testEqualPlayerHealthAndStrength() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(50, 5, 10);
        Arena arena = new Arena(playerA, playerB, 6);
        arena.fight(1);
        assertFalse(playerA.isAlive() && playerB.isAlive()); 
    }
    
}
