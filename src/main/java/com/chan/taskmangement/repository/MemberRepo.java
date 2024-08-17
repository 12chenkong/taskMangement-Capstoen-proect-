package com.chan.taskmangement.repository;

import com.chan.taskmangement.model.Member;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@Repository
public class MemberRepo {
    JdbcTemplate jdbc;
    // Constructor injection
    public MemberRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    // Fetching all student Records from student table
    public List<Member> getAllMembers(){
        String sql="SELECT*FROM member";
        RowMapper<Member> rowMapper=new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                Member member=new Member();
                member.setId(rs.getInt("Id_member"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
                member.setStatus(rs.getString("status"));
                member.setMajor(rs.getString("Major"));

                return member;
            }
        };

     return jdbc.query(sql,rowMapper);
    }

  public Member getMemberById(int id){
        String sql="SELECT*FROM member WHERE id_member=? ";
        RowMapper<Member> rowMapper=new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                Member member=new Member();
                member.setId(rs.getInt("id_member"));
                member.setName(rs.getString("name"));
                member.setStatus(rs.getString("Status"));
                member.setAge(rs.getInt("age"));
                member.setMajor(rs.getString("Major"));
                return member;
            }
        };

            return  jdbc.queryForObject(sql,new Object[]{id},rowMapper);

  }

  public int insertMember(Member member){
        String sql="INSERT INTO member " +
                "VALUES (?,?,?,?,?)";
      return   jdbc.update(sql,member.getId(),member.getName(),member.getAge(),member.getStatus(),member.getMajor());
  }


}
