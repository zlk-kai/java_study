package java_Basics.IOStream_.Properties_;

import java.io.FileReader;
import java.util.Properties;

public class Propertise02 {
    public static void main(String[] args) throws Exception {
       //使用properties类来读取mysql.properties文件
        //1.创建properties对象
        Properties prop = new Properties();
        //2.加载指定配置文件
        prop.load(new FileReader("src/main/java/java_Basics.IOStream_/Properties_/mysql.properties"));
        //3.把k-y显示控制台
//        prop.list(System.out);
        //4.根据一个key获取对应的值
        System.out.println(prop.getProperty("ip"));
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
    }
}
