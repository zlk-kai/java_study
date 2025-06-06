package java_Basics.IOStream_.Outputstream;

import java.io.*;

@SuppressWarnings("all")
public class BUfferedCopy_ {
    public static void main(String[] args)throws IOException {
        String inputfile = "Z:\\SONE-762-C.mp4";
        String outputfile = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Outputstream\\1.mp4";
        bufferedCopy01(inputfile, outputfile);
    }
    public static void bufferedCopy01(String inputfile,String outputfile) throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        bis = new BufferedInputStream(new FileInputStream(inputfile));
        bos = new BufferedOutputStream(new FileOutputStream(outputfile));
        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf, 0, len);
            System.out.println(len);
        }
        bis.close();
        bos.close();
    }
}
