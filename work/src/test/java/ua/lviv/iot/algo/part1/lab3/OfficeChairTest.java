package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class OfficeChairTest {
    OfficeChair table;

    @BeforeEach
    public void setUp(){table = new OfficeChair (1, "leather", 120, "Alex", "executive", "leather", 45);
    }

    @Test
    public void testGetAndSetChairType() {
        setUp();
        String newChairType = "Task";
        table.setChairType(newChairType);
        assertEquals(newChairType, table.getChairType());
    }

    @Test
    public void testGetAndSetMaterialOfUpholstery() {
        setUp();
        String newMaterialOfUpholstery = "Mesh";
        table.setMaterialOfUpholstery(newMaterialOfUpholstery);
        assertEquals(newMaterialOfUpholstery, table.getMaterialOfUpholstery());
    }

    @Test
    public void testAdjustPosition () {
            setUp();
            table.adjustPosition(10);
            assertEquals(55, table.getCurrentInclineBack());
    }

    @Test
    public void testGetAndSetCurrentInclineBack() {
        setUp();
        int newCurrentInclineBack = 5;
        table.setCurrentInclineBack(newCurrentInclineBack);
        assertEquals(newCurrentInclineBack, table.getCurrentInclineBack());
    }

}