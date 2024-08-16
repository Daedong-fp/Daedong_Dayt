package com.example.daedong_dayt.domain.kanban.service.task;

import com.example.daedong_dayt.domain.kanban.dto.response.TaskResponse;
import com.example.daedong_dayt.domain.kanban.entity.Task;
import com.example.daedong_dayt.domain.kanban.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetTaskService {
    private final TaskRepository taskRepository;
    //전체 조회
    public List<TaskResponse> getAllTask() {
        List<Task> tasks = taskRepository.findAll();

        return tasks.stream()
                .map(TaskResponse::new)
                .collect(Collectors.toList());
    }
}
