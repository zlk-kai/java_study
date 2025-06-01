package IOStream_.writer_;

import java.io.*;
/**
 * 不要操作二进制文件，使用后可能损坏
 */
@SuppressWarnings("all")
public class BufferedCopy_ {
    public static void main(String[] args) throws IOException {
        String strpathfrom = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\test\\FileCopy_.java";
        String strpathto = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\writer_\\FileCopy_.java";
        bufferedcopy01(strpathfrom,strpathto);
    }
    public static void bufferedcopy01(String strpathfrom, String strpathto) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line = "";
        br = new BufferedReader(new FileReader(strpathfrom));
        bw = new BufferedWriter(new FileWriter(strpathto));
        //读取
        while ((line = br.readLine()) != null) {
            //每读取一行就写入
            bw.write(line);
            //换行
            bw.newLine();
        }
        br.close();
        bw.close();
        System.out.println("拷贝完毕");
    }
}
