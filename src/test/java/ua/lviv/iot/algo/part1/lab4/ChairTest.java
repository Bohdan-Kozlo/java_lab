package ua.lviv.iot.algo.part1.lab4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ChairTest {
    Chair chair;

    @BeforeEach
    public void setUp() {
        chair = new FeedingTable(100, "wood", 200, "John", 40, 60, 100, 2);
    }

    @Test
    public void testOccupy() {
        setUp();
        chair.occupy("Oleg");
        assertTrue(chair.isOccupied());
    }

    @Test
    public void testRelease() {
        setUp();
        chair.release();
        assertFalse(chair.isOccupied());
    }

    @Test
    public void testIsOccupied() {
        setUp();
        boolean testOccupied = chair.isOccupied();
        assertTrue(testOccupied);
    }


}