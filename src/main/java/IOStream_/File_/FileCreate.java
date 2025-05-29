package IOStream_.File_;

import java.io.File;
import java.io.IOException;
/**
 * 创建文件方式
 */
@SuppressWarnings("all")
public class FileCreate {
    public static void main(String[] args) {
        create01();
        create02();
        create03();
    }
    //1.创建文件
    public static void create01(){
        String filepath = "/Users/zlk/Develop/java_study/src/main/java/IOStream_/File_/test01.text";
        File file1 = new File(filepath);
        try {
            file1.createNewFile();
            System.out.println("文件创建成功！");
            file1.delete();
            System.out.println("删除文件成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //2.创建文件，组合文件路径
    public static void create02(){
        File file = new File("/Users/zlk/Develop/java_study/src/main/java/IOStream_/File_");
        String filename = "test02.txt";
        //组合文件路径，传入两个对象参数
        File file2 = new File(file, filename);
        try {
            file2.createNewFile();
            System.out.println("创建02文件成功");
            file2.delete();
            System.out.println("删除文件成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //3.根据父目录+子目录构建
    public static void create03(){
        String parentPath = "/Users/zlk/Develop/java_study";
        String childPath = "";
        String filename = "/src/main/java/IOStream_/File_/test03.text";
        File file3 = new File(parentPath, filename);
        try {
            file3.createNewFile();
            System.out.println("创建03文件成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
