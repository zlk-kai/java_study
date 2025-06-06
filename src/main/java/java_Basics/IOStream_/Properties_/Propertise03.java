package java_Basics.IOStream_.Properties_;

import java.io.FileOutputStream;
import java.util.Properties;

public class Propertise03 {
    public static void main(String[] args) throws Exception {
        String filepath ="D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Properties_\\mysq2.properties";
       //使用properties类来读取mysql.properties文件
        //1.创建properties对象
        Properties prop = new Properties();
        //2.加载指定配置文件
        prop.setProperty("username", "张林凯");
        prop.setProperty("password", "root");
        prop.setProperty("ip", "192.168.1.1");
        prop.store(new FileOutputStream(filepath),"创建了文件");//null代表注释，进行解释
        System.out.println("保存成功");


    }
}
