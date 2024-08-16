package com.example.daedong_dayt.domain.kanban.service.task;

import com.example.daedong_dayt.domain.kanban.dto.request.TaskRequest;
import com.example.daedong_dayt.domain.kanban.entity.Task;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskService {

    @Transactional
    public void createTask(TaskRequest taskRequest) {
        Task task = Task.builder()
                .id(taskRequest.getId())
                .user(taskRequest.getUser())
                .title(taskRequest.getTitle())
                .status(taskRequest.getStatus())
                .takeList(taskRequest.getTakeList())
                .color(taskRequest.getColor())
                .createTime(taskRequest.getCreateTime())
                .moveTime(taskRequest.getCreateTime())
                .build();
    }
}
