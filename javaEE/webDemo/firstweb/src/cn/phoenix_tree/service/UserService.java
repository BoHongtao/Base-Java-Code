package cn.phoenix_tree.service;

import cn.phoenix_tree.dao.UserDao;
import cn.phoenix_tree.domain.User;

public class UserService {
    UserDao dao = new UserDao();
    public User login(User user){
        return dao.login(user);
    }
}
