package com.example.daedong_dayt.domain.workspace.entity;

import com.example.daedong_dayt.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user_workspace")
public class UserWorkspace{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "workspace_id", nullable = false)
    private Workspace workspace;

    @Builder
    public UserWorkspace(User user, Workspace workspace) {
        this.user = user;
        this.workspace = workspace;
    }
}
