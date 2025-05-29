package reflection.question;


import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;

@SuppressWarnings("all")
//反射问题的引入
public class ReflectionQuestion {
    public static void main(String[] args) {
        //根据配置文件指定信息
        //传统方法创建对象
//        Cat cat = new Cat();
//        cat.hi();
//        System.out.println(cat.getName());
        //使用Properties类，可以读写配置文件

        Properties properties = new Properties();
        try {
            //1.使用Properties类，可以读写配置文件
            properties.load(new FileInputStream("src/main/java/reflection/re.properties"));
            String classfullpath = properties.get("chassfullpath").toString();
            String method = properties.get("method").toString();
            System.out.println(classfullpath+"---"+method);
            //2.创建文件
            //3.使用反射机制解决
            //(1)加载类，返回Class类型的对象cls
            Class<?> cls = Class.forName(classfullpath);
            //(2)通过cls得到你加载类的对象实例
            Object o = cls.newInstance();
            System.out.println(o.getClass().getName());
            //(3)通过cls得到你加载类的方法对象
            Method method1 = cls.getMethod(method);
            //(4)通过method1调用方法：通过方法对象来实现调用方法
            System.out.println("==============r");
            method1.invoke(o);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
