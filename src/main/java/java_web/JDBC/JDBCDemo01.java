package java_web.JDBC;

import java.sql.*;
import java.util.Scanner;

/**
 * @author 张林凯
 * @version 1.0
 */
public class JDBCDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册驱动
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(aClass.getName());
        //2.链接数据库
        String url = "jdbc:mysql://192.168.1.10:3306/testdb";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);
        //3.获取执行SQL语句的对象
        Statement statement = connection.createStatement();
        //4.定义执行的SQL语句对象
        //String sql = "insert into user(user_name,user_password,user_age,dept,user_sex,create_datatime) values('zlk','123456',18,1,1,'2021-10-10 18:01:01')";
        //String sql = "update user set user_age=10 where user_name = 'zlk' ";
        //String sql = "delete from user where user_name = 'zlk' ";
        //int i = statement.executeUpdate(sql);
        //查询结果集。

//        ResultSet resultSet1 = statement.executeQuery("select * from user");
//        while (resultSet1.next()) {
//            //表示逐渐获取列序号或者列明字
//            System.out.println(resultSet1.getString(1)+"\t"
//                    +resultSet1.getString(2)+"\t"
//                    +resultSet1.getString(3)+"\t"
//                    +resultSet1.getString(4)+"\t"
//                    +resultSet1.getString(5)+"\t"
//                    +resultSet1.getString(6)+"\t"
//                    +resultSet1.getInt(1)+"\t");
//        }
//
//        if (i > 0) {
//            System.out.println("数据操作成功");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String usernanme = scanner.nextLine();
        System.out.println("请输入密码：");
        String userpassword = scanner.nextLine();
        String sql1 = "select * from user where user_name = '"+usernanme+"' and user_password = '"+userpassword+"'";//密码输入。 123' or '1'='1 可以得到所有结果，并实现sql注入
        ResultSet resultSet = statement.executeQuery(sql1);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getString(1)+"\t"
                    +resultSet.getString(2)+"\t"
                    +resultSet.getString(3)+"\t"
                    +resultSet.getString(4)+"\t"
                    +resultSet.getString(5)+"\t"
                    +resultSet.getString(6)+"\t"
            );
            System.out.println("登录成功！！");
        }
        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();

    }

}
