package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class ChairTest {
    Chair chair;

    @BeforeEach
    public void setUp(){
        chair = new FeedingTable(100,"wood", 200, 100, 40,60, "John", 2);
    }

    @Test
    public void testSetAndGetId() {
        setUp();
        int id = 1;
        chair.setId(id);
        assertEquals(id, chair.getId());
    }

    @Test
    public void testSetAndGetMaterial() {
        setUp();
        String material = "wood";
        chair.setMaterial(material);
        assertEquals(material, chair.getMaterial());
    }

    @Test
    public void testSetAndGetMaxWeight() {
        setUp();
        int maxWeight = 150;
        chair.setMaxWeight(maxWeight);
        assertEquals(maxWeight, chair.getMaxWeight());
    }

    @Test
    public void testSetAndGetOwner() {
        setUp();
        String owner = "John";
        chair.setOwner(owner);
        assertEquals(owner, chair.getOwner());
    }

    @Test
    public void testNoArgsConstructor() {
        setUp();
        Chair chair = new GameChair();
        assertNotNull(chair);
    }

    @Test
    public void testIsOccupied(){
        setUp();
        chair.occupy("Oleg");
        Assertions.assertTrue(chair.isOccupied());
    }

    @Test
    public void testRelease(){
        setUp();
        chair.release();
        Assertions.assertFalse(chair.isOccupied());
    }

}