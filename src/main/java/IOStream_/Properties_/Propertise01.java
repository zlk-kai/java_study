package IOStream_.Properties_;

import java.io.*;

public class Propertise01 {
    public static void main(String[] args) throws Exception {
        String path1 = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Properties_\\mysql.properties";
        String path2 = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Properties_\\mysql1.properties";

        //读取mysql.propertie文件，并获得ip,user,password
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] str = line.split("=");
                bufferedWriter.write(str[0]+"="+str[1]);
                bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();

    }
}
