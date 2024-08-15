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
}
