package com.example.tu152.controller;

import com.example.tu152.db.service.LocomotiveTechnicalStateLogService;
import com.example.tu152.dto.domain.LocomotiveTechnicalStateLog;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/v1")
@RequiredArgsConstructor
public class LocomotiveTechnicalStateLogController {
    private final LocomotiveTechnicalStateLogService journalTu152Service;

    @PostMapping("/journal")
    public ResponseEntity<LocomotiveTechnicalStateLog> save(@RequestBody LocomotiveTechnicalStateLog journal) {
        return ResponseEntity.ok(journalTu152Service.upsert(journal));
    }

    @PutMapping("/journal/{id}") // Доделать метод (LocomotiveTechnicalStateLogUpdate new DTO object)
    public ResponseEntity<LocomotiveTechnicalStateLog> update(@PathVariable Long id, @RequestBody LocomotiveTechnicalStateLog journal) {
        return ResponseEntity.ok(journalTu152Service.upsert(journal));
    }

    @PostMapping("/journal/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        journalTu152Service.delete(id);
        return ResponseEntity.ok("Журнал успешно удален");
    }

    @GetMapping("/journal/{id}")
    public ResponseEntity<LocomotiveTechnicalStateLog> getJournalById(@PathVariable Long id) {
        return ResponseEntity.ok(journalTu152Service.getJournalById(id));
    }

    @GetMapping("/journal")
    public ResponseEntity<List<LocomotiveTechnicalStateLog>> getJournals() {
        return ResponseEntity.ok(journalTu152Service.getJournals());
    }
}
