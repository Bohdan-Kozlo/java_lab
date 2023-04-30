package ua.lviv.iot.algo.part1.lab4;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChairWriterTest {
    private static final String RESULT_FILE = "result.csv";
    private static final String EXPECTED_FILE = "expected.csv";
    private ChairWriter writer;
    private List<Chair> chairs;

    @Before
    public void setUp() {
        writer = new ChairWriter();
        chairs = new LinkedList<>();
        chairs.add(new FeedingTable(2, "plastic", 185, "Mary", 0, 75, 75, 1));
        chairs.add(new SoftChair(2, "suede", 150, "John", "foam", 60, true));
        chairs.add(new OfficeChair(1, "leather", 120, "Alex", "executive", "leather", 45));
        chairs.add(new FeedingTable(100, "wood", 200, "John", 40, 60, 100, 2));
    }

    @Test
    public void testWriteToFileWithNull() {
        writer = new ChairWriter();
        assertNull(writer.writeToFile(null));
    }

    @Test
    public void testRightToWriteFile() throws IOException {
        writer.writeToFile(chairs);
        Path expected = new File(EXPECTED_FILE).toPath();
        Path actual = new File(RESULT_FILE).toPath();
        assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testWriteToFileOverride() throws IOException {
        FileWriter newWriter = new FileWriter(RESULT_FILE);
        newWriter.write("anything can be written");
        newWriter.close();
        testRightToWriteFile();
    }


}