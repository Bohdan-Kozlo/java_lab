package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class GameChairTest {
    GameChair table;

    @BeforeEach
    public void setUp(){
        table = new GameChair(1, "leather", 120, "Alex", 25, 100, 15);
    }

    @Test
    public void testGetAndSetCurrentHeightOfArmrests(){
        setUp();
        int newHeightOfArmrests = 30;
        table.setHeightOfArmrests(newHeightOfArmrests);
        assertEquals(newHeightOfArmrests, table.getHeightOfArmrests());
    }

    @Test
    public void testGetAndSetMaximumHeight(){
        setUp();
        int newMaximumHeight = 110;
        table.setMaximumHeight(newMaximumHeight);
        assertEquals(newMaximumHeight, table.getMaximumHeight());
    }

    @Test
    public void testGetAndSetWeightOfChair(){
        setUp();
        int newWeightOfChair = 12;
        table.setWeightOfChair(newWeightOfChair);
        assertEquals(newWeightOfChair, table.getWeightOfChair());
    }






}