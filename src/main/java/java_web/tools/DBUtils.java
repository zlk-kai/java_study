package java_web.tools;

import java.sql.*;

/**
 * @author 张林凯
 * @version 1.0
 * 工具类，大部分都是静态方法
 */
public class DBUtils {
    static {
        //1.注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection(){
        Connection connection = null;
        String url = "jdbc:mysql://192.168.1.10:3306/testdb";
        String username = "root";
        String password = "123456";
        try {
            connection = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    public static void close(Connection connection, Statement statement, ResultSet resultSet){
        try{
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }if (resultSet != null) {
                resultSet.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
