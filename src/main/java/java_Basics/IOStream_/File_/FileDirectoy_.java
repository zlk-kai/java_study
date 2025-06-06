package java_Basics.IOStream_.File_;

import java.io.File;
import java.io.IOException;

/**
 * 目录操作
 */
public class FileDirectoy_{
    public static void main(String[] args) throws IOException {
        m1();
        m2();
    }
    //判断文件是否存在，如果存在则删除
    public static void m1() throws IOException {
        String filepath = "/Users/zlk/Develop/java_study/src/main/java/java_Basics.IOStream_/File_/txt03.text";
        File file = new File(filepath);
        if(file.exists()){
            if(file.delete()){
                System.out.println(filepath +"删除成功！！");
            }else {
                System.out.println(filepath +"删除失败！！");
            }
        }else {
            if (file.createNewFile()){
                System.out.println(filepath +"创建成功！！");
            }else {
                System.out.println(filepath +"创建失败！！");
            }
        }
    }
    //判断目录是否存在，存在就删除不存在就创建
    public static void m2(){
        String filepath = "/Users/zlk/Develop/java_study/src/main/java/java_Basics.IOStream_/File_/zlk/a/b/c";
        File file = new File(filepath);
        if(file.exists()){
            if(file.delete()){
                System.out.println(filepath +"删除成功！！");
            }else {
                System.out.println(filepath +"删除失败！！");
            }
        }else {
            //创建一级目录mkdir(),创建多级目录mkdirs();
            if(file.mkdirs()){
                System.out.println(filepath +"创建成功！！");
            }else {
                System.out.println(filepath +"创建失败！！");
            }
        }
    }
}
