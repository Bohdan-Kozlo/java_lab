package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SoftChairTest {

    private SoftChair chair;

    @BeforeEach
    public void setUp(){
        chair = new SoftChair(1, "suede", 150, "John", "foam", 60, true);
    }

    @Test
    public void testGetAndSetFiller(){
        setUp();
        String newFiller = "filer";
        chair.setFiller(newFiller);
        assertEquals(newFiller, chair.getFiller());
    }

    @Test
    public void testGetAndSetDepth(){
        setUp();
        int newDepth = 50;
        chair.setDepth(newDepth);
        assertEquals(newDepth, chair.getDepth());
    }

    @Test
    public void testGetAndSetCushioning(){
        setUp();
        boolean newCushioning = false;
        chair.setCushioning(newCushioning);
        assertEquals(newCushioning, chair.isCushioning());
    }







}