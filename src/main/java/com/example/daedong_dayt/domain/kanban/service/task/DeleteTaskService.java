package com.example.daedong_dayt.domain.kanban.service.task;

import com.example.daedong_dayt.domain.kanban.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteTaskService {
    private final TaskRepository taskRepository;


    @Transactional
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
