package com.example.daedong_dayt.domain.workspace.dto.request;

import lombok.Getter;

@Getter
public class ApplyWorkspaceRequest {
    private String inviteCode;
    private Long workspaceId;
}