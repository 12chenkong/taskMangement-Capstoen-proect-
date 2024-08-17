package com.chan.taskmangement.service;

import com.chan.taskmangement.model.MemberTaskInfo;
import com.chan.taskmangement.repository.MemberTaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberTaskService {
    MemberTaskRepo studentTaskRepo;

    public MemberTaskService(MemberTaskRepo studentTaskRepo) {
        this.studentTaskRepo = studentTaskRepo;
    }

    public List<MemberTaskInfo> getTasksMembers(){
         return studentTaskRepo.getAllStudAndTask();
     }


}
