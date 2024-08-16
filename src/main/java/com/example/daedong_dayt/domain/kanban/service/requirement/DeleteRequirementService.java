package com.example.daedong_dayt.domain.kanban.service.requirement;

import com.example.daedong_dayt.domain.kanban.repository.RequirementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteRequirementService {
    private final RequirementRepository requirementRepository;

    @Transactional
    public void deleteRequirement(Long id) {
        requirementRepository.deleteById(id);
    }
}
