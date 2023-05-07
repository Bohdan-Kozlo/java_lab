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

    @GetMapping("/test")
    public FeedingTable test() {
        return new FeedingTable(1, "plastic", 185, "Mary", 110, 75, 75, 1);
    }

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
        boolean delete = service.delete(id);
        if (delete) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public void createChair(@RequestBody FeedingTable chair) {
        service.create(chair);
    }

    @PutMapping("/chair{id}")
    public ResponseEntity<FeedingTable> updateChair(@PathVariable Integer id, @RequestBody FeedingTable chair) {
        Chair updateChair = service.update(id, chair);
        if (updateChair == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok().build();
        }
    }
}
