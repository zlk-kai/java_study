package java_web;

import java.sql.*;
import java.util.Scanner;

/**
 * @author 张林凯
 * @version 1.0
 * 预编译登录方式
 *
 */
public class JDBCDemo02 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String usernanme = scanner.nextLine();
        System.out.println("请输入密码：");
        String userpassword = scanner.nextLine();
        //1.注册驱动
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        //2.链接数据库
        String url = "jdbc:mysql://192.168.1.10:3306/testdb";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.获取执行SQL语句的对象
        //SQL语句不再用字符串拼接方式，用？占位符
        String sql = "select * from user where user_name = ? AND user_password = ?";
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
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
