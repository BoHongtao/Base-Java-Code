package ConnectPool;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class ConnectPool {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    public static BasicDataSource dataSource = new BasicDataSource();

    static {
        try {
            //读取配置中的信息
            Properties props = new Properties();
            Reader is = new FileReader("db.properties");
            props.load(is);
            // 2 使用getProperty(key)，通过key获得需要的值，
            driver = props.getProperty("driver");
            url = props.getProperty("url");
            user = props.getProperty("user");
            password = props.getProperty("password");

            dataSource.setDriverClassName(driver);
            dataSource.setUrl(url);
            dataSource.setUsername(user);
            dataSource.setPassword(password);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /*
     * 返回连接池对象
     */
    public static DataSource getDataSource(){
        return dataSource;
    }





}
