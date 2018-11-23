package cn.phoenix_tree.dao;

import cn.phoenix_tree.domain.User;
import cn.phoenix_tree.tools.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {
    //登陆
    public User login(User user){
        User findUser = null;
        try{
            QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
            String sql = "select * from user where user = ? and pwd = ?";
            findUser = qr.query(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPwd());
            return findUser;
        }catch (SQLException e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
