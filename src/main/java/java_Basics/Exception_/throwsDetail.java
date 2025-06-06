package java_Basics.Exception_;

/**
 * @author 张林凯
 * @version 1.0
 */
public class throwsDetail {
    public static void main(String[] args) throws Exception {
        f2();
    }
    //throws 关键字，异常
    public static void f2() throws Exception{
        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }
}

//父类抛出异常应等于或高于子类异常，不予许低于异常

class Father{//父类
    public void method() throws Exception{}
}

class Son extends Father{//子类
    @Override
    public void method() throws RuntimeException{}
}
