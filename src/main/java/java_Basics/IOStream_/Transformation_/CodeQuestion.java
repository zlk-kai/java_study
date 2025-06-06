package java_Basics.IOStream_.Transformation_;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 中文乱码问题
 */
public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取文件到程序
        //1.创建字输入流 BufferedReader[处理流]
        //2.使用BufferedRedaer 对象读取文件

        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Transformation_\\test01.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filepath), StandardCharsets.UTF_8);
        String line = String.valueOf(isr.read());
        System.out.println(line);
        isr.close();
    }
}
