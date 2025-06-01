package IOStream_.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("all")
public class FileReader_ {
    public static void main(String[] args) throws Exception {
        String fileName = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\reader_\\test01.txt";
        //readFile01(fileName);
        readFile02(fileName);
    }

    public static void readFile01(String fileName) throws Exception {
        //1.创建一个FileReader对象
        FileReader fr = null;

        int  data = 0;
        try {
            fr = new FileReader(fileName);
            //使用循环 使用read,单个字符读取
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fr.close();
        }
    }
    public static void readFile02(String fileName) throws Exception {
        //1.创建一个FileReader对象
        FileReader fr = null;
        int  datalen = 0;
        char[] buf = new char[1024];
        try {
            fr = new FileReader(fileName);
            //使用循环 使用read,单个字符读取
            while ((datalen = fr.read(buf)) != -1){
                System.out.print(new String(buf,0,datalen));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fr.close();
        }
    }
}
