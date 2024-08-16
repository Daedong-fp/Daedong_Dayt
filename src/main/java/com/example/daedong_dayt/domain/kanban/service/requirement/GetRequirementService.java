package com.example.daedong_dayt.domain.kanban.service.requirement;

import com.example.daedong_dayt.domain.kanban.dto.response.RequirementResponse;
import com.example.daedong_dayt.domain.kanban.entity.Requirement;
import com.example.daedong_dayt.domain.kanban.repository.RequirementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetRequirementService {
    private final RequirementRepository requirementRepository;

    public List<RequirementResponse> getAllRequirement() {

        List<Requirement> requirements = requirementRepository.findAll();
        return requirements.stream()
                .map(RequirementResponse::new)
                .collect(Collectors.toList());
    }
}
