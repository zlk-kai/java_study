package java_Basics.IOStream_.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 常用的InputStream子类
 *
 */
@SuppressWarnings("all")
public class FileInputStream_ {
    public static void main(String[] args) throws IOException {
        //readFile();
        readFile2();
    }

    public static void readFile() throws IOException {
        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\File_\\test03.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        //用于读取文件
        try {
            fileInputStream = new FileInputStream(filepath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。
            //如何返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1 ){
                System.out.println((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭文件，释放资源
            fileInputStream.close();
        }
    }

    public static void readFile2() throws IOException {
        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\File_\\test03.txt";
        int readData = 0;
        byte[] buf = new byte[1024];//一次读取1024个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filepath);
            //如果读取正常，返回实际读取的字节数
            while (( readLen  = fileInputStream.read(buf)) != -1 ){
                new String(buf,0,readLen);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            fileInputStream.close();
        }

    }
}
