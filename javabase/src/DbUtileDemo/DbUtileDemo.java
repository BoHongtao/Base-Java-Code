package DbUtileDemo;

import jdbcDemo.jdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class DbUtileDemo {
    public static void main(String []args){
        int id = 2;
//        DbUtileDemo.insert();
//        DbUtileDemo.select(id);
        DbUtileDemo.select2Obj(id);
    }
    private static void insert(){
        try {
            QueryRunner qr = new QueryRunner();
            String sql = "insert into classification(id,type_name) value(?,?)";
            Object[] params = {null,"JDBC"};
            Connection connection = jdbcUtils.getConnection();
            int line = qr.update(connection,sql,params);
            System.out.println("line = "+line+"插入成功");
        }catch (SQLException e){
            System.out.println(e);
            throw new RuntimeException();
        }
    }
    private static void select(int id){
        try {
            QueryRunner qr = new QueryRunner();
            String sql = "select * from classification where id=?";
            Object[] param = {id};
            Connection connection = jdbcUtils.getConnection();
            List<Object[]> list = qr.query(connection,sql,new ArrayListHandler(),param);
            for(Object[] objArray:list){
                System.out.println(Arrays.toString(objArray));
            }
        }catch (SQLException e){
            System.out.println(e);
            throw new RuntimeException();
        }
    }
    //将每一条记录封装到每一个obj数组中
    private static void select2Obj(int id){
        try{
            QueryRunner qr = new QueryRunner();
            String sql = "select * from classification where id=?";
            Object[] params = {id};
            Connection connection = jdbcUtils.getConnection();
            ClassificationDemo clsdemo = qr.query(connection,sql,new BeanHandler<ClassificationDemo>(ClassificationDemo.class),params);
            System.out.println(clsdemo.getId());;
            System.out.println(clsdemo.getTypename());;
            connection.close();
        }catch (SQLException e){
            System.out.println(e);
            throw new RuntimeException();
        }
    }
}
