package ua.lviv.iot.algo.part1.lab4.write;

import ua.lviv.iot.algo.part1.lab4.menager.ChairManager;
import ua.lviv.iot.algo.part1.lab4.models.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChairWriter {
    private static final String FILE_NAME = "result.csv";

    public String writeToFile(List<Chair> chairs) {
        if (chairs == null || chairs.isEmpty()) {
            return null;
        }
        File file = new File(FILE_NAME);
        ChairManager manager = new ChairManager();
        List<Chair> sortedChair = manager.sortByChairType(chairs);
        String prevHeader = null;
        try (FileWriter writer = new FileWriter(file)) {
            for (var chair : sortedChair) {
                String currHeader = chair.getHeaders();
                if (currHeader != null && !currHeader.equals(prevHeader)) {
                    writer.write(currHeader);
                    writer.write("\n");
                    prevHeader = currHeader;
                }
                writer.write(chair.toCSV());
                writer.write("\n");
            }
            return FILE_NAME;
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
