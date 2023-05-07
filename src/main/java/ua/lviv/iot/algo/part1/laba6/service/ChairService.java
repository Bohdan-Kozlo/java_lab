package ua.lviv.iot.algo.part1.laba6.service;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.laba6.model.Chair;
import ua.lviv.iot.algo.part1.laba6.model.FeedingTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@NoArgsConstructor
@Scope(value = "singleton")
@Service
public class ChairService {
    private final HashMap<Integer, FeedingTable> chairs = new HashMap<>();
    private Integer nextAvailableId = 1;

    public List<FeedingTable> getAll() {
        return new ArrayList<>(chairs.values());
    }

    public FeedingTable getById(Integer id) {
        if (chairs.containsKey(id)) {
            return chairs.get(id);
        } else {
            return null;
        }
    }

    public void create(FeedingTable chair) {
        chair.setId(nextAvailableId);
        chairs.put(chair.getId(), chair);
        nextAvailableId++;
    }

    public Chair update(Integer id, FeedingTable chair) {
        if (chairs.containsKey(id)) {
            chairs.remove(id);
            chair.setId(nextAvailableId);
            chairs.put(chair.getId(), chair);
            return chair;
        }
        return null;
    }

    public boolean delete(Integer id) {
        if (chairs.containsKey(id) && id != null) {
            chairs.remove(id);
            return true;
        }
        return false;
    }
}