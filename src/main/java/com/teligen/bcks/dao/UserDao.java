package com.teligen.bcks.dao;

import com.teligen.bcks.utils.SpringContextUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 冶鹏豪
 * @date 2021/7/25
 */
public class UserDao {
    private final static Logger logger = LoggerFactory.getLogger(UserDao.class);
    private final DataSource druidDataSource = (DataSource) SpringContextUtils.getContext().getBean("druidDataSource");

    public String getUserPassword(String account){
        String password = null;
        try {
            Connection connection = druidDataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement("SELECT password FROM tb_user WHERE account = ?");
            stmt.setString(1,account);
            ResultSet resultSet = stmt.executeQuery();
            resultSet.next();
            password = resultSet.getString(1);
            logger.error("password is {}",password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return password;
    }
}
