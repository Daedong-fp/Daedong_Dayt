package com.example.daedong_dayt.domain.workspace.dto.response;

import com.example.daedong_dayt.domain.workspace.entity.UserWorkspace;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class AllGetWorkspaceResponse {

    private String workspaceName;
    private String workspaceExplain;
    private String name;
    private Long id;

    public AllGetWorkspaceResponse(UserWorkspace userWorkspace) {
        this.workspaceName = userWorkspace.getWorkspace().getWorkspaceName();
        this.workspaceExplain = userWorkspace.getWorkspace().getWorkspaceExplain();
        this.name = userWorkspace.getUser().getName();
        this.id = userWorkspace.getWorkspace().getId();
    }
}
