package com.chan.taskmangement.repository;

import com.chan.taskmangement.model.MemberTaskInfo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class MemberTaskRepo {
    JdbcTemplate jdbc;

    public MemberTaskRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public List<MemberTaskInfo> getAllStudAndTask(){
        String sql=" SELECT m.name,m.age,m.status,d.Id_member,d.task_name\n" +
                "FROM daily_task as d INNER JOIN member as m\n" +
                "ON d.Id_member=m.id_member";
        RowMapper<MemberTaskInfo> rowMapper=new RowMapper<MemberTaskInfo>() {
            @Override
            public MemberTaskInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                MemberTaskInfo studentTaskInfo=new MemberTaskInfo();
               studentTaskInfo.setName(rs.getString("name"));
               studentTaskInfo.setAge(rs.getInt("age"));
                studentTaskInfo.setStatus(rs.getString("Status"));
                studentTaskInfo.setAge(rs.getInt("age"));
                studentTaskInfo.setTask_name(rs.getString("task_name"));

                return studentTaskInfo;
            }
        };

      return   jdbc.query(sql,rowMapper);

    }
}
