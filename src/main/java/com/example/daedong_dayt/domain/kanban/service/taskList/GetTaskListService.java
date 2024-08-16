package com.example.daedong_dayt.domain.kanban.service.taskList;

import com.example.daedong_dayt.domain.kanban.dto.response.TaskListResponse;
import com.example.daedong_dayt.domain.kanban.entity.TaskList;
import com.example.daedong_dayt.domain.kanban.repository.TaskListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetTaskListService {
    private final TaskListRepository taskListRepository;

    public List<TaskListResponse> GetTaskList() {

        List<TaskList> taskLists = taskListRepository.findAll();

        return taskLists.stream()
                .map(TaskListResponse::new)
                .collect(Collectors.toList());

    }
}
