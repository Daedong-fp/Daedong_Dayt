package com.example.daedong_dayt.domain.kanban.entity;

import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.kanban.dto.request.RequirementRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "Requirement")
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    private String content;

    private int createTime;


    @Builder
    public Requirement(Long id, User user, String title, String content, int createTime) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.content = content;
        this.createTime = createTime;
    }


    public void update(RequirementRequest requirementRequest) {
        this.title = requirementRequest.getTitle();
        this.content = requirementRequest.getContent();
    }
}
