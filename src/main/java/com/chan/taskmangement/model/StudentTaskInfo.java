package com.chan.taskmangement.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
public class StudentTaskInfo {
    private int id;
    private String name;
    private  int age;
    private String status;
    private String task_name;
    public StudentTaskInfo(){}
    public StudentTaskInfo(int id, String name, int age, String status, String task_name) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
        this.task_name = task_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    @Override
    public String toString() {
        return "StudentTaskInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", task_name='" + task_name + '\'' +
                '}';
    }
}
