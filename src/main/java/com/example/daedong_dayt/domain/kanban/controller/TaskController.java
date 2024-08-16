package com.example.daedong_dayt.domain.kanban.controller;

import com.example.daedong_dayt.domain.kanban.dto.request.TaskRequest;
import com.example.daedong_dayt.domain.kanban.dto.response.TaskResponse;
import com.example.daedong_dayt.domain.kanban.service.task.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {
    private final CreateTaskService createTaskService;
    private final GetTaskService getTaskService;
    private final UpdateTaskService updateTaskService;
    private final DeleteTaskService deleteTaskService;
    private final MoveTaskService moveTaskService;

    @PostMapping
    public void createTask(@RequestBody TaskRequest request) {
        createTaskService.createTask(request);
    }

    @GetMapping
    public List<TaskResponse> getAllTask() {
        return getTaskService.getAllTask();
    }

    @PatchMapping("/{id}")
    public void updateTask(@PathVariable Long id, @RequestBody TaskRequest request) {
        updateTaskService.updateTask(id, request);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        deleteTaskService.deleteTask(id);
    }

//    @PatchMapping("/{id}")
//    public void moveTask(@PathVariable Long id, TaskRequest request) {
//        moveTaskService.moveTask(id, request);
//    }
}
