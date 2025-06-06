package java_Basics.IOStream_.Transformation_;

import java.io.*;

public class InputStreamReader_OutputStreamReader {

    public static void main(String[] args)  throws IOException {
        String filepath1  = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Transformation_\\test03.txt";
        String filepath2  = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Transformation_\\test03.txt";

        outputStreamReader01(filepath2);
        inputStreamReader01(filepath1);

    }
    public static void inputStreamReader01(String filepath1 ) throws IOException {
        //1.把FileInputStream转换成 InputStramReader
        //2.指定编码 gbk
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath1), "gbk"));
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
//        char[] buf = new char[1024];
//        int len;
//        while ((len = reader.read(buf)) != -1) {
//            System.out.print(new String(buf, 0, len));
//        }
//        reader.close();
        br.close();
    }

    public static void outputStreamReader01(String filepath2) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filepath2), "gbk");
        outputStreamWriter.write("张林凯");
        outputStreamWriter.close();
    }

}
