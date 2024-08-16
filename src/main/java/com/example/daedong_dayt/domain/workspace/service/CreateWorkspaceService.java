package com.example.daedong_dayt.domain.workspace.service;

import com.example.daedong_dayt.domain.user.application.facade.UserFaced;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.workspace.dto.request.CreateWorkspaceRequest;
import com.example.daedong_dayt.domain.workspace.entity.UserWorkspace;
import com.example.daedong_dayt.domain.workspace.entity.Workspace;
import com.example.daedong_dayt.domain.workspace.repository.UserWorkspaceRepository;
import com.example.daedong_dayt.domain.workspace.repository.WorkspaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class CreateWorkspaceService {
    private final WorkspaceRepository workspaceRepository;
    private final UserWorkspaceRepository userWorkspaceRepository;
    private final UserFaced userFaced;

    @Transactional
    public void createWorkspace(CreateWorkspaceRequest createWorkspaceRequest) {
        User user = userFaced.currentUser();
        String inviteCode = createCode();

        Workspace workspace = workspaceRepository.save(Workspace.builder()
                .workspaceName(createWorkspaceRequest.getWorkspace_name())
                .workspaceExplain(createWorkspaceRequest.getWorkspace_explain())
                .inviteCode(inviteCode)
                .user(user)
                .build());

        userWorkspaceRepository.save(UserWorkspace.builder()
                .workspace(workspace)
                .user(user)
                .build());
    }

    private String createCode() {
        Random random = new Random();

        int ran = random.nextInt(26) + 97;
        String ranCode = "";
        for(int i = 0; i < 6; i++) {
            ranCode += (char)ran;
        }

        return ranCode;
    }
}
