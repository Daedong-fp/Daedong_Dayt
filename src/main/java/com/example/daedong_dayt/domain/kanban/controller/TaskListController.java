package com.example.daedong_dayt.domain.kanban.controller;

import com.example.daedong_dayt.domain.kanban.dto.request.TaskListRequest;
import com.example.daedong_dayt.domain.kanban.dto.response.TaskListResponse;
import com.example.daedong_dayt.domain.kanban.service.taskList.CreateTaskListService;
import com.example.daedong_dayt.domain.kanban.service.taskList.DeleteTaskListService;
import com.example.daedong_dayt.domain.kanban.service.taskList.GetTaskListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskList")
@RequiredArgsConstructor
public class TaskListController {
    private final CreateTaskListService createTaskListService;
    private final GetTaskListService getTaskListService;
    private final DeleteTaskListService deleteTaskListService;

    @PostMapping
    public void createTaskList(@RequestBody TaskListRequest taskListRequest) {
        createTaskListService.CreateTaskList(taskListRequest);
    }

    @GetMapping
    public List<TaskListResponse> getTaskList() {
        return getTaskListService.GetTaskList();
    }

    @DeleteMapping("/{id}")
    public void deleteTaskList(@PathVariable Long id) {
        deleteTaskListService.deleteTaskList(id);
    }
}
