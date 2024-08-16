package com.example.daedong_dayt.domain.kanban.service.taskList;

import com.example.daedong_dayt.domain.kanban.dto.request.TaskListRequest;
import com.example.daedong_dayt.domain.kanban.entity.TaskList;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskListService {

    @Transactional
    public void CreateTaskList(TaskListRequest taskListRequest) {
        TaskList taskList = TaskList.builder()
                .id(taskListRequest.getId())
                .task(taskListRequest.getTask())
                .user(taskListRequest.getUser())
                .content(taskListRequest.getContent())
                .build();
    }
}
