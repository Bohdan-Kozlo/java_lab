package ua.lviv.iot.algo.part1.lab4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ChairWriter {
    private static final String fileName = "result.csv";
    private boolean feedingTableHeader = false;
    private boolean gameChairHeader = false;
    private boolean officeChairHeader = false;
    private boolean softChairHeader = false;

    public String writeToFile(List<Chair> chairs) {
        if (chairs == null || chairs.isEmpty()) {
            return null;
        }
        File file = new File(fileName);
        ChairManager manager = new ChairManager();
        List<Chair> sortedChair = manager.sortByChairType(chairs);
        try {
            FileWriter writer = new FileWriter(file);
            for (var chair : sortedChair) {
                if (chair instanceof FeedingTable && !feedingTableHeader) {
                    writer.write(chair.getHeaders());
                    feedingTableHeader = true;
                    writer.write("\n");
                } else if (chair instanceof GameChair && !gameChairHeader) {
                    writer.write(chair.getHeaders());
                    gameChairHeader = true;
                    writer.write("\n");
                } else if (chair instanceof OfficeChair && !officeChairHeader) {
                    writer.write(chair.getHeaders());
                    officeChairHeader = true;
                    writer.write("\n");
                } else if (chair instanceof SoftChair && !softChairHeader) {
                    writer.write(chair.getHeaders());
                    softChairHeader = true;
                    writer.write("\n");
                }
                writer.write(chair.toCSV());
                writer.write("\n");
            }
            writer.close();
            return fileName;
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }


}
