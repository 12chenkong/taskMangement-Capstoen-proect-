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
    //save task to daily_task table
    public void saveTasks(Task task){
        taskRepo.insertTasks(task);
    }
    //delete one record in  daily_task table
    public void deleteById(int id){
       int result=taskRepo.deleteById(14);
       if(result==1)
        System.out.println("Task with id:"+id+"have been removed!");
       else
           System.out.println("Task with id: "+id+" does not exist");
    }
    // remove all record from tables
    public void removeAllTasks(){
        taskRepo.deleteAllTasks();
    }
}
