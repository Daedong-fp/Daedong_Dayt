package com.example.daedong_dayt.domain.kanban.repository;

import com.example.daedong_dayt.domain.kanban.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
