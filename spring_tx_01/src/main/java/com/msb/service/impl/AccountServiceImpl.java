package com.msb.service.impl;

import com.msb.dao.AccountDao;
import com.msb.dao.impl.AccountDaoImpl;
import com.msb.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public int transMoney(int from, int to, int balance) {
        //
        int  rows = 0;
        rows += accountDao.transMoney(from,0-balance);
        rows += accountDao.transMoney(to,balance);
        return rows;
    }
}
