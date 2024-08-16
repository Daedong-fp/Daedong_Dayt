package com.example.daedong_dayt.domain.kanban.service.requirement;

import com.example.daedong_dayt.domain.kanban.dto.request.RequirementRequest;
import com.example.daedong_dayt.domain.kanban.entity.Requirement;
import com.example.daedong_dayt.domain.kanban.repository.RequirementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateRequirementService {
    private final RequirementRepository requirementRepository;

    @Transactional
    public void updateRequirement(Long id, RequirementRequest requirementRequest) {
        Requirement requirement = requirementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        requirement.update(requirementRequest);
    }
}
