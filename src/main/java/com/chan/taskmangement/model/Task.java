package com.chan.taskmangement.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Task {
    private  int task_id;
    private String task_name;
    private int id_member;
    //Constructor
    public  Task(){}
    public Task(int task_id, String task_name, int id_member) {
        this.task_id = task_id;
        this.task_name = task_name;
        this.id_member = id_member;
    }
    //getter and setter

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public int getId_member() {
        return id_member;
    }

    public void setId_member(int id_member) {
        this.id_member = id_member;
    }
    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_name='" + task_name + '\'' +
                ", id_member=" + id_member +
                '}';
    }
}
