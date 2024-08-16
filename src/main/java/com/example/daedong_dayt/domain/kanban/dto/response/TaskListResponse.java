package com.example.daedong_dayt.domain.kanban.dto.response;

import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.kanban.entity.TaskList;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TaskListResponse {
    private User user;
    private String content;

    public TaskListResponse(TaskList taskList) {
        this.user = taskList.getUser();
        this.content = taskList.getContent();
    }
}
