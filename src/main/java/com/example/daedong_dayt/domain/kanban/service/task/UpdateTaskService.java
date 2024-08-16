package com.example.daedong_dayt.domain.kanban.service.task;

import com.example.daedong_dayt.domain.kanban.dto.request.TaskRequest;
import com.example.daedong_dayt.domain.kanban.entity.Task;
import com.example.daedong_dayt.domain.kanban.repository.TaskRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateTaskService {
    private final TaskRepository taskRepository;

    @Transactional
    public void updateTask(Long id, TaskRequest request) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        task.update(request);
    }

}
