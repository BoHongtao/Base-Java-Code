package ConnectPool;
import DbUtileDemo.ClassificationDemo;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import java.sql.SQLException;

public class testPool {

    public static void main(String[] args){
        testPool.select();
    }

    public static void select(){
        try {
            QueryRunner qr = new QueryRunner(ConnectPool.getDataSource());
            String sql = "select * from classification";
            ClassificationDemo clsDemo = qr.query(sql,new BeanHandler<ClassificationDemo>(ClassificationDemo.class));
            System.out.println(clsDemo.getId());
            System.out.println(clsDemo.getTypename());
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
