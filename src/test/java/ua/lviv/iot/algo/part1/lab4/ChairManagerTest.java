package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChairManagerTest {
    private ChairManager manager;
    private final FeedingTable chair1 = new FeedingTable(1, "wood", 200, "John", 140, 50, 100, 2);
    private final FeedingTable chair2 = new FeedingTable(2, "plastic", 185, "Mary", 110, 75, 75, 1);
    private final OfficeChair chair3 = new OfficeChair(1, "leather", 120, "Alex", "executive", "leather", 45);
    private final SoftChair chair4 = new SoftChair();
    private final FeedingTable chair5 = new FeedingTable(100, "wood", 200, "John", 40, 60, 100, 2);
    private final GameChair chair6 = new GameChair();

    @BeforeEach
    public void setUp() {
        manager = new ChairManager();
        manager.addChair(chair1);
        manager.addChair(chair2);
        manager.addChair(chair3);
        manager.addChair(chair4);
        manager.addChair(chair5);
        manager.addChair(chair6);
    }

    @Test
    public void testAddNullChair() {
        manager.addChair(null);
        assertTrue(manager.chairs.contains(null));
    }

    @Test
    public void testAddChair() {
        Chair chair = new SoftChair(1, "suede", 150, "John", "foam", 60, true);
        manager.addChair(chair);
        assertTrue(manager.chairs.contains(chair));
    }

    @Test
    public void testSearchByMaterial() {
        setUp();
        List<Chair> result = manager.searchByMaterial("wood");
        assertEquals(2, result.size());
    }

    @Test
    public void testSearchByMaxWeight() {
        setUp();
        List<Chair> result = manager.searchByMaxWeight(190);
        assertEquals(2, result.size());
    }

    @Test
    public void testSearchByNonExistentMaterial() {
        setUp();
        List<Chair> result = manager.searchByMaterial("metal");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSearchByNonExistentMaxWeight() {
        setUp();
        List<Chair> result = manager.searchByMaxWeight(300);
        assertTrue(result.isEmpty());

    }

    @Test
    public void testSortByChairTypeNull() {
        List<Chair> chairs = new ArrayList<>();
        List<Chair> result = manager.sortByChairType(chairs);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testSortByChairType() {
        List<Chair> expected = new ArrayList<>();
        expected.add(chair1);
        expected.add(chair2);
        expected.add(chair5);
        expected.add(chair6);
        expected.add(chair3);
        expected.add(chair4);
        List<Chair> actual = manager.sortByChairType(manager.chairs);
        assertEquals(expected, actual);
    }

}