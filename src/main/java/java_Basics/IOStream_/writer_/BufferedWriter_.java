package java_Basics.IOStream_.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;



@SuppressWarnings("all")
public class BufferedWriter_ {
    public static void main(String[] args) throws Exception{
        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\writer_\\test01.txt";
        bufferwriter01(filepath);
    }

    public static void bufferwriter01(String filepath) throws Exception{
        //创建一个BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath,true));//追加
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello1,张林凯学java");
        bufferedWriter.newLine();//插入一个和系统相关的换行符
        bufferedWriter.write("hello2,张林凯学java");
        bufferedWriter.newLine();
        bufferedWriter.write("hello3,张林凯学java");

        //关闭外层流即可，传入的new FileWriter(filepath)会在底层关闭
        bufferedWriter.close();
    }
}
