package com.example.daedong_dayt.domain.workspace.service;

import com.example.daedong_dayt.domain.user.application.facade.UserFaced;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.workspace.dto.request.ApplyWorkspaceRequest;
import com.example.daedong_dayt.domain.workspace.entity.UserWorkspace;
import com.example.daedong_dayt.domain.workspace.entity.Workspace;
import com.example.daedong_dayt.domain.workspace.exception.WorkspaceNotFoundException;
import com.example.daedong_dayt.domain.workspace.exception.WorkspaceNotInviteException;
import com.example.daedong_dayt.domain.workspace.repository.UserWorkspaceRepository;
import com.example.daedong_dayt.domain.workspace.repository.WorkspaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InviteWorkspaceService {

    private final UserWorkspaceRepository userWorkspaceRepository;
    private final WorkspaceRepository workspaceRepository;
    private final Workspace workspace;
    private final UserFaced userFaced;


    @Autowired
    public InviteWorkspaceService(UserWorkspaceRepository userWorkspaceRepository, WorkspaceRepository workspaceRepository, Workspace workspace, UserFaced userFaced) {
        this.userWorkspaceRepository = userWorkspaceRepository;
        this.workspaceRepository = workspaceRepository;
        this.workspace = workspace;
        this.userFaced = userFaced;
    }



    @Transactional
    public void invite(ApplyWorkspaceRequest request){
        User user = userFaced.currentUser();

        if(!workspace.getInviteCode().equals(request.getInviteCode())) {
            throw WorkspaceNotInviteException.EXCEPTION;
        }

        Workspace workspace = workspaceRepository.findById(request.getWorkspaceId())
                .orElseThrow(() -> WorkspaceNotFoundException.EXCEPTION);

        userWorkspaceRepository.save(
                UserWorkspace.builder()
                        .user(user)
                        .workspace(workspace)
                        .build());
    }
}