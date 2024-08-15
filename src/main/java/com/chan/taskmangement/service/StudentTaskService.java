package com.chan.taskmangement.service;

import com.chan.taskmangement.model.StudentTaskInfo;
import com.chan.taskmangement.repository.StudentTaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentTaskService {
    StudentTaskRepo studentTaskRepo;

    public StudentTaskService(StudentTaskRepo studentTaskRepo) {
        this.studentTaskRepo = studentTaskRepo;
    }

    public List<StudentTaskInfo> getTasksMembers(){
         return studentTaskRepo.getAllStudAndTask();
     }
}
