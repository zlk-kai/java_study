package java_web;

import java_web.tools.DBUtils;
import java_web.tools.ScannerUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author 张林凯
 * @version 1.0
 */
public class JDBCDemo03 {
    public static void main(String[] args) throws SQLException {
        String usernanme = ScannerUtils.username();
        String userpassword =ScannerUtils.password();
        Connection connection = DBUtils.getConnection();
        //3.获取执行SQL语句的对象
        //SQL语句不再用字符串拼接方式，用？占位符
        String sql = "select * from user where user_name = ? AND user_password = ";
        //预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //参数1和参数2的拼接
        preparedStatement.setString(1,usernanme);
        preparedStatement.setString(2,userpassword);
        //4.执行SQL
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
        //关闭资源
        DBUtils.close(connection,preparedStatement,resultSet);

    }
}
