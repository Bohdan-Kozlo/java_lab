package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChairManagerTest {
    private ChairManager manager;

    @BeforeEach
    public void setUp() {
        manager = new ChairManager();
        manager.addChair(new FeedingTable(1, "wood", 200, 100, 40, 50, "John", 2));
        manager.addChair(new FeedingTable(2, "plastic", 90, 50, 30, 60, "Mary", 1));
    }

    @Test
    public void testSearchByMaterial() {
        setUp();
        List<Chair> result = manager.searchByMaterial("wood");
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("wood", result.get(0).getMaterial());
    }

    @Test
    public void testSearchByMaxWeight() {
        setUp();
        List<Chair> result = manager.searchByMaxWeight(100);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(200, result.get(0).getMaxWeight());
    }

    @Test
    public void testSearchByNonExistentMaterial() {
        setUp();
        List<Chair> result = manager.searchByMaterial("metal");
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void testSearchByMaxWeightZero() {
        setUp();
        List<Chair> result = manager.searchByMaxWeight(0);
        Assertions.assertFalse(result.isEmpty());

    }

}