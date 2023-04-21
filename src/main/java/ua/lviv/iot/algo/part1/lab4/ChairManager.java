package ua.lviv.iot.algo.part1.lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChairManager {
    protected final List<Chair> chairs;

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

    public List<Chair> sortByChairType(List<Chair> list) {
        list.sort(Comparator.comparing(c -> c.getClass().getName()));
        return list;
    }
}
