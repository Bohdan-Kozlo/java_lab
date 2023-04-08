package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class FeedingTableTest {
    FeedingTable table;

    @BeforeEach
    void setUp(){table = new FeedingTable(2, "plastic",185, 200, 0,75, "Mary", 1);
    }

    @Test
    public void testGetAndSetMaxHeightChair() {
        setUp();
        int newMaxHeightChair = 60;
        table.setMaxHeightChair(newMaxHeightChair);
        assertEquals(newMaxHeightChair, table.getMaxHeightChair());
    }

    @Test
    public void testGetAndSetMinHeightChair() {
        setUp();
        int newMinHeightChair = 30;
        table.setMinHeightChair(newMinHeightChair);
        assertEquals(newMinHeightChair, table.getMinHeightChair());
    }

    @Test
    public void testGetAndSetAgeChild() {
        setUp();
        int newAgeChild = 3;
        table.setAgeChild(newAgeChild);
        assertEquals(newAgeChild, table.getAgeChild());
    }

    @Test
    public void testGetAndSetCurrentHeightChar() {
        setUp();
        int newCurrentHeightChar = 40;
        table.setCurrentHeightChar(newCurrentHeightChar);
        assertEquals(newCurrentHeightChar, table.getCurrentHeightChar());
    }


    @Test
    public void testAdjustPosition(){
        setUp();
        table.adjustPosition(10);
        assertEquals(85, table.getCurrentHeightChar());

        table.adjustPosition(10);
        assertTrue(table.getCurrentHeightChar() <= table.getMaxHeightChair());

        table.adjustPosition(-10);
        assertTrue(table.getCurrentHeightChar() >= table.getMinHeightChair());

    }


}