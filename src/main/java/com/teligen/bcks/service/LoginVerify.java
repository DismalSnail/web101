package com.teligen.bcks.service;

import com.teligen.bcks.dao.UserDao;
import com.teligen.bcks.utils.SpringContextUtils;

/**
 * @author 冶鹏豪
 * @date 2021/7/25
 */
public class LoginVerify {
    private UserDao userDao = ((UserDao) SpringContextUtils.getContext().getBean("userDao"));
    public boolean verifyPassword(String account,String password){

        String savePassword = userDao.getUserPassword(account);
        if(savePassword.equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
