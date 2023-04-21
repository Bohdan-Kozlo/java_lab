package ua.lviv.iot.algo.part1.lab4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChairManager manager = new ChairManager();
        ChairWriter writer = new ChairWriter();
        manager.addChair(new FeedingTable(100, "wood", 200, "John", 40, 60, 100, 2));
        manager.addChair(new OfficeChair (1, "leather", 120, "Alex", "executive", "leather", 45));
        manager.addChair(new SoftChair());
        manager.addChair(new OfficeChair());
        manager.addChair(new FeedingTable());
        List<Chair> sordList = manager.sortByChairType(manager.chairs);


        writer.writeToFile(manager.chairs);

    }

}
