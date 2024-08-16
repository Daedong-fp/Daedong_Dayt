package com.example.daedong_dayt.domain.kanban.dto.request;

import com.example.daedong_dayt.domain.user.domain.User;
import lombok.Getter;

@Getter
public class RequirementRequest {
    private Long id;
    private User user;
    private String title;
    private String content;
    private int createTime;
}
