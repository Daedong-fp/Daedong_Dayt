package com.example.daedong_dayt.domain.workspace.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateWorkspaceRequest {
    private String workspace_name;
    private String workspace_explain;
}