package ua.lviv.iot.algo.part1.lab6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab6.model.Chair;
import ua.lviv.iot.algo.part1.lab6.model.FeedingTable;
import ua.lviv.iot.algo.part1.lab6.service.ChairService;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChair(@PathVariable Integer id) {
        boolean delete = service.delete(id);
        if (delete) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<FeedingTable> createChair(@RequestBody FeedingTable chair) {
        service.create(chair);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateChair(@PathVariable Integer id, @RequestBody FeedingTable chair) {
        Chair updateChair = service.update(id, chair);
        if (updateChair == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().build();
        }
    }
}
