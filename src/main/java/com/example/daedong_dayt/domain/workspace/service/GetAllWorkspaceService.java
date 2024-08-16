package com.example.daedong_dayt.domain.workspace.service;

import com.example.daedong_dayt.domain.user.application.facade.UserFaced;
import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.workspace.dto.response.AllGetWorkspaceResponse;
import com.example.daedong_dayt.domain.workspace.repository.UserWorkspaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllWorkspaceService {
    private final UserFaced userFaced;
    private final UserWorkspaceRepository userWorkspaceRepository;

    @Transactional(readOnly = true)
    public List<AllGetWorkspaceResponse> getAllWorkspace(Long id) {
        User user = userFaced.currentUser();
        return userWorkspaceRepository.findAllByUserId(user.getId()).stream()
                .map(AllGetWorkspaceResponse::new)
                .toList();
    }
}
