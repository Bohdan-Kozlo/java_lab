package ua.lviv.iot.algo.part1.lab4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab4.models.Chair;
import ua.lviv.iot.algo.part1.lab4.models.FeedingTable;
import ua.lviv.iot.algo.part1.lab4.service.ChairService;

import java.util.List;

@RequestMapping("/chairs")
@RestController
public class ChairController {

    @Autowired
    private ChairService service;

    @GetMapping
    public List<FeedingTable> getChairs() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FeedingTable> getUserById(@PathVariable Integer id) {
        FeedingTable chair = service.getById(id);
        if (chair == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(chair);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteChair(@PathVariable Integer id) {
        boolean delete = service.deleteChair(id);
        if (delete) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createChair(@RequestBody FeedingTable chair) {
        service.createChair(chair);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/chair{id}")
    public ResponseEntity<FeedingTable> updateChair(@PathVariable Integer id, @RequestBody FeedingTable chair) {
        Chair updateChair = service.updateChair(id, chair);
        if (updateChair == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().build();
        }
    }
}
