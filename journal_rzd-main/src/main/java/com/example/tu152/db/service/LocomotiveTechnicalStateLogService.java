package com.example.tu152.db.service;

import com.example.tu152.db.entity.LocomotiveTechnicalStateLogEntity;
import com.example.tu152.db.repository.LocomotiveTechnicalStateLogRepository;
import com.example.tu152.dto.domain.LocomotiveTechnicalStateLog;
import com.example.tu152.dto.mapper.LocomotiveTechnicalStateLogMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class LocomotiveTechnicalStateLogService {
    private final LocomotiveTechnicalStateLogRepository journalRepository;
    private final LocomotiveTechnicalStateLogMapper journalMapper;

    @Transactional
    public LocomotiveTechnicalStateLog upsert(LocomotiveTechnicalStateLog journal) {
        return journalMapper.toDomain(journalRepository.save(journalMapper.toEntity(journal)));
    }

    @Transactional
    public LocomotiveTechnicalStateLog update(Long id, LocomotiveTechnicalStateLog journal) {
        return journalMapper.toDomain(journalRepository.save(journalMapper.toEntity(journal)));
    }

    @Transactional
    public void delete(Long id) {
        journalRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public LocomotiveTechnicalStateLog getJournalById(Long id) {
        Optional<LocomotiveTechnicalStateLogEntity> journal = journalRepository.findById(id);
        if(journal.isEmpty()){
            throw new RuntimeException(); // Добавить норм исключение (ApiException.class)
        }
        return journalMapper.toDomain(journal.get());
    }

    @Transactional(readOnly = true)
    public List<LocomotiveTechnicalStateLog> getJournals() {
        return journalMapper.toDomain(journalRepository.findAll());
    }
}
