import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice(6, "red");
    }
    @Test
    void getSides() {
        assertEquals(6, dice.getSides());
    }

    @Test
    void getColor() {
        assertEquals("red", dice.getColor());
    }

    @Test
    void roll() {
        int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    void rollMany() {
        int[] rolls = dice.rollMany(10);
        assertEquals(10, rolls.length);
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6);
        }
    }
}