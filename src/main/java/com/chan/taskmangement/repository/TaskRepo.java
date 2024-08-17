package com.chan.taskmangement.repository;

import com.chan.taskmangement.model.Task;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TaskRepo {
    JdbcTemplate jdbc;
    //Constructor injection

    public TaskRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public List<Task> getAllTasks(){
        String sql="SELECT*FROM daily_task";
        RowMapper<Task> rowMapper=new RowMapper<Task>() {
            @Override
            public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
                Task task=new Task();
                task.setTask_id(rs.getInt(1));
                task.setTask_name(rs.getString(2));
                return task;

            }
        };
        return jdbc.query(sql,rowMapper);
    }

    public void insertTasks(Task task){
        String sql="INSERT INTO daily_task " +
                "VALUES(?,?,?)";
        jdbc.update(sql,task.getTask_id(),task.getTask_name(),task.getId_member());
    }

    //delete one record in table by id
    public int deleteById(int id){
        String sql="DELETE FROM daily_task WHERE id_task=?";
      return   jdbc.update(sql,id);
    }
// remove all task in daily_task table
    public int deleteAllTasks(){
        String sql="DELETE FROM daily_task";
       return    jdbc.update(sql);
    }

}
