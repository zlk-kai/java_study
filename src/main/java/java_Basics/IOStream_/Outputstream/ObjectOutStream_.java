package java_Basics.IOStream_.Outputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings("all")
public class ObjectOutStream_ {

    public static void main(String args[]) throws Exception {
        //序列化后保存文件格式不是纯文本，而是按照他的格式来保存的
        String filepath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Outputstream\\data.bat";
        objectOutStream01(filepath);
    }

    public static void objectOutStream01(String filepath ) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
        //序列化数据
        oos.writeObject(new String("Hello World1"));
        oos.writeObject(new String("Hello World2"));
        oos.writeObject(new String("Hello World3"));
        oos.writeObject(new String("Hello World4"));
        oos.close();

    }
}
