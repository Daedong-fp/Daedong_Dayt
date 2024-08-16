package com.example.daedong_dayt.domain.kanban.dto.response;

import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.kanban.entity.Task;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TaskResponse {
    private String title;
    private String takeList;
    private User user;
    private String status;
    private int createTime;

    @Builder
    public TaskResponse(String title, String takeList, User user,String status, int createTime) {
        this.title = title;
        this.takeList = takeList;
        this.user = user;
        this.status = status;
        this.createTime = createTime;
    }

    public TaskResponse(Task task) {
        this.title = task.getTitle();
        this.user = task.getUser();
        this.takeList = task.getTakeList();
        this.createTime = task.getCreateTime();
    }
}
