package com.example.daedong_dayt.domain.workspace.repository;

import com.example.daedong_dayt.domain.workspace.entity.UserWorkspace;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserWorkspaceRepository extends CrudRepository<UserWorkspace, Long> {
    List<UserWorkspace> findAllByUserId(Long userId);
}
