package com.example.daedong_dayt.domain.kanban.controller;

import com.example.daedong_dayt.domain.kanban.dto.request.RequirementRequest;
import com.example.daedong_dayt.domain.kanban.service.requirement.CreateRequirementService;
import com.example.daedong_dayt.domain.kanban.service.requirement.DeleteRequirementService;
import com.example.daedong_dayt.domain.kanban.service.requirement.GetRequirementService;
import com.example.daedong_dayt.domain.kanban.service.requirement.UpdateRequirementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/requirement")
@RequiredArgsConstructor
public class RequirementController {
    private final CreateRequirementService createRequirementService;
    private final GetRequirementService getRequirementService;
    private final UpdateRequirementService updateRequirementService;
    private final DeleteRequirementService deleteRequirementService;

    @PostMapping
    public void createRequirement(@RequestBody RequirementRequest requirementRequest) {
        createRequirementService.createRequirement(requirementRequest);
    }

    @GetMapping
    public void getRequirement() {
        getRequirementService.getAllRequirement();
    }

    @PatchMapping("/{id}")
    public void updateRequirement(@PathVariable Long id, @RequestBody RequirementRequest requirementRequest) {
        updateRequirementService.updateRequirement(id, requirementRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteRequirement(@PathVariable Long id) {
        deleteRequirementService.deleteRequirement(id);
    }
}
