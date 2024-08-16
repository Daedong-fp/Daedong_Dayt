package com.example.daedong_dayt.domain.kanban.dto.request;

import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.kanban.entity.Task;
import lombok.Getter;

@Getter
public class TaskListRequest {
    private Long id;
    private Task task;
    private User user;
    private String content;
}
