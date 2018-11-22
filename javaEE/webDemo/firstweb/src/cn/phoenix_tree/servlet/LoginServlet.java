package cn.phoenix_tree.servlet;

import cn.phoenix_tree.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String pwd = request.getParameter("pwd");
//        User user = new User();
//        user.setPwd(pwd);
//        user.setUsername(userName);
        System.out.println("get请求,获得的参数是："+userName+",pwd:"+pwd);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
         *  开发中我们发现，doget和dopost中的方法编写相同
         *  所以我们经常在post中调用get
         */
        //doGet(request,response);
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        User user = new User();
        user.setPwd(pwd);
        user.setUsername(userName);
        System.out.println("post请求,获得的参数是："+userName+",pwd:"+pwd);
    }
}
