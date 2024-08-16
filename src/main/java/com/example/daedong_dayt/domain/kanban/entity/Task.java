package com.example.daedong_dayt.domain.kanban.entity;

import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.kanban.dto.request.TaskRequest;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    @OneToMany(mappedBy = "task", cascade = CascadeType.REMOVE)
    private List<TaskList> taskLists = new ArrayList<TaskList>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(length = 20)
    private String title;

    @Column(length = 30)
    private String takeList;

    @Column(length = 10)
    private String status;

    @CreatedDate
    private int createTime;

    @LastModifiedDate
    private int moveTime;


    @Builder
    public Task(Long id, String color, User user, String title, String takeList, String status, int createTime, int moveTime) {
        this.id = id;
        this.color = color;
        this.user = user;
        this.title = title;
        this.takeList = takeList;
        this.status = status;
        this.createTime = createTime;
        this.moveTime = moveTime;
    }




    public void update(TaskRequest taskRequest) {
        this.title = taskRequest.getTitle();
        this.takeList = taskRequest.getTakeList();
        this.status = taskRequest.getStatus();
    }

    public void move(TaskRequest taskRequest) {
        this.color = taskRequest.getColor();
        this.takeList = taskRequest.getTakeList();
    }

}

