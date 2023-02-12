package com.example.smarthomestay.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.smarthomestay.models.Users;

@Repository
public class UsersJdbc {

    @Autowired
    private DataSource dataSource;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
        
    public List<Users> getUsers(){
        String SQL = "SELECT * FROM users";
        List<Users> usr = jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Users.class));
        return usr;
    }
    
}
