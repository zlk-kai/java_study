package java_Basics.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
@SuppressWarnings("all")
public class Reflection02 {
    public static void main(String[] args) throws Exception {

        m1();
        m2();
        m3();

    }
    //传统方法调用hi
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0;i < 90000000;i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1方法耗时"+(end - start));
    }

    //反射机制调用方法h1
    public static void m2() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("com.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        //hi.setAccessible(true);//在反射调用时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0;i < 90000000;i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2方法耗时"+(end - start));
    }
    //反射调用优化+关闭访问检查
    public static void m3() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class cls = Class.forName("com.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0;i < 90000000;i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2方法耗时"+(end - start));
    }
}