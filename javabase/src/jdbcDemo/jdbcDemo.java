package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcDemo {

    public static void main(String [] args) throws Exception{
        jdbcDemo jdbc = new jdbcDemo();
        jdbc.query();
    }

    //select方法
    public static void query() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/room", "root", "");
        String sql = "select * from room";
        PreparedStatement stat = connection.prepareStatement(sql);
        ResultSet rs = stat.executeQuery();
        while(rs.next()){
            String title = rs.getString("Title");
            System.out.println(title);
        }
        rs.close();
        stat.close();
        connection.close();
    }
}
