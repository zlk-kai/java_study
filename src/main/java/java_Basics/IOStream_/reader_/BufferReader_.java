package java_Basics.IOStream_.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader_ {
    public static void main(String[] args) throws Exception{
        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\reader_\\test01.txt";
        bufferReader01(filepath);
    }

    public static void bufferReader01( String filepath) throws Exception{
        //创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
        //读取
        String line = null;
        //说明
        //1.bufferedReader.readLine(){}是按行读取文件
        //2.当返回一个空时，表示文件读取完毕
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
