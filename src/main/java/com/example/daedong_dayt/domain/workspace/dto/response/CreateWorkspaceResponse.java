package com.example.daedong_dayt.domain.workspace.dto.response;

import com.example.daedong_dayt.domain.workspace.entity.Workspace;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateWorkspaceResponse {
    private String workspaceName;
    private String workspaceExplain;
    private Long id;

    public CreateWorkspaceResponse(Workspace workspace) {
        this.workspaceName = workspace.getWorkspaceName();
        this.workspaceExplain = workspace.getWorkspaceExplain();
        this.id = workspace.getId();
    }
}
