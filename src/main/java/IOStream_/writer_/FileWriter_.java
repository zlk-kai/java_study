package IOStream_.writer_;

import java.io.FileWriter;

@SuppressWarnings("all")
public class FileWriter_ {
    public static void main(String[] args) throws Exception{
        String filepath01 = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\test\\test03.txt";

        String filepath02 = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\writer_\\test01.txt";
        filewriter01(filepath01,filepath02);
    }

    public static void filewriter01(String filepath01 , String filepath02) throws Exception{
        //声明一个对象
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        int charlen = 0;
        try {
            fileWriter = new FileWriter(filepath02);
            //1.write(int)：写入单个字符
            fileWriter.write("H");
            //2.write(char[]):写入指定数组
            fileWriter.write(chars);
            //3.write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("张林凯学习java".toCharArray(),0,"张林凯学习java".toCharArray().length);
            //4.write(string):写入整个字符串
            fileWriter.write("zhanglinkaixuexijava");
            //5.write(string,off,len):写入字符串的指定部分
            fileWriter.write("<UNK>",0,"<UNK>".length());
            //在数据量大的情况下可以循环操作
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            //对于对象一定要关闭流，或者flush，才能真正的把数据写入到文件
            //fileWriter.close();
            //fileWriter.flush();
            fileWriter.close();
        }

        System.out.println("jieshu");

    }
}
