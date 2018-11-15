package jdbcDemo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class testUtile {
    public static void main(String[] args){
        testUtile.select();
    }
    public static void select(){
        try{
            Connection connection = jdbcUtils.getConnection();
            String sql = "select * from room";
            PreparedStatement stat = connection.prepareStatement(sql);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                String title = rs.getString("Title");
                System.out.println(title);
            }
        }catch (Exception e){
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }
}
