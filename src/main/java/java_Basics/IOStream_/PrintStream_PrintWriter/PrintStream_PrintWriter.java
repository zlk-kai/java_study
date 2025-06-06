package java_Basics.IOStream_.PrintStream_PrintWriter;

import java.io.*;

public class PrintStream_PrintWriter {
    public static void main(String[] args) throws IOException {
        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\PrintStream_PrintWriter\\test03.txt";

        printStream(filepath);
//        printWriter(filepath);
    }
    //字节打印流
    public static void printStream(String filepath) throws IOException {
        PrintStream ps = System.out;
        //在默认情况下，输出数据位置是标准输出，即显示器
        ps.println(filepath);
        ps.write(filepath.getBytes());
        System.setOut(new PrintStream(new FileOutputStream(filepath, true)));
        System.out.print("瑶瑶");
        ps.close();
    }

    //字符打印流
    public static void printWriter(String filepath) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(filepath,true));
        printWriter.println("hi,beijing");
        printWriter.close();
    }
}
