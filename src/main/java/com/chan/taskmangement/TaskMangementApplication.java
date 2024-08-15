package com.chan.taskmangement;

import com.chan.taskmangement.model.Member;
import com.chan.taskmangement.service.MemberServices;
import com.chan.taskmangement.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class TaskMangementApplication {
    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(TaskMangementApplication.class, args);
        MemberServices memberServices=context.getBean(MemberServices.class);
        TaskService taskService=context.getBean(TaskService.class);
         List<Member> members= memberServices.FetchAllMembers();
        RenderTable.showMemberInfo(members);
         RenderTable.showTaskinfo(  taskService.getAllTasks());
    }

}
