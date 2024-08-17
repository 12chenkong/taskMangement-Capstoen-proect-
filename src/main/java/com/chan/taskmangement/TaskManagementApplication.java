package com.chan.taskmangement;

import com.chan.taskmangement.model.Member;
import com.chan.taskmangement.model.Task;
import com.chan.taskmangement.repository.MemberTaskRepo;
import com.chan.taskmangement.service.MemberServices;
import com.chan.taskmangement.service.TaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class TaskManagementApplication {
    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(TaskManagementApplication.class, args);
        MemberServices memberServices=context.getBean(MemberServices.class);
        TaskService taskService=context.getBean(TaskService.class);
         List<Member> members= memberServices.FetchAllMembers();
        int option;
        int innerOption;
        Scanner scanner=new Scanner(System.in);
         /*
        RenderTable.showMemberInfo(members);
         RenderTable.showTaskinfo(taskService.getAllTasks());


          */

        // call function search member by id
        /*
         try {
             RenderTable.showOnlyOne(memberServices.getMemberById(12));
         }catch (EmptyResultDataAccessException e){
             System.out.println("cannot find this member");
         }
         */


//        Task obj=new Task(11,"Wipe Something",5);
//        taskService.saveTasks(obj);

        do {
            RenderTable.showChoicesTable();
            System.out.println("Chose one of them: ");
            option=scanner.nextInt();
            //outer switch
            switch (option){
                case 1 ->{
                    do {
                        RenderTable.renderMember();
                        System.out.println("Chose one of them:");
                        innerOption=scanner.nextInt();
                        switch (innerOption){
                            case 1->{
                                 scanner.nextLine();
                                System.out.println("Enter member's name :");
                                String name=scanner.nextLine();
                                System.out.println("Enter member id:");
                                int id=scanner.nextInt();
                                System.out.println("Enter member's age:");
                                int age=scanner.nextInt();
                                System.out.println("Enter member status: ");
                                String status=scanner.nextLine();
                                scanner.nextLine();
                                System.out.println("Enter member's major: ");
                                String major=scanner.next();
                                Member member=new Member(id,name,age,status,major);
                                memberServices.addMember(member);
                            }
                            case 2->{
                                RenderTable.showMemberInfo(memberServices.FetchAllMembers());
                            }
                            case 3->{
                                System.out.println("Enter member id to search: ");
                                int id=scanner.nextInt();
                                RenderTable.showOnlyOne(memberServices.getMemberById(id));

                            }
                        }
                    }while (innerOption!=3);

                }
            }

        }while (option!=4);




    }

}
