package com.example.daedong_dayt.domain.kanban.dto.request;

import com.example.daedong_dayt.domain.user.domain.User;
import lombok.Getter;

@Getter
public class TaskRequest {
    private Long id;
    private String color;
    private User user;
    private String title;
    private String takeList;
    private String status;
    private int createTime;
}
