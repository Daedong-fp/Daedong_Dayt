package com.example.daedong_dayt.domain.workspace.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateWorkspaceInfoRequest {
    private String workspaceName;
    private String workspaceExplain;
}
