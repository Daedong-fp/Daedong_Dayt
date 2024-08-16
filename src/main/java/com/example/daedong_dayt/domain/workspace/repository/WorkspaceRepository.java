package com.example.daedong_dayt.domain.workspace.repository;

import com.example.daedong_dayt.domain.workspace.dto.response.CreateWorkspaceResponse;
import com.example.daedong_dayt.domain.workspace.entity.Workspace;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkspaceRepository extends JpaRepository<Workspace, Long> {
    List<CreateWorkspaceResponse> findAllByUserId(Long userId);
}
