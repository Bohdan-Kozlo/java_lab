package ua.lviv.iot.algo.part1.lab4.models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


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
        Assertions.assertEquals(55, table.getCurrentInclineBack());
    }

}