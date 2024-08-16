package com.example.daedong_dayt.domain.workspace.service;

import com.example.daedong_dayt.domain.user.application.facade.UserFaced;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.workspace.entity.Workspace;
import com.example.daedong_dayt.domain.workspace.exception.WorkspaceNotFoundException;
import com.example.daedong_dayt.domain.workspace.repository.WorkspaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteWorkspaceService {
    private final WorkspaceRepository workspaceRepository;
    private final UserFaced userFaced;

    @Transactional
    public void deleteWorkspace(Long id){
        User user = userFaced.currentUser();
        Workspace workspace = workspaceRepository.findById(id)
                .orElseThrow(() -> WorkspaceNotFoundException.EXCEPTION);

        // 삭제 요청 유저가 워크스페이스를 만든 사람이 아닐 떄 예외
        if(!user.getId().equals(workspace.getUser().getId())) {
            throw WorkspaceNotFoundException.EXCEPTION;
        }

        workspaceRepository.deleteById(id);
    }
}
