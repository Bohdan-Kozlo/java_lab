package ua.lviv.iot.algo.part1.lab4.models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

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
        Assertions.assertEquals(85, table.getCurrentHeightChar());

        table.adjustPosition(10);
        Assertions.assertTrue(table.getCurrentHeightChar() <= table.getMaxHeightChair());

        table.adjustPosition(-10);
        Assertions.assertTrue(table.getCurrentHeightChar() >= table.getMinHeightChair());
    }

}