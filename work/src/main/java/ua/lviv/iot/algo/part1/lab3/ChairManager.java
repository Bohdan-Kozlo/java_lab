package ua.lviv.iot.algo.part1.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChairManager {
    private final List<Chair> chairs;

    public ChairManager() {
        chairs = new ArrayList<>();
    }

    public void addChair(Chair chair) {
        chairs.add(chair);
    }

    public List<Chair> searchByMaterial(String material) {
        return chairs.stream()
                .filter(c -> c.getMaterial() != null && c.getMaterial().equals(material))
                .toList();
    }

    public List<Chair> searchByMaxWeight(int maxWeight) {
        return chairs.stream()
                .filter(c -> c.getMaxWeight() >= maxWeight)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ChairManager manager = new ChairManager();
        manager.addChair(new FeedingTable(1,"wood", 200, 100, 40,40, "John", 2));
        manager.addChair(new FeedingTable(2, "plastic",185, 50, 30,60, "Mary", 1));
        manager.addChair(new GameChair(1, "leather", 120, "Alex", 25, 100, 15));
        manager.addChair(new GameChair(2, "mesh", 80, "Kate", 20, 95, 10));
        manager.addChair(new OfficeChair(1, "leather", 120, "Alex", "executive", "leather", 45));
        manager.addChair(new OfficeChair(2, "mesh", 80, "Kate", "task", "fabric", 30));
        manager.addChair(new SoftChair(1, "suede", 150, "John", "foam", 60, true));
        manager.addChair(new SoftChair(2, "leather", 200, "Kate", "polyester", 70, false));
        System.out.println(manager.searchByMaxWeight(180));
        System.out.println(manager.searchByMaterial("leather"));


    }
}
