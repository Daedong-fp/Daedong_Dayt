package com.example.daedong_dayt.domain.workspace.controller;

import com.example.daedong_dayt.domain.workspace.dto.request.ApplyWorkspaceRequest;
import com.example.daedong_dayt.domain.workspace.dto.request.CreateWorkspaceRequest;
import com.example.daedong_dayt.domain.workspace.dto.request.UpdateWorkspaceInfoRequest;
import com.example.daedong_dayt.domain.workspace.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/workspace")
public class WorkspaceController {

    private final CreateWorkspaceService createWorkspaceService;
    private final DeleteWorkspaceService deleteWorkspaceService;
    private final GetAllWorkspaceService getAllWorkspaceService;
    private final InviteWorkspaceService inviteWorkspaceService;
    private final UpdateWorkspaceService updateWorkspaceService;

    @PostMapping("/create")
    public void create(@RequestBody CreateWorkspaceRequest createWorkspaceRequest) {
        createWorkspaceService.createWorkspace(createWorkspaceRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        deleteWorkspaceService.deleteWorkspace(id);
    }

    @GetMapping("/{id}")
    public void getAll(@PathVariable("id") Long id) {
        getAllWorkspaceService.getAllWorkspace(id);
    }

    @PostMapping("/invite")
    public void invite(@RequestBody ApplyWorkspaceRequest applyWorkspaceRequest) {
        inviteWorkspaceService.invite(applyWorkspaceRequest);
    }

    @PatchMapping("/{id}")
    public void update(@RequestBody Long id, UpdateWorkspaceInfoRequest request) {
        updateWorkspaceService.updateWorkspace(id, request);
    }
}
