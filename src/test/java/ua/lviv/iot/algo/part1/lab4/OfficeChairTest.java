package ua.lviv.iot.algo.part1.lab4;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class OfficeChairTest {
    OfficeChair table;

    @BeforeEach
    public void setUp() {
        table = new OfficeChair(1, "leather", 120, "Alex", "executive", "leather", 45);
    }

    @Test
    public void testAdjustPosition() {
        setUp();
        table.adjustPosition(10);
        assertEquals(55, table.getCurrentInclineBack());
    }

}