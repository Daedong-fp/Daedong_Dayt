package com.example.daedong_dayt.domain.workspace.service;

import com.example.daedong_dayt.domain.user.application.facade.UserFaced;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.user.exception.UserMismatchException;
import com.example.daedong_dayt.domain.workspace.dto.request.UpdateWorkspaceInfoRequest;
import com.example.daedong_dayt.domain.workspace.entity.Workspace;
import com.example.daedong_dayt.domain.workspace.exception.WorkspaceNotFoundException;
import com.example.daedong_dayt.domain.workspace.repository.WorkspaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UpdateWorkspaceService {

    private final UserFaced userFaced;
    private final WorkspaceRepository workspaceRepository;

    @Transactional
    public void updateWorkspace(Long workspaceId, UpdateWorkspaceInfoRequest request) {
        User user = userFaced.currentUser();
        Workspace workspace = workspaceRepository.findById(workspaceId)
                .orElseThrow(() -> WorkspaceNotFoundException.EXCEPTION);

        if(user.getId().equals(workspace.getUser().getId())) {
            throw UserMismatchException.EXCEPTION;
        }

        workspace.updateWorkspaceInfo(
                request.getWorkspaceName(),
                request.getWorkspaceExplain()
        );
    }
}
