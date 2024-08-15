package com.chan.taskmangement;

import com.chan.taskmangement.model.Member;
import com.chan.taskmangement.repository.StudentTaskRepo;
import com.chan.taskmangement.service.MemberServices;
import com.chan.taskmangement.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.List;

@SpringBootApplication
public class TaskManagementApplication {
    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(TaskManagementApplication.class, args);
        MemberServices memberServices=context.getBean(MemberServices.class);
        TaskService taskService=context.getBean(TaskService.class);
         List<Member> members= memberServices.FetchAllMembers();
//        RenderTable.showMemberInfo(members);
//         RenderTable.showTaskinfo(taskService.getAllTasks());

        // call function search member by id
        /*
         try {
             RenderTable.showOnlyOne(memberServices.getMemberById(12));
         }catch (EmptyResultDataAccessException e){
             System.out.println("cannot find this member");
         }

         */
        StudentTaskRepo obj=context.getBean(StudentTaskRepo.class);
        RenderTable.showTaskStudentInfo( obj.getAllStudAndTask());

    }

}
