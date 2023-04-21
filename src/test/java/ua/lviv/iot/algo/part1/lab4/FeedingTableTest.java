package ua.lviv.iot.algo.part1.lab4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class FeedingTableTest {
    FeedingTable table;

    @BeforeEach
    void setUp() {
        table = new FeedingTable(2, "plastic", 185, "Mary", 120, 0, 75, 1);
    }

    @Test
    public void testAdjustPosition() {
        setUp();
        table.adjustPosition(10);
        assertEquals(85, table.getCurrentHeightChar());

        table.adjustPosition(10);
        assertTrue(table.getCurrentHeightChar() <= table.getMaxHeightChair());

        table.adjustPosition(-10);
        assertTrue(table.getCurrentHeightChar() >= table.getMinHeightChair());
    }

}