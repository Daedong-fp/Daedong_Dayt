package com.example.daedong_dayt.domain.kanban.entity;

import com.example.daedong_dayt.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "taskList")
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private String content;


    @Builder
    public TaskList(Long id, User user, Task task, String content) {
        this.id = id;
        this.user = user;
        this.task = task;
        this.content = content;
    }
}
