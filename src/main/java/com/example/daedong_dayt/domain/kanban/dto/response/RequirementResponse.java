package com.example.daedong_dayt.domain.kanban.dto.response;

import com.example.daedong_dayt.domain.user.domain.User;
import com.example.daedong_dayt.domain.kanban.entity.Requirement;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequirementResponse {
    private User user;
    private String title;
    private String content;
    private int createTime;

    public RequirementResponse(Requirement requirement) {
        this.user = requirement.getUser();
        this.title = requirement.getTitle();
        this.content = requirement.getContent();
        this.createTime = requirement.getCreateTime();
    }
}
