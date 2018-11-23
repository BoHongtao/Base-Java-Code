package cn.phoenix_tree.servlet;

import cn.phoenix_tree.domain.User;
import cn.phoenix_tree.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        System.out.println("get请求,获得的参数是："+userName+",pwd:"+pwd);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        //doGet(request,response);
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        System.out.println("post请求,发送的参数是："+userName+",pwd:"+pwd);

        User user = new User();
        user.setPwd(pwd);
        user.setUsername(userName);
        UserService userservice = new UserService();
        //登陆获取用户信息
        User res = userservice.login(user);
        if(res == null){
            System.out.println("查无此人");
            return;
        }
        System.out.println("数据库查询到的数据是：");
        System.out.println("名字："+res.getUsername());
        System.out.println("密码："+res.getPwd());
        System.out.println("ID："+res.getId());
        System.out.println("性别："+res.getSex());
    }
}
