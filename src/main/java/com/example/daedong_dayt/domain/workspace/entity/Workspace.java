package com.example.daedong_dayt.domain.workspace.entity;

import com.example.daedong_dayt.domain.user.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Getter
@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "workspace")
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false, unique = true)
    private String workspaceName;

    @Column(length = 30)
    private String workspaceExplain;

    @Column(unique = true)
    private String inviteCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public void updateWorkspaceInfo(String workspaceName, String workspaceExplain) {
        this.workspaceName = workspaceName;
        this.workspaceExplain = workspaceExplain;
    }
}
