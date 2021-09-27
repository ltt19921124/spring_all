package com.msb.dao.impl;

import com.msb.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public int addUser(int userid, String username) {
        System.out.println("userdao add ... ...");
//        int i = 1 / 0;
        return 1 ;
    }

}
