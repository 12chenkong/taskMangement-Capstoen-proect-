package com.chan.taskmangement.service;

import com.chan.taskmangement.model.Task;
import com.chan.taskmangement.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {
    TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> getAllTasks(){
        return taskRepo.getAllTasks();
    }
}
