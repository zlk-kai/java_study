package IOStream_.inputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

@SuppressWarnings("all")
public class ObjectInputStream_ {
    public static void main(String[] args) throws Exception {
        String filrpath = "D:\\Develop\\IdeaProjects\\java_study\\src\\main\\java\\IOStream_\\Outputstream\\data.bat";
        objectInputStream01(filrpath);
    }

    public static void objectInputStream01(String filrpath) throws Exception {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filrpath));

        String data = (String) objectInputStream.readObject();
        System.out.println(data);
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());

        objectInputStream.close();
    }
}
