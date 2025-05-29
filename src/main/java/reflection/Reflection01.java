package reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings("all")
public class Reflection01 {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        //1.使用Properties类，可以读写配置文件
        properties.load(new FileInputStream("src/main/java/reflection/re.properties"));
        String classfullpath = properties.get("chassfullpath").toString();
        String method = properties.get("method").toString();
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
        //得到name字段
        Field name = cls.getField("age");//不能得到私有的属性
        System.out.println(name.get(o));//反射：成员变量.get(对象)
        //得到构造器java.lang.reflect.Constructor；代表类的构造方法。Constructor对象表示构造器
        Constructor constructor = cls.getConstructor();//()中可以指定够造器参数类型，返回无参构造器；
        System.out.println(constructor);
        //有参数的构造器
        Constructor<?> constructor1 = cls.getConstructor(String.class, int.class);
        System.out.println(constructor1);
    }
}
