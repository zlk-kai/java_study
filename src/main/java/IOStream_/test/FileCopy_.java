package IOStream_.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
@SuppressWarnings("all")
public class FileCopy_ {
    public static void main(String[] args) throws IOException {
        //完成文件拷贝
        //1.创建文件的输入流，将文件读入到程序
        String inputpath = "D:\\瑶瑶的文件\\新建文件夹\\焦化环境图片\\DJI_0017 - frame at 0m1s.jpg";
        //2.创建文件的输出流，将读取的文件输入到指定的位置
        String outputpath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\test\\1.jpg";
        byte[] buf = new byte[1024];
        int readlen = 0;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        fis = new FileInputStream(inputpath);
        fos = new FileOutputStream(outputpath);
        while((readlen = fis.read(buf)) != -1) {
            System.out.println(readlen);
            fos.write(buf, 0, readlen);
        }
        fos.flush();//刷新
        fos.close();
        fis.close();


    }
}
