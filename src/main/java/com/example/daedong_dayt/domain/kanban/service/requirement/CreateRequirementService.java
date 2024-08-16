package com.example.daedong_dayt.domain.kanban.service.requirement;

import com.example.daedong_dayt.domain.kanban.dto.request.RequirementRequest;
import com.example.daedong_dayt.domain.kanban.entity.Requirement;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CreateRequirementService {

    @Transactional
    public void createRequirement(RequirementRequest requirementRequest) {
        Requirement requirement = Requirement.builder()
                .id(requirementRequest.getId())
                .user(requirementRequest.getUser())
                .title(requirementRequest.getTitle())
                .content(requirementRequest.getContent())
                .createTime(requirementRequest.getCreateTime())
                .build();
    }
}
