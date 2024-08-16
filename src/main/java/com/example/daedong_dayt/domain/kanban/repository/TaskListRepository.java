package com.example.daedong_dayt.domain.kanban.repository;

import com.example.daedong_dayt.domain.kanban.entity.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Long> {
}
