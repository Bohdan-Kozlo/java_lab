package ua.lviv.iot.algo.part1.lab4.models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


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
        Assertions.assertTrue(chair.isOccupied());
    }

    @Test
    public void testRelease() {
        setUp();
        chair.release();
        Assertions.assertFalse(chair.isOccupied());
    }

    @Test
    public void testIsOccupied() {
        setUp();
        boolean testOccupied = chair.isOccupied();
        Assertions.assertTrue(testOccupied);
    }


}