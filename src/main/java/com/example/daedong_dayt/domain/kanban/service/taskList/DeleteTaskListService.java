package com.example.daedong_dayt.domain.kanban.service.taskList;

import com.example.daedong_dayt.domain.kanban.repository.TaskListRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTaskListService {
    private final TaskListRepository taskListRepository;

    @Transactional
    public void deleteTaskList(Long id) {
        taskListRepository.deleteById(id);
    }
}
