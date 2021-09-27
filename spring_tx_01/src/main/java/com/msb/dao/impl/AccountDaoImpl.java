package com.msb.dao.impl;

import com.msb.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int transMoney(int id, int balance) {
        String sql = "update account set balance = balance+? where id=?";
        return jdbcTemplate.update(sql, balance, id);

    }

}
