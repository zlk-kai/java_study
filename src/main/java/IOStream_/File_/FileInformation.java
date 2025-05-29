package IOStream_.File_;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        info();
    }
    //获取文件信息
    public static void info(){
        //先创建文件对象
        File file = new File("/Users/zlk/Develop/java_study/src/main/java/IOStream_/File_/test03.txt");
        //调用相应方法，得到对应信息
        System.out.println("文件名称:"+file.getName());
        //文件操作的一些方法
        System.out.println("绝对路径:"+file.getAbsolutePath());
        System.out.println("父级目录:"+file.getParent());
        System.out.println("文件大小(字节):"+file.length());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("是否是一个文件："+file.isFile());
        System.out.println("是否是一个目录："+file.isDirectory());
    }
}
